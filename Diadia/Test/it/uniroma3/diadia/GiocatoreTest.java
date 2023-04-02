package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

class GiocatoreTest {

	private Giocatore giocatore;
	
	@BeforeEach
	void setUp() {
		giocatore = new Giocatore();
	}

	@Test
	void testGetBorsa() {
		assertNotNull(this.giocatore.getBorsa());
	}

	@Test
	void testGetCfu() {
		assertEquals(20,giocatore.getCfu());
	}

	@Test
	void testSetCfu() {
		giocatore.setCfu(12);
		assertEquals(12,giocatore.getCfu());
	}

}
