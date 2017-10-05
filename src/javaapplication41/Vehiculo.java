/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author Estudiante
 */
public abstract class Vehiculo {
    
        protected int CaballosFuerza;
        public Vehiculo(){
            System.out.println("Constructor paddre");
        }
        public abstract void Arrancar(); // No tiene metodo, sin embargo DEBE existir y ser Modificado en los hijos.
         public void Detener() {
            System.out.println("Detener Padre"); // Tiene metodo, y PUEDE O NO SER MODIFICADO en los hijos.
}
}
