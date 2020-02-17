/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo;

/**
 *
 * @author Juan
 */
public class Busqueda {
    
    public Busqueda(){}
    
    //busqueda en un listado desorganizado
    public int busquedaSecuencial(int[] array,int elemento){
        for(int i=0; i < array.length;i++){
            if(array[i]==elemento){
                return array[i];
            }
        }
        return 0;
    }
    
    
    //busqueda binaria
    public int busquedaBinaria(int[] array,int elemento, int low, int high){
        //se calcula la posicion media del arreglo
        int medio=(high-low)/2;
        int valorMedio=array[medio];
        if(valorMedio<elemento){
            return busquedaBinaria(array,elemento,valorMedio+1,array.length);
        }else if(valorMedio==elemento){
                return valorMedio;
        }else{
               return busquedaBinaria(array,elemento,low,valorMedio);
        }
    }
    
    
    
}
