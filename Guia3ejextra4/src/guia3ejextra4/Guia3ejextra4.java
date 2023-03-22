
package guia3ejextra4;

import java.util.Scanner;


public class Guia3ejextra4 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un Nro entre 1 y 10. ");
        int num;
        num = leer.nextInt();
        switch(num){
            case 1: System.out.println("Su equivalente es I ");
            break;
            case 2 : System.out.println("Su equivalente es II ");
            break;
            case 3: System.out.println("Su equivalente es III ");
            break;
            case 4: System.out.println("Su equivalente es IV ");
            break;
            case 5: System.out.println("Su equivalente es V ");
            break;
            case 6: System.out.println("Su equivalente es VI ");
            break;
            case 7: System.out.println("Su equivalente es VII ");
            break;
            case 8 : System.out.println("Su equivalente es VIII ");
            break;
            case 9: System.out.println("Su equivalente es IX ");
            break;
            case 10: System.out.println("Su equivalente es X ");
            break;
        default: System.out.println("La opcion ingresada es incorrecta...");
        }
    
    } 
} 
