package com.felix.magiworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    private  int niveau,vie,force,agilite,intelligence;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    void attaqueBasique() {
    }

    @Test
    void attaqueSpecial() {
    }

    @Test
    void setNiveau(int valeur) {
        if (valeur <= 0 || valeur > 100){
            fail("Vous ne pouvez être niveau"+valeur+". Seuls les joueurs de niveau 1 à 100 sont autorisés.");
        }
    }

    @Test
    void setVie(int valeur) {
        if(valeur > niveau)
            fail("Vous ne pouvez avoir une caracteristique plus grande que votre niveau !");
    }

    @Test
    void setForce(int valeur) {
        if(valeur > niveau)
            fail("Vous ne pouvez avoir une caracteristique plus grande que votre niveau !");
    }

    @Test
    void setAgilite(int valeur) {
        if(valeur > niveau)
            fail("Vous ne pouvez avoir une caracteristique plus grande que votre niveau !");
    }

    @Test
    void setIntelligence(int valeur) {
        if(valeur > niveau)
            fail("Vous ne pouvez avoir une caracteristique plus grande que votre niveau !");
    }
}