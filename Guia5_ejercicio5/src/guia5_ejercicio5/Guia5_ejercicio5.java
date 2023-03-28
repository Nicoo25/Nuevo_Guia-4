package guia5_ejercicio5;

import java.util.Scanner;

public class Guia5_ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro como cant de filas y columnas de la matriz");
        int n;
        n = leer.nextInt();
        int matriz[][] = new int[n][n];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        mostrarTras(matriz);
        antisim(matriz);
    }

    public static void rellenarMatriz(int mat[][]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.println("Ingrese el valor " + i + " " + j + " de Matriz...");
                mat[i][j] = leer.nextInt();
            }
        }
    }
    public static void mostrarMatriz(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[ " + mat [i][j]+ " ] ");
            }
            System.out.println("");
        }
    }
     public static void mostrarTras(int mat[][]){
         
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("[ " + mat [j][i]+ " ] ");
                
            }
            System.out.println("");
        }
    }
    
     public static void antisim(int mat[][]){
         int cont=0;
         int aux[][] = new int [mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
               aux[j][i] = mat[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(aux[i][j]!=(mat[i][j])*-1){
                    cont++;
                }
            }
           
        }
        if(cont==0){ System.out.println("=========ES ANTISIMETRICA==========");
        }
        else { System.out.println("=========NO ES ANTISIMETRICA==========");
        }
    
}
}