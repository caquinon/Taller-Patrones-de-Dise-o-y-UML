/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.disenoyuml;

public class Patron_Iterator {
    
    interface Iterator{
        Object getNext();
        boolean hasNext();
    }
    
    interface Colection{
        Iterator crearIterator();
    }
    
    class Inventario implements Colection{
        static final int max_products= 5;
        int productsNumber = 0;
        Product[] products;
    
    
        public Inventario(){
            products = new Product[max_products];
        
            addProduct("Producto 1", "Descripcion 1");
            addProduct("Producto 2", "Descripcion 2");
        }
    
        public void addProduct(String name, String description){
            Product p = new Product(name, description);
            if (productsNumber >= max_products){
                System.err.println("La lista de productos esta llena.");
            }else{
                products[productsNumber] = p;
                productsNumber = productsNumber + 1;
            }
        }
    
        @Override
        public Iterator crearIterator(){
            return new InventarioIterator(products);
        }
    }
   
    class InventarioIterator implements Iterator {
        Product[] products;
        int position = 0;
        
        public InventarioIterator(Product[] products){
            this.products = products;
        }
        
        @Override
        public boolean hasNext(){
            return !(position >= products.length || products[position] == null);
        }
        
        @Override
        public Object getNext(){
            Product p = products[position];
            position = position+1;
            return p;
        }
    }
    
    class Product{
        String name;
        String description;
        
        public Product(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }
}
