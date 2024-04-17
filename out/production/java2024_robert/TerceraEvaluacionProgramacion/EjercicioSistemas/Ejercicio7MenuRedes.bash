********************************************************************************
EJERCICIO 7 : MENÚ REDES: 1) Hacer ping 2) Consultar IP 3) Añadir ip 4) Cambiar máscara
0) Salir
menu(){
 echo "-------------------------------------
 1) Hacer ping 
 2) Consultar IP 
 3) Añadir IP 
 4) Cambiar máscara 
 0) Salir
 -------------------------------------------
 "
}
uno(){
 clear;echo "Hacer ping"
 read -p "Introduce la ip a la que quieres conectar " direc
 ping -c3 $direc
}
dos(){
 clear; echo "Consultar IP"
 read -p "Introduce la ip a la que quieres consultar " direc
 encontrado=`ip address show | grep $direc`
 if [ "$encontrado" != "" ];then
 echo $encontrado
 else
 echo "$direc no se ha encontrado"
 fi
}
tres(){
 clear;echo "Añadir IP"
 #supongo que no existe
 #faltan las comprobaciones en una función externa
 #si se desea cambiar habría que eliminar y después añadir con los mismos datos menos el
que se desea modificar
 read -p "Introduce la interfaz " disp
 read -p "Introduce la ip a la que quieres añadir " direc
 read -p "Introduce la máscara para la ip en formato abreviado sin /" mas
 read -p "Introduce el broadcast " bro
 sudo ip address add $direc/$mas broadcast $bro dev $disp
}
cuatro(){
 clear; echo "Cambiar máscara"
 read -p "Introduce la interfaz a modificar " disp #dispositivo
 read -p "Introduce la ip a modificar" direc
 read -p "Introduce máscara anterior en formato abreviado /nº " mas1
 sudo ip address del $direc/$mas1 dev $disp
 read -p "Introduce nueva máscara en formato abreviado /nº " mas2
 read -p "Introduce el nuevo broadcast " bro
 sudo ip address add $direc/$mas2 broadcast $bro dev $disp
}
while true;do
 menu
 read -p "Elige opción del menú anterior " resp
 case $resp in
 1) uno;;
 2) dos;;
 3) tres;;
 4) cuatro;;
 0) exit;;
 *)echo "$resp no es opción válida";exit;;
 esac
done