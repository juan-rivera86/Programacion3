

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juliorivera
 */
package colecciones;

import java.util.LinkedList;

public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LISTAS ENLAZADAS
        ListaEnlazada lista=new ListaEnlazada();
        
        System.out.println("El tamaño de la lista enlazada es "+lista.tamano);
        lista.addNode(1, 100);
        lista.printList();
        System.out.println("El tamaño de la lista enlazada es "+lista.tamano);
        lista.addNode(2, 300);
        lista.addNode(3, 400);
        lista.printList();
        System.out.println("El tamaño de la lista enlazada es "+lista.tamano);
        lista.removeNode(1);
        System.out.println("El tamaño de la lista enlazada es "+lista.tamano);
        lista.printList();
        
        LinkedList<String> listaEnlazadaJava= new LinkedList<String>();
        
        listaEnlazadaJava.add("JUAN");
        System.out.println("El tamaño de la lista enlazada JAVA es "+listaEnlazadaJava.size());
        listaEnlazadaJava.add("CAMILO");
        listaEnlazadaJava.add("RIVERA");
        listaEnlazadaJava.add("MEDINA");
        System.out.println("El tamaño de la lista enlazada JAVA es "+listaEnlazadaJava.size());
        listaEnlazadaJava.remove("CAMILO");
        System.out.println("El tamaño de la lista enlazada JAVA es "+listaEnlazadaJava.size());
        
        
    }
    
}
