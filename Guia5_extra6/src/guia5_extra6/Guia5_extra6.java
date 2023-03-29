package guia5_extra6;

import java.util.Scanner;


public class Guia5_extra6 {

    /**
     Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va 
     * ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán
     * todas en orden horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
     * de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
     * por pantalla la sopa de letras creada.
      Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
      * de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int aux,num;
        String matriz [][]= new String [20][20];
        
        for (int i = 0; i < 5; i++) {
            do {                
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres");
            palabra = leer.nextLine();
            } while ((palabra.length()<3) || (palabra.length()>5) );
            aux = (int) (Math.random()*10);
            for (int j = 0; j < palabra.length(); j++) {
                 matriz [aux][j] = palabra.substring(j,j+1);  
              
            }
           
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j]==null) {
                    num = (int)(Math.random()*10);
                    matriz[i][j] = String.valueOf(num);
                }
               System.out.print(" "+matriz[i][j]+" "); 
            }
            System.out.println("");
        }
    }
    
}
