package com.felix.magiworld;

public abstract class Personnage {
    protected int niveau,vie,force,agilite,intelligence;
    abstract void attaqueBasique(Personnage ennemi);
    abstract void attaqueSpecial(Personnage ennemi);
    protected void setNiveau(int valeur){
        this.niveau = valeur;
    }
    protected void setVie(int valeur){
        this.vie = valeur;
    }
    protected void setForce(int valeur){
        this.force = valeur;
    }
    protected void setAgilite(int valeur){
        this.agilite = valeur;
    }
    protected void setIntelligence(int valeur){
        this.intelligence = valeur;
    }
}
