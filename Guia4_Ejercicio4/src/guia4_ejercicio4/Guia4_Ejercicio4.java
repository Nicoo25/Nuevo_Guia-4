/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Ingrese un nro por teclado para saber si es primo ");
        num = leer.nextDouble();
        System.out.println("Numero primo: " + primo(num));
    }
   
    public static boolean primo(double nro){
        Boolean resp=true;
        for (double i=2; i < nro; i++) {
           // aux=nro%i;
            if(nro%i==0){
                //cont++;
                resp=false;
            }
        }
    return (resp);
    }
    }
    

