package guia5_ejercicio6;

import java.util.Scanner;

public class Guia5_Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        compaMatriz(matriz);
    }

    public static void cargarMatriz(int mat[][]) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese La posicion [ " + i + " ] [ " + j + " ] entre 1 y 9 ");
                    mat[i][j] = leer.nextInt();
                } while ((mat[i][j] > 9) || (mat[i][j] < 1));
            }
        }
    }

    public static void mostrarMatriz(int mat[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + mat[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

    public static void compaMatriz(int mat[][]) {
        int filas[] = new int[4];
        int colum[] = new int[4];
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                filas[i] = filas[i] + mat[i][j];
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                colum[j] = colum[j] + mat[i][j];
            }
        }
        colum[3] = mat[0][0] + mat[1][1] + mat[2][2];
        filas[3] = mat[2][0] + mat[1][1] + mat[0][2];
        for (int i = 0; i < 4; i++) {
            System.out.print("[ " + colum[i] + " ]");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.print("[ " + filas[i] + " ]");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            if ((colum[i] != filas[i]) || (colum[i] != colum[i + 1]) || (filas[i] != filas[i + 1])) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("====== EL CUADRADO ES MAGICO ======");
        } else {
            System.out.println("El cuadrado no es magico...");
        }
    }
}
