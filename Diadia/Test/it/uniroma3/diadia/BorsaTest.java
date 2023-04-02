package it.uniroma3.diadia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

class BorsaTest {

	private Borsa borsa;
	private Attrezzo attrezzo;
	
	@BeforeEach
	void setUp() {
		
		borsa = new Borsa(10);
		this.attrezzo = new Attrezzo("Spada", 10);
		
		borsa.addAttrezzo(attrezzo);
		
		
	}
	
	@Test
	void testAddAttrezzo() {
		assertFalse(this.borsa.addAttrezzo(attrezzo));
	}

	@Test
	void testGetPeso() {
		assertEquals(10,this.borsa.getPeso());
	}
	
	@Test 
	void testRemoveAttrezzo() {
		assertEquals(null,this.borsa.removeAttrezzo(null));
	}

	

}
