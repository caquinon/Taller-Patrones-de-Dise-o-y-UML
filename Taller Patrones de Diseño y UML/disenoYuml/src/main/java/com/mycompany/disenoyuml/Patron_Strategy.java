/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.disenoyuml;


public class Patron_Strategy {
    
    //Interfaz para la estrategy
    interface Distribucion{
        void realizarEntrega(String articulo);
    }
    
    class ViaAutomotriz implements Distribucion{
        @Override
        public void realizarEntrega(String articulo){
            System.out.println("Entregando" + articulo + "via automotriz.");
        }
    }
    
    class ViaAerea implements Distribucion{
        @Override
        public void realizarEntrega(String articulo){
            System.out.println("Entregando" + articulo + "via aerea.");
        }
    }
    
    class ViaCiclista implements Distribucion {
        @Override
        public void realizarEntrega(String articulo){
            System.out.println("Entregando" + articulo + "via ciclista.");
        }
    }
    
    class ViaFluvial implements Distribucion{
        @Override
        public void realizarEntrega(String articulo){
            System.out.println("Entregando" + articulo + "via fluvial.");
        }
    }
    
    class ViaFerrea implements Distribucion{
        @Override
        public void realizarEntrega(String articulo){
            System.out.println("Entregando" + articulo + "via ferrea.");
        }
    }
    
    class Contexto{
        private Distribucion dist;

        public Contexto(Distribucion dist) {
            this.dist = dist;
        }
        
        public void cambiarTransporte(Distribucion dist){
            this.dist = dist;
        }
        
        public void realizarEntrega(String articulo){
            dist.realizarEntrega(articulo);
        }
    }
}
