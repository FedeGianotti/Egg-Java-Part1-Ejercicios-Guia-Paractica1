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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escribir un programa que pida dos números enteros por teclado y calcule
        la suma de los dos. El programa deberá después mostrar el resultado de
        la suma*/
        Scanner leer = new Scanner(System.in);
        //int num1,num2,sum;
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        int sum = num1 + num2;
        System.out.println("El resultsdo de la suma es "+sum);
    }
    
}
