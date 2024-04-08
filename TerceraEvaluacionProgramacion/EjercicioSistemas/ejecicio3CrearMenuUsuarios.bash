menu(){
echo "
-------------------------------------------------------------------
1.CUENTA USUARIOS CONECTADOS
2.CUENTA USUARIOS CON DIRECTORIO HOME Y LOS ALMACENA EN all.users,
3.LISTA CUENTAS DE USUARIOS ORDENADOR POR NOMBRE E ID
4.DIA MES AÑO EN VARIABLE MOSTRADA EN PANTALLA
5.CAMBIA A MAYÚSCULAS LOS NOMBRES DE FICHEROS PASADOS POR PARÁMETRO
-------------------------------------------------------------------
"
}
uno(){
echo "El número de usuarios conectados es: ";users | wc -w
}
dos(){
echo "El número de usuarios con directorio home es: ";ls /home | wc -l
#almacenamiento de usuarios en allusers
ls /home > allusers
echo "comprobación de allusers"
cat allusers
}
tres(){
echo "---Cuentas de usuarios ordenadas por nombre:--- "
cat /etc/passwd | cut -d: -f1,3 | sort -t: -k1
echo "---Cuentas de usuarios ordenadas por id: "
cat /etc/passwd | cut -d: -f1,3 | sort -t: -k2 -n
}
cuatro(){
echo "Dia-més-año: "`date +%d-%m-%Y`
}
cinco(){
#comprobación de parámetros
if [ $# -ne 0 ];then
for i in $*;do
if [ -f $i ];then # los ficheros son del directorio de trabajo
#traducción del nombre
nuevo=`echo "$i" | tr [:lower:] [:upper:]`
#sustitución del archivo
mv $i $nuevo
echo "Comprobación de cambio de nombres de ficheros"
ls | grep $nuevo
else
echo "El parámetro $i no es fichero"
fi
done
else
echo "No ha introducido nombres de ficheros a cambiar el nombre"
fi
}
#PROGRAMA PRINCIPAL
#llamadas a funciones usando menú y eligiendo opciones de menú
while true;do #repite menú mientras introduce opción válida
menu
read -p "Introduce opción del menú anterior: " opc
case $opc in
1)clear;uno;;
2)clear;dos;;
3)clear;tres;;
4)clear;cuatro;;
5)clear;cinco $@;;
*)echo "Ha introducido una opción no válida";break;;
esac
done