# build-and-run.ps1
# Script para compilar y ejecutar el proyecto Java Racionales en PowerShell.
# Uso: .\build-and-run.ps1 [args]
#        sin args: compila y ejecuta app.Main; envía '0' por defecto para salir.

param(
    [string[]]$Args
)

function Abort($msg) { Write-Host $msg; exit 1 }

# Comprobar javac y java
if (-not (Get-Command javac -ErrorAction SilentlyContinue)) {
    Abort "ERROR: 'javac' no está disponible en PATH. Instala JDK o ajusta JAVA_HOME/PATH. Ejecuta 'java -version' para verificar."
}
if (-not (Get-Command java -ErrorAction SilentlyContinue)) {
    Abort "ERROR: 'java' no está disponible en PATH. Instala JDK o ajusta JAVA_HOME/PATH. Ejecuta 'java -version' para verificar."
}

# Crear carpeta out
$outDir = Join-Path -Path (Get-Location) -ChildPath 'out'
if (-not (Test-Path $outDir)) { New-Item -ItemType Directory -Path $outDir | Out-Null }

# Compilar todos los .java en src
$javaFiles = Get-ChildItem -Path src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
if ($javaFiles.Count -eq 0) { Abort "No se encontraron archivos .java en src." }

Write-Host "Compilando ${($javaFiles.Count)} archivos..."
$javacArgs = @('-d', $outDir) + $javaFiles
$proc = Start-Process -FilePath javac -ArgumentList $javacArgs -NoNewWindow -Wait -PassThru -ErrorAction SilentlyContinue
if ($proc.ExitCode -ne 0) { Abort "javac finalizó con código $($proc.ExitCode). Revisa errores de compilación." }

Write-Host '---COMPILACIÓN EXITOSA---'

# Ejecutar app.Main, enviar '0' si no se pasan args
$input = if ($Args -and $Args.Length -gt 0) { $Args } else { @('0') }
Write-Host "Ejecutando app.Main (se enviará: $($input -join ' '))"
$inputStr = ($input -join "`n") + "`n"

$startInfo = New-Object System.Diagnostics.ProcessStartInfo
$startInfo.FileName = 'java'
$startInfo.Arguments = "-cp out app.Main"
$startInfo.RedirectStandardInput = $true
$startInfo.RedirectStandardOutput = $false
$startInfo.UseShellExecute = $false
$process = [System.Diagnostics.Process]::Start($startInfo)
$process.StandardInput.Write($inputStr)
$process.StandardInput.Close()
$process.WaitForExit()

Write-Host "app.Main finalizó con código $($process.ExitCode)"

