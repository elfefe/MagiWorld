package com.felix.magiworld;

public class Guerrier extends Personnage {
    Guerrier(int joueur) {
        setClasseJoueur("Guerrier",joueur);
        ajoutDesPointsDeCaracteristiques();
    }
    @Override
    public void attaqueBasique(Personnage ennemi) {
        int coupdEpee = this.caracteristique[1];
        System.out.println("Joueur "+this.joueur+" utilise Coup d'Epée et inflige "+coupdEpee+" dommages.");
        ennemi.caracteristique[4] -= coupdEpee;
        if (ennemi.caracteristique[4]<=0)
            System.out.println("Joueur " + ennemi.joueur + " est mort");
    }

    @Override
    public void attaqueSpecial(Personnage ennemi) {
        int coupDeRage = this.caracteristique[1] * 2;
        System.out.println("Joueur "+this.joueur+" Coup de Rage et inflige "+coupDeRage+" dommages.");
        ennemi.caracteristique[4] -= coupDeRage;
        this.caracteristique[4] -= this.caracteristique[1]/2;
        System.out.println("Le joueur"+ennemi.joueur+" perd "+coupDeRage+" point de vie");
        if (ennemi.caracteristique[4]<=0)
            System.out.println("Joueur " + ennemi.joueur + " est mort");
        System.out.println("Le joueur"+this.joueur+" perd "+coupDeRage/4+" point de vie");
    }
}
