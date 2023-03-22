package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

/*o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
*/
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int tipoMotor;
        System.out.println("Ingrese una opcion entre 1 y 4 segun sea su bomba de fluidos."); 
        tipoMotor = leer.nextInt();
        switch (tipoMotor) { 
            case 1: System.out.println("La bomba es una bomba de agua");
            break;
            
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            
            case 3: System.out.println("La bomba es una bomba de hormigon");
            break;
            
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            
            default: System.out.println("“No existe un valor válido para tipo de bomba”");  
    }
    }
    
}
