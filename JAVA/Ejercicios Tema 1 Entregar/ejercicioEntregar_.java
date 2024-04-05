public class ejercicioEntregar_ {
    
   
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
    
    
      /**5. Cumplimenta la siguiente tabla 
      // No funciona, porque hay que quitar las comillas y despues de quitar las comillas tampoco deja que a sea = a. Las letra a tiene que tener otro valor.  
        int a=’a’;
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

    Para que funcione hay que hacerle la siguiente modificación 
   
        int n1=50,n2=30;
        int suma=0;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
    }

    }
      */
    
    
      
    /**8. Modifica el siguiente programa para hacer que compile y funcione:
class Suma {
static int n1=50;
public static void main(String [] args)
{
int n2=30, suma=0, n3;
suma=n1+n2;
System.out.println("LA SUMA ES: " + suma);
suma=suma+n3;
System.out.println(suma);
}

Estas son las modificaciones necesarias para que funcione.

        int n1=50;
        int n2=30, suma=0, n3=1;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        suma=suma+n3;
        System.out.println(suma);
     
     */

     
     /**
      9. El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para que funcione.
class Cuadrado {
public static void main(String [] args)
{
 int numero=2,
 cuad=numero * número;
System.out.println("EL CUADRADO DE "+NUMERO+" ES: " + cuad);
}
}
La solucion para que funcione es esta: 
 int numero=2,
 cuad=numero * numero;
System.out.println("EL CUADRADO DE " + numero + " ES: " + cuad  );


      */

      
      /**
       10. ¿Qué mostrará el siguiente código por pantalla?
    int num=5;
    num += num - 1 * 4 + 1;
    System.out.println(num);
    num=4;
    num %= 7 * num % 3 * 5;
    System.out.println(num);

    Mostrara en la pantalla el numero 7 y el 4.
       */
    
    
     /**11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.

     double area, perimetro, radio;

     radio = 3.6;

     area = Math.PI * (radio * radio);
     perimetro = 2 * Math.PI * radio;

     System.out.println(" El area es " + area );
     System.out.println(" El perimetro es " + perimetro );

     */


     /**12. Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b.

    
     int a, b ;
     int temp;

     a = 5;
     b = 7;

      temp = b ; //El 7 lo guardamos en temp
      b = a ; //La b vale 5
      a = temp ; //A la variable a, le asignamos el valor de b que habíamos guardado en temp

      System.out.println(" La variable 'a' vale: " + a);
      System.out.println(" La variable 'b' vale: " + b);
     
    */

    //** 13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y 
    //    queremos conocer este tiempo, pero expresado en horas, minutos y segundos.
    
    // int t;
    //  int segundos, horas, minutos;

    // System.out.println(" Introduceme una cantidad de segundos para que te diga cuantas horas, minutos y segundos son ");
        // t = sc.nextInt();


        // horas = t / 3600  ;// 3661 / 3600 = 1 Hora
        // minutos = ((t - horas * 3600) / 60 ) ; // (3661 - 1 * 3600)= 61 <> (61)/60 = 1 minuto  
        // segundos =  t - (horas * 3600 + minutos * 60); //3661 - ( 1* 3600 + 1 * 60 ) = 1 segundo


    // System.out.println("La cantidad que has introducido " + t + " Son " + horas + " horas " + minutos +" minutos " + segundos + " segundos " );


    //**15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone 
        //2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le 
        //retendrá el 18% para hacienda.

     //   int euros;
     //   double resultado1,resultado2, resultado3,  simestral, anual, hacienda;
     //   euros = 2000;
     //   anual = 2.75;
     //   simestral = anual / 2;
     //   hacienda = 0.18 ;
        
     //   resultado1 = (euros * simestral); //2750€
     //   System.out.println("Esto es lo ha amortizado en el banco despues de seis meses " + resultado1 );

     //   resultado2 = (resultado1) * hacienda; // - 495€ 
     //   resultado3 = resultado1 - resultado2; //2750€ - 495€ =2255€

     //   System.out.println("Al pagarle ha hacienda tendra " + resultado3 );
    
    
    }
}







