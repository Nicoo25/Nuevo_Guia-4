package pooej01;

import Entidad.Persona;
import java.util.Scanner;

public class POOej01 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Instanciacion utilizando el constructor vacio
        Persona p1 = new Persona();
        
        // Instanciacion utilizando el constructor por parametro
        Persona p2 = new Persona("Agustin", "Poch", "555555", 1.50 , "Masculino", 13 , "estudiante");
        System.out.println(" NOMBRE p2: " + p2.getNombre() + " APELLIDO p2: " + p2.getApellido());     
        
        System.out.println("nombre p2");
        p2.setNombre(leer.next()); 
        System.out.println("apellido p2");
        p2.setApellido(leer.next());
        System.out.println(" NOMBRE: " + p2.getNombre() + " APELLIDO: " + p2.getApellido());
        
        
    }
    
    
}
