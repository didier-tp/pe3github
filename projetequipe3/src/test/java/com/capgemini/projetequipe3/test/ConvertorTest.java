package com.capgemini.projetequipe3.test;

import org.junit.Assert;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.projetequipe3.Convertisseur;

//@Test et @Before necessite <dependency> junit dans pom.xml
/*
 * Les classes de Test sont par defaut déclenchées par maven
 * si leur noms commencent ou se terminent par "Test"
 */
public class ConvertorTest {
	
	private static Convertisseur convertisseur;//à tester
	
	@BeforeClass
	public static void init() {
		System.out.println("init appelé");
		convertisseur = new Convertisseur();	
	}
	
	@Test
	public void testEuroToFranc() {
		double sommeEnFranc = convertisseur.euroToFranc(15);//montantEnEuro * 6.55957;
		Assert.assertEquals(98.0, sommeEnFranc, 2.0);
	}
	
	@Test
	public void testFrancToEuro() {
		double sommeEnEuro = convertisseur.francToEuro(99);//montantEnFranc / 6.55957;
		Assert.assertEquals(15.0, sommeEnEuro, 0.5);
	}

}
