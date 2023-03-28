
package guia5_extra2;

import com.sun.javafx.geom.Vec2d;
import java.util.Scanner;


public class Guia5_extra2 {

    /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
    Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int[10];
        rellenarVector(vector);
        imprimirVector(vector);
    }
     public static void rellenarVector(int vec[]) {
         for (int i = 0; i < 10; i++) {
             vec [i]= (int)(Math.random()*10); 
         }
        
    }
     public static void imprimirVector(int vec[]) {
         for (int i = 0; i < 10; i++) {
             System.out.print(" [ "+vec [i]+ " ]"); 
         }
         System.out.println("");
    }
}
