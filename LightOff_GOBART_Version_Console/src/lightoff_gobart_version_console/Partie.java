package lightoff_gobart_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */

import java.util.Scanner;

public class Partie {
    private GrilleDeCellules grille;
    private int nbCoups;
    private int coupsMax;
    
    /**
     * Permet de créer une nouvelle grille et initialise le nombre de coup à 0
     * @param nbLignes nombre de lignes de la grille
     * @param nbColonnes nombre de colonnes de la grille
     * @param coupsMax nombre de coups à jouer maximum autorisés
     */
    public Partie(int nbLignes, int nbColonnes, int coupsMax) {
        this.grille = new GrilleDeCellules(nbLignes,nbColonnes); 
        this.nbCoups = 0;
        this.coupsMax= coupsMax;
    }
    
    /**
     * Permet de bien mélanger la grille de jeu avant de commencer la partie
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(200); 
    }

    /**
     * Permet de lancer la partie
     */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans le jeu LightOff!");
        System.out.println(grille);
        
        while (!grille.cellulesToutesEteintes() && nbCoups<coupsMax) {
            
            System.out.print("Entrez un coup (ligne, colonne ou diagonale) : ");
            String coup = sc.nextLine();

            if (coup.equalsIgnoreCase("ligne")) {
                System.out.print("Entrez le numéro de la ligne : ");
                int ligne = sc.nextInt();
                grille.activerLigneDeCellules(ligne);
            } else if (coup.equalsIgnoreCase("colonne")) {
                System.out.print("Entrez le numéro de la colonne : ");
                int colonne = sc.nextInt();
                grille.activerColonneDeCellules(colonne);
            } else if (coup.equalsIgnoreCase("diagonale")) {
                System.out.print("Entrez 'montante' ou 'descendante' pour la diagonale : ");
                String direction = sc.nextLine();
                if (direction.equalsIgnoreCase("montante")) {
                    grille.activerDiagonaleMontante();
                } else if (direction.equalsIgnoreCase("descendante")) {
                    grille.activerDiagonaleDescendante();
                }
            }

            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
            System.out.println(grille);

            sc.nextLine();
        }
        
        if (grille.cellulesToutesEteintes()) {
            System.out.println("Félicitations! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
        } else {
            System.out.println("Désolé, vous avez atteint le nombre maximum de coups autorisés. Vous avez perdu.");
        }
    }
    
}


