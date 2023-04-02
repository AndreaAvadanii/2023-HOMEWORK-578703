package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

class LabirintoTest {

	private Labirinto labirinto;
	private Stanza entrata;
	private Stanza uscita;
	
	@BeforeEach
	void setUp() {
		
		this.labirinto = new Labirinto();
		labirinto.creaStanze();
		
		entrata = new Stanza("Atrio");
		uscita = new Stanza("Biblioteca");
	}

	@Test
	void testGetEntrata() {
		assertEquals(entrata.getNome(),labirinto.getEntrata().getNome());
	}

	@Test
	void testSetEntrata() {
		labirinto.setEntrata(uscita);
		assertEquals(uscita,labirinto.getEntrata());
	}

	@Test
	void testGetUscita() {
		assertEquals(uscita.getNome(),labirinto.getUscita().getNome());
	}

	@Test
	void testSetUscita() {
		labirinto.setUscita(entrata);
		assertEquals(entrata,labirinto.getUscita());
	}

}
