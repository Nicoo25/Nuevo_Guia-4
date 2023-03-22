/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ej3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia3Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase ");
        palabra = leer.nextLine();
        
        if (palabra.length()==8) {
        System.out.println("========  C O R R E C T O  =======");
        }
        else System.out.println("======== I N C O R R E C T O  =======");  
    
    }
    
}
