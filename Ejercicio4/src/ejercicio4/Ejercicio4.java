/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // F = 32 + (9 * C / 5).
     double grados, far;
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" Ingrese la temperatura en grados Celsius");
        
        grados = leer.nextDouble();
        far = 32 + (9 * grados /5);
        System.out.println(+ grados +" Grados C equivalen a " + far+ " Grados F ");
    }
    
}
