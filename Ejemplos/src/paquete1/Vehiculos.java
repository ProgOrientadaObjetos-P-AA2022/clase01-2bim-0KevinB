/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Vehiculos {

    private String tipo;
    private String matricula;
    public double valor;

    public Vehiculo(String t, String m, double v) {
        
    }

    public void establecerTipo(String c) {
        tipo = c;
    }

    public void establecerMatricula(String c) {
        matricula = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMatricula() {
        return matricula;
    }

    public double obtenerValor() {
        return valor;
    }
}
