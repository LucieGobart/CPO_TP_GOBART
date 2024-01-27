package lightoff_gobart_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucie
 */
public class CelluleLumineuse {
    private boolean etat; //Permet d'indiquer l'état de la cellule, true si elle est allumée, false si elle est éteinte
    
    /**
     * Permet d'initialiser l'état de la  nouvelle cellule en le mettant à "éteinte"
     */
    public CelluleLumineuse(){
        etat=false;
    }
    
    /**
     * Permet d'activer l'état de la cellule en inversant son état actuel
     */
    public void activerCellule(){
        etat=!etat;
    }
        
    /**
     * Permet de mettre l'état de la cellule à "éteinte" si ce n'était pas le cas avant
     */
    public void eteindreCellule(){
        if (etat) {
            etat=false;
        }
    }
    
    /**
     * Permet de vérifier que la cellule est bien éteinte
     * @return true si la cellule est éteinte et false si elle est allumée
     */
    public boolean estEteint(){
        return !etat;
    }
    
    /**
     * Permet de savoir l'état de la cellule
     * @return true si la cellule est allumée et false si elle est éteinte
     */
    public boolean getEtat(){
        return etat;
    }
    
    @Override
    public String toString() {
        return etat ? "X" : "O"; // "X": cellule allumée , "O": cellule éteinte
    }  
}
