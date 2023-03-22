/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia4_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int cant;
        String mone;
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de Euros...");
        cant = leer.nextInt();
        System.out.println("=== Ingrese una opcion para convertir ==== ");
       
        System.out.println("  Dolar. ");
       
        System.out.println("  Yenes. ");
       
        System.out.println("  Libras. ");
       
        mone = leer.next();
       
        System.out.println("" + mone);
        convertir(cant, mone);
       
       
       
    }

    public static void convertir(int cant, String money) {
        switch (money) {
            case "dolar":
                System.out.println("La cantidad es U$s " + (cant * 1.28611) + ".");
                break;
            case "yenes":
                System.out.println("La cantidad es Yenes " + (cant * 129.852) + ".");
                break;
            case "libras":
                System.out.println("La cantidad es Libras " + (cant * 0.86) + ".");
                break;
        }
    }
}
    
    

