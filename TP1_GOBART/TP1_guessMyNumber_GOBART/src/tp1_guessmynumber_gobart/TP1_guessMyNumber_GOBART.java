/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_gobart;

/**
 *
 * @author Lucie
 */
import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_GOBART {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu Guess My Number!");

        System.out.println("Choisir le niveau de difficulté :");
        System.out.println("1. Facile (de 1 à 100)");
        System.out.println("2. Normal (de 1 à 1000)");
        System.out.println("3. Difficile (de 1 à 10000)");
        int niveau = sc.nextInt();

        int min, max, nombreATrouver;
        int nombreTentatives = 0;

        switch (niveau) {
            case 1 -> {
                min = 1;
                max = 100;
            }
            case 2 -> {
                min = 1;
                max = 1000;
            }
            case 3 -> {
                min = 1;
                max = 10000;
            }
            default -> {
                min = 1;
                max = 100;
            }
        }

        nombreATrouver = generateurAleat.nextInt(max - min + 1) + min;

        while (true) {
            System.out.print("Devinez le nombre entre " + min + " et " + max + " : ");
            int nombreDevine = sc.nextInt();
            nombreTentatives++;

            if (nombreDevine < min || nombreDevine > max) {
                System.out.println("Veuillez entrer un nombre valide entre " + min + " et " + max );
            } else if (nombreDevine < nombreATrouver) {
                System.out.println("Trop petit");
            } else if (nombreDevine > nombreATrouver) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Gagné ! Vous avez trouvé le nombre " + nombreATrouver + " en " + nombreTentatives + " tentatives !");
                break;
            }
        }

        sc.close();
    }
}
