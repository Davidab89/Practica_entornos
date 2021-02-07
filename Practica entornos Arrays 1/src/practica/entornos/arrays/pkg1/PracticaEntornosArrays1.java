/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.entornos.arrays.pkg1;

import java.util.*;

/**
 *
 * @author David2
 */
public class PracticaEntornosArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numerosLeer;
        Scanner sc=new Scanner (System.in);
        do{
        System.out.println("¿Cuantos numeros desea leer?(Maximo 10):");
        numerosLeer=sc.nextInt();
        if (numerosLeer>10){
            System.out.println("Error, el maximo es de 10 numeros.");
        }
        }while (numerosLeer>10);
         do{
        System.out.println("¿Cuantos numeros desea leer?(Maximo 10):");
        numerosLeer=sc.nextInt();
        if (numerosLeer<0){
            System.out.println("Error, el numero no puede ser negativo.");
        }
        }while (numerosLeer<0);
        int numeros[]=new int[numerosLeer];
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Anota el numero "+i+":");
            numeros[i]=sc.nextInt();
            for(int contador=0;contador<i;contador++){
                if (numeros[i]==numeros[contador]){
                 System.out.println("Los numeros no pueden repetirse");
                 i--;

                }
            }
        }
        System.out.println("Introduce el numero que deseas buscar");
        numBuscar = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[numBuscar]) {
                System.out.println("se ha encontrado el numero");
            }
        }
        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
