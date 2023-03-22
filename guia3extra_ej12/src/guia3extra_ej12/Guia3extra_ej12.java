/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra_ej12;

/**
 *
 * @author User
 */
public class Guia3extra_ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herefor (int i = 0; i <= 99; i++) {
            
         for (int i = 0; i <= 99; i++)
         
         {if (i<=9 && i==3) {                                         
              System.out.println("0 - 0 - E");  
                  
            }
            
            
            if(i<=9 && i!=3){
                System.out.println("0 - 0 - " + i);
                
            }
            
            if (i>=10 && i<=99) {
                
                if ((i%10)*10==3) {
                    System.out.println("0 - " + Math.abs(i/10) + " - E ");
                    
                }
                
                
                if (Math.abs(i/10)==3 && (i%100)*10!=3) {
                    System.out.println("0 - E - " + i%10);
                    
                }
                
                 if (Math.abs(i/10)==3 && (i%100)*10==3) {
                    System.out.println("0 - E - E ");
                    
                }
                 if (Math.abs(i/10)!=3 && (i%100)*10!=3) {
                    System.out.println("0 - " + Math.abs(i/10) + i%10);
                    
                }
            }
            
            
               
           
         }}}
          
            
        
        
    
    
    

