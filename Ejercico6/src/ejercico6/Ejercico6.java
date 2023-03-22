/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros x teclado");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1>=26 && num2 >=26){
            System.out.println("Ambos Numeros Son Mayores a 25.");
         }
        if (num1>=26 && num2 <=25){
            System.out.println( num1 + " es Mayor a 25.");
         }
        if (num1<=25 && num2 >=26){
            System.out.println(num2 + " es Mayor a 25.");
         }
        if (num1<=25 && num2 <=25){
            System.out.println("Ninguno es mayor a 25.");
         }
    }
    
}
