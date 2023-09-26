/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Lucie, Présentation de java, 26/09/2023
 */
public class Calculator {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Please enter the operator\n1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        int operateur = sc.nextInt();
        while (operateur > 5 || operateur < 0) {
            System.out.println("ERREUR La valeur n'est pas comprise entre 0 et 5");
            System.out.println("\n Entrer un nombre :");
            operateur = sc.nextInt();

        }

    }
    

