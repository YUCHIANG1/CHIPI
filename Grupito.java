/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupito;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Grupito {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //SUMAAAAAAA
        Scanner scanner = new Scanner(System.in);
        System.out.println("La Suma");
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        
        int numero1 = scanner.nextInt();
        
        
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
            System.out.println("la suma de " + numero1 + " + " + numero2 + " es: " + suma);
                
            
        System.out.println();     
    }
}
