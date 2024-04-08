#!/bin/bash

# Comprobar si el usuario es root
if [ "$(id -u)" -ne 0 ]; then
    echo "Este script debe ejecutarse como root."
    exit 1
fi

# Función para visualizar particiones de todos los discos
visualizar_particiones() {
    fdisk -l
}

# Función para hacer ping a una IP de la red
hacer_ping() {
    read -p "Introduce la IP a la que hacer ping: " ip
    ping -c 4 "$ip"
}

# Función para visualizar la IP
visualizar_ip() {
    ip addr show
}

# Función para cambiar la IP
cambiar_ip() {
    read -p "Introduce la nueva IP: " nueva_ip
    ip addr add "$nueva_ip" dev eth0
    echo "IP cambiada a $nueva_ip"
}

# Main
while true; do
    echo "Menú de opciones:"
    echo "1. Visualizar particiones de discos"
    echo "2. Hacer ping a una IP"
    echo "3. Visualizar la IP"
    echo "4. Cambiar la IP"
    echo "5. Salir"
    read -p "Elige una opción (1-5): " opcion
    case "$opcion" in
        1) visualizar_particiones ;;
        2) hacer_ping ;;
        3) visualizar_ip ;;
        4) cambiar_ip ;;
        5) echo "Saliendo del programa. ¡Hasta luego!"; exit 0 ;;
        *) echo "Opción inválida. Inténtalo de nuevo." ;;
    esac
done