/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_gobart1;

/**
 *
 * @author Lucie, TP1 manipNombresInt, 04/10/2023
 */

import java.util.Scanner;

public class TP1_manipNombresInt_GOBART1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Demander à l'utilisateur de saisir le premier entier
            System.out.print("Saisir le premier entier : ");
            int Entier1 = sc.nextInt();

            // Demander à l'utilisateur de saisir le deuxième entier
            System.out.print("Saisir le deuxième entier : ");
            int Entier2 = sc.nextInt();

            int somme = Entier1 + Entier2;
            System.out.println("La somme des nombres est : " + somme);

            int difference = Entier1 - Entier2;
            System.out.println("La différence des nombres est : " + difference);

            int produit = Entier1 * Entier2;
            System.out.println("Le produit des nombres est : " + produit);

            int quotient = Entier1 / Entier2;
            System.out.println("Le quotient de la division est : " + quotient);
            
            int reste = Entier1 % Entier2;
            System.out.println("Le reste de la division est : " + reste);
            
            sc.close();
        }
    }
