package com.felix.magiworld;

public class Mage extends Personnage {
    public Mage(int joueur) {
        setClasseJoueur("Mage",joueur);
        ajoutDesPointsDeCaracteristiques();
    }

    @Override
    public void attaqueBasique(Personnage ennemi) {
        int bouleDeFeu = this.caracteristique[3];
        System.out.println("Vous lancez une boule de feu !");
        ennemi.caracteristique[4] -= bouleDeFeu;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+bouleDeFeu+" point de vie !");
        if (ennemi.caracteristique[4]<=0)
            System.out.println("Joueur " + ennemi.joueur + " est mort");
    }

    @Override
    public void attaqueSpecial(Personnage ennemi) {
        int poinDeVieMax = caracteristique[0] * 5;
        int soin = this.caracteristique[3] * 2;
        System.out.println("Vous utilisez soin !");
        if (caracteristique[4] < poinDeVieMax){
            caracteristique[4] += soin;
            System.out.println("Le joueur "+this.joueur+" a récupéré"+caracteristique[4] + soin+" points de vie !");
        }
        else if(caracteristique[4] + soin > poinDeVieMax){
            caracteristique[4] = poinDeVieMax;
        }
    }

}
