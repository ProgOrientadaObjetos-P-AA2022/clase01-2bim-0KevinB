
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
        ed1.establecerCostos(20000.00);
        Edificio ed2 = new Edificio("Edificio Sur");
        ed2.establecerCostos(30000.00);
        Edificio ed3 = new Edificio("Edificio Norte");
        ed3.establecerCostos(10000.00);
        Edificio ed4 = new Edificio("Edificio Secundario");
        ed4.establecerCostos(5000.00);

        Vehiculos v1 = new Vehiculos("Auto", "LBB0011", 10000);
        Vehiculos v2 = new Vehiculos("Camioneta", "LCB0011 ", 20000);
        Vehiculos v3 = new Vehiculos("Auto", "LBD0012", 6000);
        Vehiculos v4 = new Vehiculos("Camioneta", "LCC0011", 25000);
        Vehiculos v5 = new Vehiculos("Camioneta", "LDC0011", 71000);

        Edificio[] arreglo = new Edificio[4];
        arreglo[0] = ed1;
        arreglo[1] = ed2;
        arreglo[2] = ed3;
        arreglo[3] = ed4;
        Vehiculos[] arregloV = new Vehiculos[5];
        arregloV[0] = v1;
        arregloV[1] = v2;
        arregloV[2] = v3;
        arregloV[3] = v4;
        arregloV[4] = v5;
        Empresa e1 = new Empresa();
        e1.establecerNombre("Empresa de Hojas");
        e1.establecerEdificios(arreglo);
        e1.establecerCostoBI();
        System.out.println(e1);
    }
}
