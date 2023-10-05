/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_gobart1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lucie, TP1 Statistiques, 05/10/2023
 */
public class TP1_stats_GOBART1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        
        int[] tab = new int[6];
        
        System.out.print("Entrez un nombre entier m : ");
        int m = sc.nextInt();
       
        Random random = new Random();
        
        for (int i = 0; i < m; i++) {
            int resultatLancer = random.nextInt(6);
           
            tab[resultatLancer]++;
        }
        
        
        System.out.println("Résultats sous forme de pourcentages :");
        for (int i = 0; i < tab.length; i++) {
            double pourcentage = (double) tab[i] / m * 100;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }
       
        sc.close();
    }
    
}
