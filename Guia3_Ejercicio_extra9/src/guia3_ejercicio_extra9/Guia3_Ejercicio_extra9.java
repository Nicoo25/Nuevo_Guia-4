/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejercicio_extra9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia3_Ejercicio_extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, cont=0;
        System.out.println("Ingrese dos nros por teclado(Numerador y denominador)");   
        num1= leer.nextInt();
        num2= leer.nextInt();
        if (num1>num2 && num2!=0) {
            do {  
                num1=num1-num2;
                cont++;
                
            } while (num1>num2);
            System.out.println("El resultado de la division es " +cont+ " y el resto es " + num1 );
        }
        else { System.out.println("El Numerador No es mayor que el denominador, o este ultimo es 0");
                    }
        
    }
    
}
