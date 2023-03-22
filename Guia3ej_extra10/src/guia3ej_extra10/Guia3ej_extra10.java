/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ej_extra10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia3ej_extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
       int n1 = (int)(Math.random() * 10), n2 = (int)(Math.random() * 10); /* [0.0 , 1.0) */  
        int rta;
        System.out.println("Rta = " + (n1*n2));
       do{
        System.out.println("Intente adivinar el resultado de la mult");
        rta = leer.nextInt();
        if(rta == n1*n2){
            System.out.println("Bien ahí master");
        }else{
            System.out.println("Intento incorrecto.");
            if(rta < n1*n2){
                System.out.println("El resultado es mayor");
            } else {
                System.out.println("El resultado es menor");
            }
        }
       }while(rta!=n1*n2);
       
    }


}
