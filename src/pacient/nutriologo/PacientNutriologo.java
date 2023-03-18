/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacient.nutriologo;

import java.util.Scanner;

/**
 *
 * @author Michelle
 */
public class PacientNutriologo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        datosNutriologo persona = new datosNutriologo("Josue", 21, "m");//Creamos una instancia de la clase
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el peso");
        persona.setPeso(sc.nextDouble());
        System.out.println("Introduce estatura");
        persona.setEstatura(sc.nextDouble());

        persona.imc();
    }

}
