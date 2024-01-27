package lightoff_gobart_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */

import java.util.Random;

public class GrilleDeCellules {
    private CelluleLumineuse [][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    
    /**
     * Permet de créer une nouvelle grille de cellules lumineuses
     * @param p_nbLignes nombre de lignes de la grille
     * @param p_nbColonnes nombre de colonnes de la grille
     */
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes){
    nbLignes = p_nbLignes;
    nbColonnes = p_nbColonnes;
    matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
       
    for (int i=0; i < nbLignes; i++){
        for (int j=0; j < nbColonnes; j++){
            matriceCellules[i][j]= new CelluleLumineuse();
        }
    }
}
    
    /**
     * Permet d'éteindre toutes les cellules de la grille
     */
    public void eteindreToutesLesCellules(){
    for (int i=0; i < nbLignes; i++){
        for (int j=0; j < nbColonnes; j++){
            matriceCellules[i][j].eteindreCellule();
        }
    }
}

    /**
     * Permet d'activer de manière aléatoire une ligne ou une colonne ou une diagonale dans la grille
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
    Random random = new Random();
    int choix =random.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale
    switch (choix) {
            case 0 -> {
                int ligneAleatoire = random.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
            }
            case 1 -> {
                int colonneAleatoire = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
            }
            case 2 -> {
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
            }
        }
}
    
    /**
     * Permet d'activer toutes les cellules d'une ligne spécifique de la grille
     * @param idLigne numéro de la ligne à activer
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Permet d'activer toutes les cellules d'une colonne spécifique de la grille
     * @param idColonne numéro de la colonne à activer
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Permet d'activer la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Permet d'activer la diagonale montante de la grille
     */
    public void activerDiagonaleMontante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][nbColonnes - i - 1].activerCellule();
        }
    }
    
    /**
     * Permet de vérifier que toutes les cellules de la grille sont éteintes
     * @return true si toutes les cellules sont éteintes, et false sinon
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Permet de mélanger une grille de cellules lumineuses 
     * @param nbTours nombre de tours pour mélanger la grille
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        for (int i=0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules [i][j].eteindreCellule();
            }
        }
        
        for  (int tour =0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    /**
     * permet d'afficher l'état de la grille de manière structurée
     * @return représentation de la grille
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append(" |");
        for (int j = 0; j < nbColonnes; j++) {
            result.append(" ").append(j).append(" |");
        }
        result.append("\n");

        for (int i = 0; i <= 4 * nbColonnes; i++) {
            result.append("-");
        }
        result.append("\n");

        for (int i = 0; i < nbLignes; i++) {
            result.append(i).append("|");
            for (int j = 0; j < nbColonnes; j++) {
                result.append(" ").append(matriceCellules[i][j]).append(" |");
            }
            result.append("\n");

            for (int k = 0; k <= 4 * nbColonnes; k++) {
                result.append("-");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
