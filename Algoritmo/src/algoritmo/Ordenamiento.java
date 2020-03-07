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
       // ImprimirArregloAOrdenar(arregloEntrada);
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
            //ImprimirArregloAOrdenar(arregloEntrada);
         }
    }
    
    //ordenamiento por Seleccion Sort
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
    
    //ordenamiento pot shell sort
    public void ShellSort(int[] arregloEntrada){
        for(int gap=arregloEntrada.length/2; gap>0;gap /=2){
            for(int contador=gap; contador< arregloEntrada.length;contador++){
                int temporal=arregloEntrada[contador];
                int contador2;
                for(contador2=contador;contador2>=gap && arregloEntrada[contador2-gap]>temporal;contador2 -= gap){
                    arregloEntrada[contador2]=arregloEntrada[contador2-gap];
                }
                arregloEntrada[contador2]=temporal;
            }
           ImprimirArregloAOrdenar(arregloEntrada);
        }
    }
    
    //ordenamiento por bubble sort
    public void BubbleSort(int[] arregloEntrada){
        for(int contador1=0;contador1<arregloEntrada.length;contador1++){
            for(int contador2=0; contador2<arregloEntrada.length;contador2++){
                if((contador2+1)<arregloEntrada.length){
                    if(arregloEntrada[contador2]>arregloEntrada[contador2+1]){
                        int temporal=arregloEntrada[contador2];
                        arregloEntrada[contador2]=arregloEntrada[contador2+1];
                        arregloEntrada[contador2+1]=temporal;
                    }
                }
            }
              //ImprimirArregloAOrdenar(arregloEntrada);
        }
    }
    
    //ordenamiento por metodo Merge
    void Merge(int arregloEntrada[], int l, int m, int r) 
    { 
        //Se buscan los tamaños de los dos arreglos a los cuales se va a dividir
        int n1 = m - l + 1; 
        int n2 = r - m; 
        //se crean los dos sub arreglos
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //se copian los datos en los dos subarreglos correspondientes a la parte derecha y parte izquiera del arreglo principal
        for (int i=0; i<n1; ++i) 
            L[i] = arregloEntrada[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arregloEntrada[m + 1+ j]; 
  
   //se combinan los dos arreglos temporales
  
        //inicializacion de contadores 
        int i = 0, j = 0; 
        //index inicial de los sub arreglos a mezclar
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arregloEntrada[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arregloEntrada[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        ImprimirArregloAOrdenar(arregloEntrada);
  
        //se copian los elementos restantes en L
        while (i < n1) 
        { 
            arregloEntrada[k] = L[i]; 
            i++; 
            k++; 
        } 
        ImprimirArregloAOrdenar(arregloEntrada);
        //se copian los elementos restantes en R
        while (j < n2) 
        { 
            arregloEntrada[k] = R[j]; 
            j++; 
            k++; 
        } 
        ImprimirArregloAOrdenar(arregloEntrada);
    }
    //merge and sort algorithm
     void sort(int arregloEntrada[], int extremoIzquierdo, int extremoDerecho) 
    { 
        if (extremoIzquierdo < extremoDerecho) 
        { 
            // se busca el punto medio
            int puntoMedio = (extremoIzquierdo+extremoDerecho)/2; 
  
            // Sort first and second halves 
            sort(arregloEntrada, extremoIzquierdo, puntoMedio); 
            sort(arregloEntrada , puntoMedio+1, extremoDerecho); 
  
            // Merge the sorted halves 
            Merge(arregloEntrada, extremoIzquierdo, puntoMedio, extremoDerecho); 
        } 
    }
     
     
     //algoritmo de quick sort
     //primero se debe identificar la particion
     public int Partition(int[] arregloEntrada, int low, int high){
         //se toma el número que realizará el pivot
         int pivot=arregloEntrada[low];
         int i=low,j=high;
         while(i<j){
             //se identifica la posicion del número que sea menor o igual a pivot
             do{
                 i++;
             }while(arregloEntrada[i]<=pivot);
             //se identifica la posición del número que sea mayor a pivot
             while(arregloEntrada[j]>pivot)
             {
                 j--;
             };
             if(i<j){
                int temporal=arregloEntrada[j];
                arregloEntrada[j]=arregloEntrada[i];
                arregloEntrada[i]=temporal;
                    // ImprimirArregloAOrdenar(arregloEntrada);
            }
         }
             int temporal2=arregloEntrada[j];
             arregloEntrada[j]=arregloEntrada[low];
             arregloEntrada[low]=temporal2;
             //     ImprimirArregloAOrdenar(arregloEntrada);
            return j;
     }
     
     public void QuickSort(int[] arregloEntrada,int low, int high){
         if(low<high){
             int j=Partition(arregloEntrada,low,high);
             QuickSort(arregloEntrada,low,j);
             QuickSort(arregloEntrada,j+1,high);
           
         }
         
     
     }
        
        
        
        
        
    
    
    
    
    
    
    
    
}
