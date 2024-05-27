#!/bin/bash

# Comprobar si el usuario es root
if [[ $EUID -ne 0 ]]; then
    echo "Este script debe ejecutarse como root."
    exit 1
fi

# Comprobar que se proporcionó un directorio como argumento
if [[ $# -ne 1 ]]; then
    echo "Uso: $0 <directorio>"
    exit 1
fi

directorio="$1"

# Comprobar si el directorio existe o crearlo
if [[ ! -d "$directorio" ]]; then
    mkdir -p "$directorio"
    echo "Se creó el directorio $directorio."
fi

# Mostrar el camino absoluto del directorio
echo "Camino absoluto del directorio: $(realpath "$directorio")"

# Cambiar permisos al directorio (en octal)
chmod 755 "$directorio"

# Visualizar permisos
echo "Permisos antes del cambio:"
ls -ld "$directorio"

# Crear un fichero llamado fich1.txt en el directorio
echo "Soy tu nombre" > "$directorio/fich1.txt"

# Visualizar contenido del directorio recursivamente
echo "Contenido del directorio:"
find "$directorio" -type f

# Comprobaciones adicionales
permisos=$(stat -c %a "$directorio")
if [[ $permisos -ge 0 && $permisos -le 7 ]]; then
    echo "Los permisos están dentro del rango 0-7."
else
    echo "Los permisos no están dentro del rango 0-7."
fi
