/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguiapractica1;

import java.util.Scanner;

/**
 *
 * @author katsu
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        int tempC = leer.nextInt();
        float tempF = 32+((9*tempC)/5);
        System.out.println("La temperatura en grados Fahrenheit es "+tempF);
    }
    
}
