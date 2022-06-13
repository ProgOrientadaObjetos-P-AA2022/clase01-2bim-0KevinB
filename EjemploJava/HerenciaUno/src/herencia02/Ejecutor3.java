/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia02;

import herencia01.EstudianteDistancia;
import herencia01.EstudiantePresencial;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            cedula = entrada.nextLine()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        EstudianteDistancia estudianteD = new EstudianteDistancia();
        EstudiantePresencial estudianteP = new EstudiantePresencial();

        Scanner entrada = new Scanner(System.in);
        String nom;
        String ape;
        String ide;
        int ed;
        int opc;

        System.out.println("Ingrese 1 para ingresar un estudiante a distancia");
        System.out.println("Ingrese 2 para ingresar un estudiante presencial");
        opc = entrada.nextInt();
        entrada.nextLine();
        if ((opc == 1) || (opc == 2)) {
                
                System.out.println("Ingrese el nombre");
                nom = entrada.nextLine();

                System.out.println("Ingrese el apellido");
                ape = entrada.nextLine();

                System.out.println("Ingrese la identificacion");
                ide = entrada.nextLine();

                System.out.println("Ingrese su edad");
                ed = entrada.nextInt();
                if (opc == 1) {
                    estudianteD.establecerNombresEstudiante(nom);
                    estudianteD.establecerApellidoEstudiante(ape);
                    estudianteD.establecerIdentificacionEstudiante(ide);
                    estudianteD.establecerEdadEstudiante(ed);
                    System.out.println("Escriba el costo de la asignatura");
                    double cA = entrada.nextDouble();
                    estudianteD.establecerCostoAsignatura(cA);
                    System.out.println("Escriba el numero de asignaturas");
                    int nA = entrada.nextInt();
                    estudianteD.establecerNumeroAsginaturas(nA);
                    estudianteD.calcularMatriculaDistancia();
                    System.out.println(estudianteD);
                } else {
                    if (opc == 2) {
                        estudianteP.establecerNombresEstudiante(nom);
                        estudianteP.establecerApellidoEstudiante(ape);
                        estudianteP.establecerIdentificacionEstudiante(ide);
                        estudianteP.establecerEdadEstudiante(ed);
                        System.out.println("Ingrese el numero de creditos");
                        int nC = entrada.nextInt();
                        estudianteP.establecerNumeroCreditos(nC);
                        System.out.println("Ingrese el costo del credito");
                        double cC = entrada.nextDouble();
                        estudianteP.establecerCostoCredito(cC);
                        estudianteP.calcularMatriculaPresencial();
                        System.out.println(estudianteP);
                }
            }
        } else {
            System.out.println("Opcion incorrecta");
        }
    }
}
