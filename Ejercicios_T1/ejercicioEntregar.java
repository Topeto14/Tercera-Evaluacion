public class ejercicioEntregar {
    public static void main(String[] args) {
        
       /**  1. Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:
// a. (A * C) % C                           El resultado es 0
// b. A * B / C                             El resultado es 4
// c. C % B + C * B                         El resultado es 7   
// d. A % ( A * B * C / (B + C) )           El resultado es 7
// e. B * B + C – B * (A % B )              El resultado es 4
*/

/**2. ¿Cuáles son los valores de a y b después de ejecutar las siguientes instrucciones?
a = 3;
b = 4;
c = 2 * a * b;                              El resultado es 24  
a = a + 2;                                  El resultado es 5
b = c – a;                                  El resultado es 19
*/


/**3. Expresar las siguientes expresiones como condiciones lógicas.
a. a es mayor que 2                                     (a>2)
b. b es menor o igual que 25 pero mayor que 5           (b<=25) && (b>5)
c. c es mayor que 6 o igual a d                         (c>6) || (c==d)
d. e es par menor que 50                                ((e%2)==0) && (e<50)
e. f es mayor que a, b y c                              (f>a) && (f>b) && (f>c)
f. g es igual a 3, 4 ó 5                                (g==3) || (g==4) || (g==5) 
 */

 /**4. Decir si son verdaderas o falsas las siguientes expresiones:
a. (3<=7) && (7<=7)                         El resultado es True
b. !((–8>1) && (3<=4))                      El resultado es True
c. “Hola” == “Hola ”                        El resultado es False
d. ((2<=5) && (3>=6)) || (2>–1)             El resultado es True 
e. ((2<=5) || (3>=6)) && (2>–1)             El resultado es True 
  */


  /**5. Cumplimenta la siguiente tabla */
  // No funciona, porque hay que quitar las comillas y despues de quitar las comillas tampoco deja que a sea = a. Las letra a tiene que tener otro valor.  
  /**  int a=’a’;
    System.out.println(a);
  // No funciona, porque seria un double no un int.
    int PI=3.14;
    System.out.println(PI);    
  // Si funciona. En la pantalla me sale 3.14
    double PI=3,14;
    System.out.println(PI);
  // Si funciona. En la pantalla me sale false
    boolean adivina=(1==4);
    System.out.println(adivina);
  // No funciona porque da error en las comillas de la a ='a'. para que este bien se pondria (97=='a') && ('a'==97);
    boolean adivina=(97==’a’==97);
    System.out.println(adivina);  
  // No funciona. Para que funcione tienes que poner estas comillas''
    boolean adivina=(97==’a’==true);
    System.out.println(adivina);

  /**
   6. ¿Qué muestra por pantalla el siguiente programa?
public class Ejercicio5 {
public static void main(String[] args)
{
System.out.println("Hola usuario."+" Bienvenido.");
String dia = "Lunes";
System.out.println("Hoy es " + dia);
int hora = 12;
System.out.println("Son las " + hora + " en punto.");
System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");
System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");
}
}

Por pantalla muestra la siguiente frase 
Hola usuario. Bienvenido.
Hoy es Lunes
Son las 12 en punto.
Dentro de 2 horas serán las 122 en punto
Dentro de 2 horas serán las 14 en punto
 */  

 /** 7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.
class Suma {
public static void main(String [] args)
{
int n1=50,n2=30,
boolean suma=0;
suma=n1+n2;
System.out.println("LA SUMA ES: " + suma);
}
}
  */



 






    }
}
