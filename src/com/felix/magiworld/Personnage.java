package com.felix.magiworld;

import java.util.*;

public abstract class Personnage
{
    protected int[] caracteristique = new int[5];
    /*
    * caracteristique[0] = niveau
    * caracteristique[1] = force
    * caracteristique[2] = agilité
    * caracteristique[3] = intelligence
    * caracteristique[4] = vie
    */
    protected Scanner sc = new Scanner(System.in);

    abstract void attaqueBasique(Personnage ennemi);
    abstract void attaqueSpecial(Personnage ennemi);
    protected String texteCaracteristique(int index){
        String[] quelleCaracteristique = new String[]{
                "Niveau de ton personnage ?",
                "Force de ton personnage ?",
                "Agilité de ton personnage ?",
                "Intelligence de ton personnage ?"
        };
        return quelleCaracteristique[index];
    }
    protected boolean setCaracteristique(int index, int valeur){
        caracteristique[index] = valeur;
        caracteristique[4] = 5 * caracteristique[0];
        if (index == 0){
            if (valeur > 100 || valeur < 1){
                System.out.println("Votre niveau ne peut être superieur à 100.");
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
    protected void creationDesPersonnages(){
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
}
