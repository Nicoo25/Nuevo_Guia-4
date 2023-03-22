/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nro;
        Scanner leer = new Scanner (System.in);
        
        System.out.println(" Ingrese un nro por teclado");
        
        nro = leer.nextInt();
        
        System.out.println("El doble de " + nro + " es " + (nro+nro) );
        System.out.println("El triple de " + nro + " es " + (nro*3) );
        System.out.println("La raiz cuadrada de " + nro + " es " + Math.sqrt(nro));
    }
    
}
