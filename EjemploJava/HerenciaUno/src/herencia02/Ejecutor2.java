/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;

import herencia01.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            EstudiantePresencial estudiante = new EstudiantePresencial();
            
            System.out.println("Ingrese el nombre");
            String nom = entrada.nextLine();
            estudiante.establecerNombresEstudiante(nom);
            
            System.out.println("Ingrese el apellido");
            String ape = entrada.nextLine();
            estudiante.establecerApellidoEstudiante(ape);
            
            System.out.println("Ingrese la identificacion");
            String ide = entrada.nextLine();
            estudiante.establecerIdentificacionEstudiante(ide);
            
            System.out.println("Ingrese su edad");
            int ed = entrada.nextInt();
            estudiante.establecerEdadEstudiante(ed);
            
            System.out.println("Ingrese el numero de creditos");
            int nC = entrada.nextInt();
            estudiante.establecerNumeroCreditos(nC);
            
            System.out.println("Ingrese el costo del credito");
            double cC = entrada.nextDouble();
            estudiante.establecerCostoCredito(cC);
            
            estudiante.calcularMatriculaPresencial();
            System.out.println("----------------------");
            System.out.println(estudiante);
    }
}
