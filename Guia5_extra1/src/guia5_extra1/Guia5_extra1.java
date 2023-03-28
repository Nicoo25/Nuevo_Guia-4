package guia5_extra1;

import java.util.Scanner;

public class Guia5_extra1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];
        cargaVector(vector);
        sumarVector(vector);
        
    }

    public static void cargaVector(int vec[]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese la posicion " + i + " del vector");
            vec[i] = leer.nextInt();
        }
    }
    
    public static void sumarVector(int vec[]) {
        int suma=0;
        for (int i = 0; i <vec.length; i++) {
            suma+=vec[i];
        }
        System.out.println("La suma de todos los valores del vector es " + suma );
    }
}
