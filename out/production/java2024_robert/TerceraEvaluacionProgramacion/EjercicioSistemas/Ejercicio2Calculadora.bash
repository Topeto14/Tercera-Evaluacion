#!/bin/bash
menu (){
echo "Elige opción del siguiente menú:"
echo "
1) suma
2) resta
3) producto
4) división
5) resto"
}
#perfecto con números enteros. Fallos con reales solucionado con ()
suma (){
resultado=`echo "($1)+($2)" | bc -l`
#resultado=$(($1+$2)) #sólo para enteros
}
resta(){
resultado=`echo "($1)-($2)" | bc -l`
#resultado=$(($1-$2))
}
producto(){
resultado=`echo "($1)*($2)" | bc -l`
#resultado=$(($1*$2))
}
division(){
if [ "$2" != "0" ];then #para reales -ne es para enteros
resultado=`echo "scale=2;($1)/($2)" | bc -l`
else
echo "División por 0"
fi
}
resto(){
if [ $2 -ne 0 ];then
resultado=$(($1%$2)) #sólo para enteros no para reales
else
echo "División por 0"
fi
}
#PROGRAMA PRINCIPAL
if [ $# -eq 2 ];then
#comprobación de números enteros y reales
echo $1 | egrep -q '^\-?[0-9 .,]+$'
if [ $? -ne 0 ];then
echo "El parámetro $1 no es número"
exit
fi
echo $2 | egrep -q '^\-?[0-9 .,]+$'
if [ $? -ne 0 ];then
echo "El parámetro $2 no es número"
exit
fi
echo "Se procede a realizar las operaciones que elijas del siguiente menú"
menu #llamada a funciónread -p "Introduce opción del menú: " resp
echo $resp | egrep -q '^?[0-9 .,]+$' #nos aseguramos números
while [ $? -eq 0 ] && [ $resp -ge 1 ];do
case $resp in
1)operacion=" + "; echo "Se va a realizar $operacion ";suma $1
2)operacion=" - ";echo "Se va a realizar $operacion ";resta $1
3)operacion=" * ";echo "Se va a realizar $operacion ";producto
4)operacion=" / ";echo "Se va a realizar $operacion ";division
5)operacion=" % ";echo "Se va a realizar $operacion ";resto $1
*)echo "opción $resp no válida y se termina";break;; #sale
esac
echo "$1 $operacion $2 = $resultado"
read -p "Introduce opción del menú: " resp
done
else
echo "Debe introducir 2 números"
fi