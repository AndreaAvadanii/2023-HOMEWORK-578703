package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PartitaTest {

	private Partita partita;
	
	@BeforeEach
	void setUp() {
		
		this.partita = new Partita();		
	}

	@Test
	void testIsFinita() {
		assertFalse(partita.isFinita());	
	}

	@Test
	void testGetStanzaVincente() {
		assertEquals("Biblioteca", partita.getStanzaVincente().getNome());
	}
	
	@Test
	void testVinta() {
		assertFalse(partita.vinta());
	}
	

}
