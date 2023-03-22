/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ej12;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia4ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double num1,num2;
        
        Scanner miEscan=new Scanner (System.in);
         
        System.out.println("Ingrese dos numeros");
        num1=miEscan.nextDouble();
        num2=miEscan.nextDouble();
        multi(num1, num2);
    }
    
    public static void multi(double numero1, double numero2){
        
        double resultado=numero1%numero2;
        
        if (resultado==0) {
            
            System.out.println("El primer numero es multiplo del segundo");
            
            
            
        }else{
        
            System.out.println("El primer numero no es multiplo del segundo");
        
        }
                
    
    }
}
    
    


