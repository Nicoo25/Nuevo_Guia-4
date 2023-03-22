package guia4_ejercicio11;

import java.util.Scanner;

public class Guia4_ejercicio11 {

    public static void main(String[] args) {
        // (fde.length()<=5 && fde.substring(0,1).equals("X")&& fde.substring(fde.length()-1,fde.length()).equals("O"))

        Scanner leer = new Scanner(System.in);
        String frase, letra;
        System.out.println("======= Ingrese una frase=====");
        frase = leer.nextLine();
        System.out.println(frase.length());
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
                switch (letra) {
                    case "a":
                        System.out.print("@");
                        break;
                    case "e":
                        System.out.print("#");
                        break;
                    case "i":
                        System.out.print("$");
                        break;
                    case "o":
                        System.out.print("%");
                        break;
                    case "u":
                        System.out.print("*");
                        break;
                }
                Default: {
                System.out.print(letra);
            }
        System.out.println("");
        }
    }
}
        
    


