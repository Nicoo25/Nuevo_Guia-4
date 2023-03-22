
package guia3ej_extra6;

import java.util.Scanner;


public class Guia3Ej_extra6 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double estatura, menor=0, gral=0, cont1=0, cont2=0;
        
        char opc;
        do{
            System.out.println("Ingrese una estatura para promediar");
            estatura = leer.nextDouble();
            if (estatura<1.60){
            menor=menor+estatura;
            gral=gral+estatura;
                    cont2++;
                    cont1++;
            }
            else{
            gral=gral+estatura;
            cont2++;
            }
            System.out.println("Desea ingresar otra estatura?? s/n");   
            opc= leer.next().toUpperCase().charAt(0);
        }
        while (opc!='N'); 
        System.out.println("El promedio de estaturas menores a 1.60m es " + (menor/cont1));
        System.out.println("El promedio de estaturas general es " + (gral/cont2));
    }
    
}
