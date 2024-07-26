/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.disenoyuml;

public class Patron_ChainOfResponsability {
    
    interface Handler{
        void setNext(Handler handler);
        void manejoProducto(String pedido);
    }
    
    // Clases que implementan el manejador
    class Persona implements Handler {
        private Handler next;

        @Override
        public void setNext(Handler handler) {
            this.next = handler;
        }
    
        @Override
        public void manejoProducto(String pedido){
            if(next != null){
                next.manejoProducto(pedido);
            }else{
                System.out.println("Persona maneja el pedido: " + pedido);
            }
        }
    }
    
    class Asistente implements Handler {
        private Handler next;

        @Override
        public void setNext(Handler handler) {
            this.next = handler;
        }

        @Override
        public void manejoProducto(String pedido) {
            if (next != null) {
                next.manejoProducto(pedido);
            }else {
                System.out.println("Asistente de Atención al Usuario maneja el pedido: " + pedido);
            }
        }
    }

    class Tecnico implements Handler {
        private Handler next;

        @Override
        public void setNext(Handler handler) {
            this.next = handler;
        }

        @Override
        public void manejoProducto(String pedido) {
            if (next != null) {
                next.manejoProducto(pedido);
            }else {
                System.out.println("Técnico maneja el pedido: " + pedido);
            }
        }
    }
    
    // Las otras clases como JefeDeInventario, etc pueden ser implementadas de forma parecida
}
