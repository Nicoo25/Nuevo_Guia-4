
package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje 
"Se capturó el numero cero""Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int nro, cont=1, suma=0;
        do { 
            System.out.println("Ingrese un nro por teclado");
            nro = leer.nextInt();
            cont++;
            if (nro >=1){
            suma = suma + nro;
            continue;
            }
            if (nro<0){
                continue;
            }
            if (nro==0){
                System.out.println("Se capturó el numero cero!!!");  
                
                break;
            }
        }  while (cont<=20);  
        System.out.println("La suma total es " + suma);
        }
   
}
