
package guia3ej7;

import java.util.Scanner;


public class Guia3Ej7 {
 
   
    public static void main(String[] args) {
        String fde;
        int verd=0, falso=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Frases de maximo cinco carcteres, comenzar con X y culminar con O. ");
        
        do{
            System.out.println("Ingrese una frase");
            fde = leer.nextLine();
            if (fde.length()<=5 && fde.substring(0,1).equals("X")&& fde.substring(fde.length()-1,fde.length()).equals("O"))  {
             verd++;   
            }
            else {
                falso++;
            }
        }while (!fde.equals("&&&&&"));
        System.out.println("Las resp correctas fueron " + verd);
         System.out.println("Las resp incorrectas fueron " + (falso-1));
    }
    
}
