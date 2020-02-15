/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author juliorivera
 */
public class Ordenamiento {
    
    
    Ordenamiento(){};
    
    
    //mètodo que imprime el arreglo de entrada
    public void ImprimirArregloAOrdenar(int[] arregloEntrada){
        for(int i=0; i < arregloEntrada.length;i++){
            System.out.print(arregloEntrada[i]+", ");
        }
        System.out.println();
    }
    
    
    //Ordenamiento por insertion Sort
    public void InsertionSort(int[] arregloEntrada){
        ImprimirArregloAOrdenar(arregloEntrada);
        //Se debe iterar por todos los elementos del listado o arreglo
        for(int posicion=1; posicion < arregloEntrada.length;posicion++){
            int contadorComparacion=posicion;
            int numeroEvaluado=arregloEntrada[posicion];
            while(arregloEntrada[contadorComparacion-1]>numeroEvaluado && contadorComparacion>0){
                arregloEntrada[contadorComparacion]=arregloEntrada[contadorComparacion-1];
                contadorComparacion--;
                if(contadorComparacion==0){
                    break;
                }
            }
            arregloEntrada[contadorComparacion]=numeroEvaluado;
            ImprimirArregloAOrdenar(arregloEntrada);
         }
    }
    
    public void SelectionSort(int[] arregloEntrada){
        for(int posicionArreglo=0; posicionArreglo < arregloEntrada.length;posicionArreglo++){
            int posicionMinimo=posicionArreglo;
            for(int posicion=posicionArreglo; posicion < arregloEntrada.length;posicion++){
                if(arregloEntrada[posicion]<arregloEntrada[posicionMinimo]){
                    posicionMinimo=posicion;
                }
            }
            int temporal=arregloEntrada[posicionArreglo];
            arregloEntrada[posicionArreglo]=arregloEntrada[posicionMinimo];
            arregloEntrada[posicionMinimo]=temporal;
             ImprimirArregloAOrdenar(arregloEntrada);
        }
    }
    
    
    
    
    
    
    
}
