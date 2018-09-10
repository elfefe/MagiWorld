package com.felix.magiworld;

public class Rodeur extends Personnage {
    Rodeur(int joueur) {
        setClasseJoueur("Rodeur",joueur);
        ajoutDesPointsDeCaracteristiques();
    }
    @Override
    public void attaqueBasique(Personnage ennemi) {
        int tirAlArc = this.caracteristique[2];
        System.out.println("Joueur "+this.joueur+" utilise Tire à l'Arc et inflige "+tirAlArc+" dommages.");
        ennemi.caracteristique[4] -= tirAlArc;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+tirAlArc+" point de vie");
        if (ennemi.caracteristique[4]<=0)
            System.out.println("Joueur " + ennemi.joueur + " est mort");

    }

    @Override
    public void attaqueSpecial(Personnage ennemi) {
        int concentration = this.caracteristique[0] / 2;
        System.out.println("Joueur "+this.joueur+" utilise soin et gagne "+concentration+" en agilité.");
        this.caracteristique[2] += concentration;
    }


}
