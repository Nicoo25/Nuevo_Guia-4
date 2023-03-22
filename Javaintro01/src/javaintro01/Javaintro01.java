/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Javaintro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Short num1 = 10;
        int num2 = 2000;
        long num3 = 50000;
        char letra;
        String palabra = "primero";
        boolean logico = true;
        double decimal = 4.5;
        int suma = num1 + num2;
        int resta = num2 - num1;
        System.out.println("La Suma es " + suma + " la resta es " + resta +"" ); 
    
        String nombre;
        int edad;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su Nombre");
        nombre = leer.next();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        System.out.println("Bienvenido " + nombre + ", su edad es " + edad + " años.!");
    }
    
}
