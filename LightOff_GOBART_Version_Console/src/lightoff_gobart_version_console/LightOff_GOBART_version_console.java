/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_gobart_version_console;

/**
 *
 * @author lucie
 */
import java.util.Scanner;

public class LightOff_GOBART_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Demande à l'utilisateur de choisir la taille de la grille
    System.out.print("Entrez la taille de la grille (nombre de lignes et de colonnes) : ");
    int tailleGrille = sc.nextInt();
    
        
    Partie partie = new Partie(tailleGrille, tailleGrille,10);   
    partie.initialiserPartie();   
    partie.lancerPartie();
    }
}
