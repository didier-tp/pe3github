package com.capgemini.projetequipe3.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.projetequipe3.Convertisseur;

/*
 * toutes les classes dont le nom commence ou se termine par "test"
 * sont lancées automatiquement par maven (package ou install)
 */
public class TestConvertisseur {
	
	private static Convertisseur convertisseur;
	
	@BeforeClass
	public static void init() {
		System.out.println("méthode init appelée");
		convertisseur = new Convertisseur();
	}
	
	@Test
	public void testEuroToFranc() {
		double montantEnFranc = convertisseur.euroToFranc(15.0);
		Assert.assertEquals(98.0, montantEnFranc, 2.0);
		
	}
	
	@Test
	public void testFrancToEuro() {
		double montantEnEuro = convertisseur.francToEuro(98.0);
		Assert.assertEquals(15.0, montantEnEuro, 2.0);
		
	}

}
