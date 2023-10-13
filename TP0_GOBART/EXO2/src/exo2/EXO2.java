/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Lucie, Présentation de Netbeans, 26/09/2023
 */
public class EXO2 {

    public static void main(String[] args) {
        
//Declaration des variables
int nb; // nombre dentiers a additionner
int result; // resultat
int ind; //indice
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
result=0;
// Addition des nb premiers entiers
ind=1;
while (ind <= nb) {
    ind = 1 + ind;
result=result+ind;
}
// Affichage du resultat
System.out.println();
System.out.println("La somme des "+ nb + "entiers est: "+result);


}
}
