
package guia3ej8;

import java.util.Scanner;


public class Guia3Ej8 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("tamaño del cuadrado");
        num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1) {
                    System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
   
}
