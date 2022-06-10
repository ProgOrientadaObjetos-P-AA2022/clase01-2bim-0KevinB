
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.*;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio ed1 = new Edificio("Edificio Central");
        ed1.establecerCostos(10000.00);
        Edificio ed2 = new Edificio("Edificio Sur");
        ed2.establecerCostos(20000.00);
        Edificio ed3 = new Edificio("Edificio Norte");
        ed3.establecerCostos(30000.00);
        Edificio ed4 = new Edificio("Edificio Secundario");
        ed4.establecerCostos(20000.00);
        
        Edificio[] arreglo = new Edificio [4]; 
            arreglo[0] = ed1;
            arreglo[1] = ed2;
            arreglo[2] = ed3;
            arreglo[3] = ed4;
  
        Empresa e1 = new Empresa();
        e1.establecerNombre("Empresa de Hojas");
        e1.establecerEdificios(arreglo);
        e1.establecerCostoBI();
        System.out.println(e1);
    }
}
