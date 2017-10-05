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
public class Automovil extends Vehiculo{
    private int CantidadPuertas;
    public Automovil(int CantidadPuertas){
        this.CantidadPuertas = CantidadPuertas;
        this.CaballosFuerza = 10;
        System.out.println("Constructor Del Hijo");
        
        
}
    @Override
    public void Arrancar(){
            System.out.println("Se sobrescribio");
           
    }
}