/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ordenar {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        int tam;
        tam=teclado.nextInt();
        int arreglo[]=new int[tam];
        System.out.println("Ingrese los"+tam+"valores enteros");
        for (int i=0;i<tam;i++)
            {
                arreglo [i] = teclado.nextInt();
            }
        int aux=0;
        for(int j=0;j<tam;j++)
            {
                for(int i=0;i<tam-1;i++)
                   {
                     if(arreglo[i]>arreglo[i+1])
                       {
                           aux=arreglo[i];
                           arreglo[i]=arreglo[i+1];
                           arreglo[i+1]=aux;
                       }

                   }

            }
        int k=0;
        while(k<tam)
           {
               System.out.println(arreglo[k]);
               k++;
           } 
        
    }

    
}
