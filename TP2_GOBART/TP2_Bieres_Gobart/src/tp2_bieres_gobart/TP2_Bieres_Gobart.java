/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_gobart;

/**
 *
 * @author Lucie, TP2 Bieres, 13/10/2023
 */
public class TP2_Bieres_Gobart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
  
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        secondeBiere.lireEtiquette();

        BouteilleBiere Biere3 = new BouteilleBiere("Corona", (float) 4.5, "Brasserie Le Détour");
        Biere3.Décapsuler(); 
        BouteilleBiere Biere4 = new BouteilleBiere("Heineken", (float) 5.0, "Brasserie Brewing bears");
        Biere4.Décapsuler();
        BouteilleBiere Biere5 = new BouteilleBiere("Budweiser", (float) 5.1, "Brasserie Sacrilège");
        Biere5.Décapsuler();

        System.out.println(Biere3 + "\n" + Biere4 + "\n" + Biere5);
    } 
}