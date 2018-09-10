package com.felix.magiworld;

import java.util.*;

public abstract class Personnage
{
    private String classe;
    int joueur;
    int[] caracteristique = new int[5];
    /*
    * caracteristique[0] = niveau
    * caracteristique[1] = force
    * caracteristique[2] = agilité
    * caracteristique[3] = intelligence
    * caracteristique[4] = vie
    */
    private Scanner sc = new Scanner(System.in);

    public abstract void attaqueBasique(Personnage ennemi);
    public abstract void attaqueSpecial(Personnage ennemi);
    private String texteCaracteristique(int index){
        String[] quelleCaracteristique = new String[]{
                "Niveau du personnage ?",
                "Force du personnage ?",
                "Agilité du personnage ?",
                "Intelligence du personnage ?"
        };
        return quelleCaracteristique[index];
    }
    private boolean setCaracteristique(int index, int valeur){
        caracteristique[index] = valeur;
        caracteristique[4] = 5 * caracteristique[0];
        if (index == 0){
            if (valeur > 100){
                System.out.println("Votre niveau ne peut être superieur à 100.");
                return false;
            }if (valeur < 1){
                System.out.println("Votre niveau ne peut être inferieur à 1.");
                return false;
            }
        }else{
            if (valeur > caracteristique[0]) {
                System.out.println("Vos caractéristique ne peuvent pas être superieur à votre niveau.");
                return false;
            }else if (valeur < 0) {
                System.out.println("Vos caractéristique ne peuvent pas être négative.");
                return false;
            }
        }
        return true;
    }
    void ajoutDesPointsDeCaracteristiques(){
        for (int x=0;x<caracteristique.length-1;x++) {
            System.out.println(texteCaracteristique(x));
            int taCaracteristique = sc.nextInt();
            if (!setCaracteristique(x,taCaracteristique)){
                x--;
            }else if ((caracteristique[1] + caracteristique[2] + caracteristique[3] != caracteristique[0])&&(x == 3)) {
                System.out.println("Vos trois caractéristique réunies doivent être égal au niveau de votre joueur.");
                for (int y = 1;y<caracteristique.length-1;y++)
                    caracteristique[y] = 0;
                x = 0;
            }
        }
    }
    void setClasseJoueur(String classe, int joueur){
        this.classe = classe;
        this.joueur = joueur;
        System.out.println("Le joueur "+joueur+" est un "+classe+" !");
    }
}
