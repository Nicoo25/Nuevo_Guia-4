/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ej6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Guia3Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String opcion2;
        int opcion1, num1, num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean conectado = true;
        do {
            System.out.println("MENÚ (elija su opción");
            System.out.println("1: sumar");
            System.out.println("2: restar");
            System.out.println("3: multiplicar");
            System.out.println("4: dividir");
            System.out.println("5: salir");
            System.out.println("Ingrese una opcion:");
            opcion1 = leer.nextInt();

            switch (opcion1) {
                case 1: {
                    System.out.println("Suma = " + (num1 + num2));
                    break;
                }
                case 2: {
                    System.out.println("Resta = " + (num1 - num2));
                    break;
                }
                case 3: {
                    System.out.println("Multiplicar = " + (num1 * num2));
                    break;
                }
                case 4: {
                    if (num2 != 0) {
                        System.out.println("División = " + (num1 / num2));
                    } else {
                        System.out.println("Division por cero");
                    }
                    break;
                }
                case 5: {
                    System.out.println("¿Está seguro que desea salir?(S/N)");
                    opcion2 = leer.next();
                    switch (opcion2.toUpperCase()) {
                        case "S": {
                            System.out.println("Hasta la proxima");
                            conectado = false;
                            break;
                        }
                        case "N": {
                            System.out.println("Gracias por quedarte");
                            break;
                        }
                        default: {
                            System.out.println("Opcion inválida");
                        }
                    }
                    break;
                }
            }

        } while (conectado == true);
    }
    
}
