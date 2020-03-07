/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author juliorivera
 */
public class ListaEnlazada {
    public int tamano;
    public Nodo nodoRaiz;
    
    public ListaEnlazada(){
        this.tamano=0;
        this.nodoRaiz=new Nodo();
    }
    
    
    //metodo de escritura del tamaño de la lista
    public void setSize(int size){
        this.tamano=size;
    }
    
    //metodo de lectura de la lista
    public int getSize(){
        return this.tamano;
    }
    
    //metodo que permite agregar un nodo
    public Nodo addNode(int Id, int valor){
        Nodo newNode=new Nodo(Id,valor);
        Nodo nodoActual=this.nodoRaiz;
        while(nodoActual !=null){
            if(nodoActual.siguienteNodo==null){
                nodoActual.siguienteNodo=newNode;
                this.tamano++;
                return newNode;
            }else{
                nodoActual=nodoActual.siguienteNodo;
            }
        }
        this.nodoRaiz=newNode;
        return newNode;
    }
    
    //metodo que va a buscar un nodo determinado
    public Nodo findNode(int IdNodo){
        Nodo nodoActual=this.nodoRaiz;
        //mientras el nodo actual no sea null ingresa
        while(nodoActual != null){
            //si el Id del nodo Actual es igual al Id del nodo buscado
            if(nodoActual.Id==IdNodo){
                //retorna nodo actual
                return nodoActual;
            }else{
                //reemplaza nodo actual con el nodo siguiente (recursividad indirecta)
                nodoActual=nodoActual.siguienteNodo;
            }
        }
        //en el caso en que el nodo actual sea null, devuelve un null
        return null;
    }
    
    public boolean removeNode(int IdNodo){
        //tomamos el nodo raiz
        Nodo nodoActual= this.nodoRaiz;
        //se define un nodo anterior como null debido a que no existe
        Nodo nodoAnterior=null;
        //si nodo actual es diferente de null
        while(nodoActual != null){
            //si nodo actual es el nodo buscado para remover
            if(nodoActual.Id==IdNodo){
                //se define para el nodo anterior el valor del siguiente nodo
                nodoAnterior.siguienteNodo=nodoActual.siguienteNodo;
                //se disminuye el tamaño de la lista
                this.tamano--;
                //se retorna verdadero
                return true;
            }else{
                //el nodo anterior se convierte en el nodo actual
                nodoAnterior=nodoActual;
                //el nodo actual toma el valor del nodo siguiente
                nodoActual=nodoActual.siguienteNodo;
            }
        }
        return false;
    
    }
    //imprime los valores de la lista
    public void printList(){
        Nodo nodoActual=this.nodoRaiz;
        
        while(nodoActual != null){
            System.out.println("Id: "+nodoActual.Id+" valor: "+nodoActual.valorNodo);
            nodoActual=nodoActual.siguienteNodo;
        }
    }
    
    
    
    
    
    
    
}
