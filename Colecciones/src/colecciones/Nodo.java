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
public class Nodo {
    public int Id;
    public int valorNodo;
    public Nodo siguienteNodo;
    
    //constructor 1 sin argumentos
    Nodo(){}
    
    //constructor 2 con unicamente los argumentos de atributos pero sin considerar el nodo siguiente
    public Nodo(int Id, int valorNodo){
        this.Id=Id;
        this.valorNodo=valorNodo;
    }
    
    //Constructor con dos argumentos apuntando al nodo siguiente
    public Nodo(int Id, Nodo siguienteNodo){
        this.Id=Id;
        this.siguienteNodo=siguienteNodo;
    }
    
}
