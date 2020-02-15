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
public class Algoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime, endTime;
        //Crear un arreglo a ordenar
        /*int[] arreglo={1803256,1803391,1803505,1803542,1803595,1803596,1803597,1803605,1803620,1803622,1803623,
            1803625,1803627,1803629,1803635,1803640,1803642,1803643,1803646,
            1803647,1803649,1803653,1803654,1803658,1803664,1803665,1803673,1803675,1803680,
            1803688,1803690,1803692,1803710,1803720,
            1803749,1803754,1803759};
        */
        int[] arreglo={6,5,3,1,8,7,2,4};
        Ordenamiento objetoOrdenamiento= new Ordenamiento();
        startTime=System.nanoTime();
        //objetoOrdenamiento.InsertionSort(arreglo);
        endTime=System.nanoTime();
        System.out.println("El tiempo de ejecució del algoritmo de Insertion Sort fue: "+((endTime-startTime)/1000000)+"milisegundo(s)");
        
         startTime=System.nanoTime();
        objetoOrdenamiento.SelectionSort(arreglo);
        endTime=System.nanoTime();
        System.out.println("El tiempo de ejecución del algoritmo de Selection Sort fue: "+((endTime-startTime)/1000000)+"milisegundo(s)");
        
    }
    
}
