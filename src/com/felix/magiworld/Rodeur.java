package com.felix.magiworld;

public class Rodeur extends Personnage {
    public Rodeur(int joueur) {
        setClasseJoueur("Rodeur",joueur);
        ajoutDesPointsDeCaracteristiques();
    }
    @Override
    public void attaqueBasique(Personnage ennemi) {
        int tirAlArc = this.caracteristique[2];
        System.out.println("Vous effectuez un tir à l'arc !");
        ennemi.caracteristique[4] -= tirAlArc;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+tirAlArc+" point de vie !");

    }

    @Override
    public void attaqueSpecial(Personnage ennemi) {
        int concentration = this.caracteristique[0] / 2;
        System.out.println("Vous utilisez votre concentration !");
        this.caracteristique[2] += concentration;
        System.out.println("Le joueur "+this.joueur+" a gagné "+concentration+" en agilité !");
    }


}
