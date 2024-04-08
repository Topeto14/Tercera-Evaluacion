#!/bin/bash

# Función para mostrar el menú
mostrar_menu() {
    echo "Menú de opciones:"
    echo "1. Mostrar contenido del fichero"
    echo "2. Cambiar permisos del directorio"
    echo "3. Mover el fichero a otro directorio"
    echo "4. Salir"
}

# Función para mostrar el contenido del fichero o crearlo si no existe
mostrar_contenido() {
    local fichero="$1"
    if [ -f "$fichero" ]; then
        cat "$fichero"
    else
        echo "El fichero no existe. Creando y añadiendo contenido..."
        echo "Contenido inicial" > "$fichero"
    fi
}

# Función para cambiar permisos del directorio
cambiar_permisos() {
    local directorio="$1"
    chmod 755 "$directorio"
    echo "Permisos cambiados:"
    ls -ld "$directorio"
}

# Función para mover el fichero a otro directorio
mover_fichero() {
    local fichero="$1"
    read -p "Introduce el directorio de destino: " destino
    mv "$fichero" "$destino"
    echo "Fichero movido a $destino"
}

# Main
fichero="$1"
if [ $# -ne 1 ]; then
    echo "Uso: $0 <fichero>"
    exit 1
fi

while true; do
    mostrar_menu
    read -p "Elige una opción (1-4): " opcion
    case "$opcion" in
        1) mostrar_contenido "$fichero" ;;
        2) cambiar_permisos "$fichero" ;;
        3) mover_fichero "$fichero" ;;
        4) echo "Saliendo del programa. ¡Hasta luego!"; exit 0 ;;
        *) echo "Opción inválida. Inténtalo de nuevo." ;;
    esac
done