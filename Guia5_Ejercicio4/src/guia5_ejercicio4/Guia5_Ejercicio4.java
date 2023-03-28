/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejercicio4;

/**
 *
 * @author User
 */
public class Guia5_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int matriz[][] = new int[4][4];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        System.out.println("Matriz traspuesta: ");
        mostrarTraspuesta(matriz);
    }

    public static void rellenarMatriz(int mat[][]) { //¿Retorna o no retorna?
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void mostrarMatriz(int mat[][]){
        for(int x[] : mat){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarTraspuesta(int mat[][]){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println("");
        }
    }
    /*  public static void mostrarTraspuesta(int mat[][]){
        for(int y : x){
            for(int x []  : mat){
                System.out.print( y + " ");
            }
            System.out.println("");
        }
    }
*/}
    

