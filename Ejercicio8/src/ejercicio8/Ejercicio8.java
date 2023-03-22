package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota=11;
        while (nota<0 || nota >10){
            System.out.println("Ingrese una nota valida(de 0 a 10)");
            nota = leer.nextInt();
        }
        System.out.println("Perfecto!!! La nota es valida...!");
    }
    
}

 