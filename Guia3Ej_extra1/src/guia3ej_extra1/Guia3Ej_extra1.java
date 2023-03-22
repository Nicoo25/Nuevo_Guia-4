/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
el sistema debe calcular su equivalente: 1 día, 2 horas. */
package guia3ej_extra1;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Guia3Ej_extra1 {

     public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         double minutos, horas, dias;
         System.out.println("Ingrese la cantidad de minutos ");
         minutos = leer.nextDouble();
        horas = minutos/60;
        dias= horas/24;
        minutos = 60*(horas-Math.abs(horas)); 
         System.out.println("Dias : " + dias + " horas : " + horas%24 + " minutos: " + minutos); 
     }
                 
    }
    

