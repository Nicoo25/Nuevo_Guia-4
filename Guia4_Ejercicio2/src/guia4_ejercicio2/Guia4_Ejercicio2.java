/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia4_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String opc;
        Scanner leer = new Scanner(System.in);
        do{
            mayorEdad();
            System.out.println("Desea ingresar más personas (Si/No)....");
            opc = leer.nextLine();
        }
        while (!opc.toLowerCase().equals("no")) ;
        System.out.println("========== Hasta Luego!!!===========");
        System.out.println("");
               
           
       

    }

    public static void mayorEdad() {
        int edad;
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Nombre");
        nombre = leer.nextLine();
        System.out.println(" Ingrese la edad de " + nombre);
        edad = leer.nextInt();
        if (edad >= 19) {
            System.out.println(nombre + " tiene " + edad + " años, es mayor de edad!!!! ");
        } else {
            System.out.println(nombre + " tiene " + edad + " años, es menor de edad!!! ");
        }

    }
}


    
    

