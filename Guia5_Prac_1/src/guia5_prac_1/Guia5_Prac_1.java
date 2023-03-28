
package guia5_prac_1;

import java.util.Scanner;


public class Guia5_Prac_1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String equipo [] = new String [10];
        for(int i = 0; i<=9 ; i++){
            System.out.println("Ingrese el nombre del participante nro " + (i+1)+ " del grupo.");
            equipo [i] = leer.next();
        }
        for(int i = 0; i<=9 ; i++){
            System.out.println(equipo [i]);
    }
    }
}
