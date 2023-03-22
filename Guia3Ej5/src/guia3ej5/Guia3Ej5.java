/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ej5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia3Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
     int limite, suma=0, num;
        System.out.println("ingrese el numero limte");
        limite=leer.nextInt();
        do{
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            suma += num;
            System.out.println(suma);
        }while(suma<=limite);
    }
    
}
