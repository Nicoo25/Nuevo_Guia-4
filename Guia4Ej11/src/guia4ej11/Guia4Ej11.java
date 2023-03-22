/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ej11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia4Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner miEscan=new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        String Frase=miEscan.nextLine();
        codFrase(Frase);
    
        
        
    
    }
    public static void  codFrase( String Frase){
        
        String  a="@",e="#",i="$",o="%",u="*",letra;
        
       
        for (int j=0; j<Frase.length(); j++){
         
            letra=Frase.substring(j,j+1);
            
            switch (letra) {
                case "a": System.out.print(a);
                break;
                
                case "e": System.out.print(e);
                break;
                
                case "i": System.out.print(i);
                break;
                
                case "o": System.out.print(o);
                break;
                
                case "u": System.out.print(u);
                break;
                
                default:
                    System.out.print(letra);
            }
            
        }
       
        System.out.println("");
        
        
    
    }
}
    
    

