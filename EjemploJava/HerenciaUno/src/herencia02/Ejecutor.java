/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;

import herencia01.EstudianteDistancia;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
            EstudianteDistancia estudiante = new EstudianteDistancia();
            estudiante.establecerNombresEstudiante("Kevin");
            estudiante.establecerApellidoEstudiante("Barrazueta");
            estudiante.establecerIdentificacionEstudiante("1105589426");
            estudiante.establecerEdadEstudiante(18);
            estudiante.establecerCostoAsignatura(300);
            estudiante.establecerNumeroAsginaturas(5);
            estudiante.calcularMatriculaDistancia();
            System.out.println(estudiante);
    }
}
