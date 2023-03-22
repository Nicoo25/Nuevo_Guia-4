
package guia3_ej2;

import java.util.Scanner;


public class Guia3_Ej2 {

    
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase ");
        palabra = leer.nextLine();
        
        if (palabra.equals("eureka")) {
        System.out.println("========  C O R R E C T O  =======");
        }
        else System.out.println("======== I N C O R R E C T O  =======");  
    }
    
}
