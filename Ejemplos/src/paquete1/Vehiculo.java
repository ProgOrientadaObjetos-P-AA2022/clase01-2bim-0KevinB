/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Vehiculo {
    
    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String t, String m, int c){
        tipo = t;
        matricula = m;
        valor = c;
    }
    
    public void establecerTipo(String x){
        tipo = x;
    }
    
    public void establecerMatricula(String x){
        matricula = x;
    }
    
    public void establecerValor(double n){
        valor = n;
    }
    
     public String obtenerTipo(){
        return tipo;
    }
    
    public String obtenerMatricula(){
        return matricula;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Tipo: %s\n"
                + "Matricula: %s\n"
                + "Valor: %.2f", tipo,
                matricula,
                valor);
        return cadena;
    }    
}