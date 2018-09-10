package com.felix.magiworld;

import java.util.*;

public abstract class Personnage
{
    protected int[] caracteristique = new int[5];
    protected Scanner sc = new Scanner(System.in);

    abstract void attaqueBasique(Personnage ennemi);
    abstract void attaqueSpecial(Personnage ennemi);
    protected String caracteristique(int index,int valeur){
        String[] quelleCaracteristique = new String[]{
                "Niveau de ton personnage ?",
                "Vie de ton personnage ?",
                "Force de ton personnage ?",
                "Agilité de ton personnage ?",
                "Intelligence de ton personnage ?"
        };
        caracteristique[index] = valeur;
        if (caracteristique[0] > 100|| caracteristique[0] < 0)
            return "Vous vous êtes trompé, Veuillez recommencer.";
        return quelleCaracteristique[index];
    }
    protected void creationDesPersonnages(){
        for (int x=0;x<5;x++) {
            int taCaracteristique = sc.nextInt();
            if (caracteristique(x, taCaracteristique) == "Vous vous êtes trompé, Veuillez recommencer."){
                System.out.println(caracteristique(x, taCaracteristique));
                x--;
            }
            else System.out.println(caracteristique(x, taCaracteristique));
        }
    }
}
