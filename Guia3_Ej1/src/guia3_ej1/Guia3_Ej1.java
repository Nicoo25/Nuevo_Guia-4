
package guia3_ej1;

import java.util.Scanner;

public class Guia3_Ej1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un nro");
        num = leer.nextInt();
        
        if (num%2 == 0) {
        System.out.println("El nro es par");
        }
        else System.out.println("El nro no es par");  
            
    }
    
}
