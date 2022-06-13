
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

        Vehiculo v1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo v2 = new Vehiculo("Camioneta", "LCB0011 ", 20000);
        Vehiculo v3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo v4 = new Vehiculo("Camioneta", "LCC0011", 25000);
        Vehiculo v5 = new Vehiculo("Camioneta", "LDC0011", 71000);

        Edificio[] arreglo = new Edificio[4];
        arreglo[0] = ed1;
        arreglo[1] = ed2;
        arreglo[2] = ed3;
        arreglo[3] = ed4;
        Vehiculo[] arregloV = new Vehiculo[5];
        arregloV[0] = v1;
        arregloV[1] = v2;
        arregloV[2] = v3;
        arregloV[3] = v4;
        arregloV[4] = v5;
        Empresa e1 = new Empresa();
        e1.establecerNombre("Empresa de Hojas");
        e1.establecerEdificios(arreglo);
        e1.establecerVehiculos(arregloV);
        e1.establecerCostoBienesInmuebles();
        e1.establecerCostoVehiculos();
        e1.establecerCostoTotalBienes();
        System.out.println(e1);
    }
}
