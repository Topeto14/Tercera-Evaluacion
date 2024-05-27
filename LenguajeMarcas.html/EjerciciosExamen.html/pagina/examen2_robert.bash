#!/bin/bash

# Menú de opciones
echo "Menú de opciones:"
echo "1. Visualizar las particiones de todos los discos."
echo "2. Crear una partición lógica de tamaño 100MB."
echo "3. Formatear la partición anterior en sistema de ficheros ext4."
echo "4. Montar la partición en el directorio /datosExamen4"
echo "5. Crear un usuario, solicitando su nombre y comprobando si existe en el sistema."
echo "6. Visualizar procesos y servicios."

read -p "Selecciona una opción (1-6): " opcion

case $opcion in
    1)
        # Visualizar particiones de todos los discos
        fdisk -l
        ;;
    2)
        # Crear partición lógica de 100MB
        echo ';' | sfdisk /dev/sdX
        ;;
    3)
        # Formatear partición en ext4
        mkfs.ext4 /dev/sdX1
        ;;
    4)
        # Montar partición en /datosExamen4
        mkdir -p /datosExamen4
        mount /dev/sdX1 /datosExamen4
        ;;
    5)
        # Crear usuario
        read -p "Ingresa el nombre del usuario: " nombre_usuario
        id "$nombre_usuario" &>/dev/null
        if [ $? -eq 0 ]; then
            echo "El usuario $nombre_usuario ya existe."
        else
            useradd "$nombre_usuario"
            echo "Usuario $nombre_usuario creado correctamente."
        fi
        ;;
    6)
        # Visualizar procesos y servicios
        ps aux
        ;;
    *)
        echo "Opción inválida. Selecciona una opción del 1 al 6."
        ;;
esac
