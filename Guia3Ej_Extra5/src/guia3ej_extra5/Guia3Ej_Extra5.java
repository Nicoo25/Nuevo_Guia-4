package guia3ej_extra5;

import java.util.Scanner;

public class Guia3Ej_Extra5 {

        public static void main(String[] args) {
        /*Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/
       Scanner leer = new Scanner(System.in);
            System.out.println("Categoria A 50% en tratamientos.");
            System.out.println("Categoria B 35% en tratamientos.");
            System.out.println("Categoria C 0% en tratamientos.");
            System.out.println("Ingrese su categoria de socio....");
            char opc;
            double costo;
            opc = leer.next().toUpperCase().charAt(0);
            System.out.println("Ingrese el costo total del tratamiento....");
            costo = leer.nextDouble(); 
             
            switch (opc){
                case 'A'  : System.out.println("Su tratamieno con descuento cuesta $ " + (costo/2) );
                break;
                 case 'B'  : System.out.println("Su tratamieno con descuento cuesta $ " + (costo/1.35) );
                break;
                 case 'C'  : System.out.println("Su tratamieno sin descuento cuesta $ " + costo );
                break;
            }
    }
    
}
