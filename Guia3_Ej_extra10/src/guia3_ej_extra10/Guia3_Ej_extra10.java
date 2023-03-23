/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados
aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la 
respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.
 */
package guia3_ej_extra10;

import java.util.Scanner;

public class Guia3_Ej_extra10 {

       public static void main(String[] args) {
        int num1, num2=(int)(Math.random()*10) ;
           System.out.println(num2);
           Scanner leer = new Scanner(System.in);
           do { System.out.println("Adivine el  nro entre 1 y 10 !!!! ");              
               num1=leer.nextInt();
               if (num1==num2) {
                   System.out.println("Felicitaciones!!!! el nro es correcto...");
                }
               else{
                   System.out.println("Lo siento, nro equivocado....");
                   System.out.println("");
               
               }
           } while (num1!=num2);
           
    }
    
}
