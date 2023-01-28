package ActivitatsVariats;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ruben
 */
public class arrays1 {

    public static void main(String[] args) {

        int[] numeros = new int[100];

        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];

            System.out.print("La suma de los valores es"+suma);

        }
    }
}
