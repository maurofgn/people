package org.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mf.util.people.Comune;
import org.mf.util.people.People;
import org.mf.util.people.Person;
import org.mf.util.people.Provincia;
import org.mf.util.people.Regione;

public class Comuni {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * lettura del file csv, carico degli oggetti e visualizzazione dei dati contenuti  
	 */
	@Test
	public void regions() {
		List<Regione> regions = People.getRegions();

		if (regions != null) {
			for (Regione r : regions) {
				System.out.println("Regione: " + r);
				for (Provincia p : r.getProvincie()) {
					System.out.println("\tProvincia: " + p);
					for (Comune c : p.getComuni()) {
						System.out.println("\t\t" + c);
					}
				}
			}
		}
	}
	
	@Test
	public void randomComune() {
		
		List<Comune> comuni = People.getComuniRandom(100);
		if (comuni != null) {
			for (Comune c : comuni) {
				System.out.println("\t\t" + c);
			}
		}
	}
	
	@Test
	public void people() {
		List<Person> people = People.getPeople(100);
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
}
