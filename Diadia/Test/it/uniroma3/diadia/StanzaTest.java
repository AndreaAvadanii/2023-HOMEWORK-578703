package it.uniroma3.diadia;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaTest {

	Stanza stanza1;
	Stanza stanza2;
	Attrezzo attrezzo;


	@BeforeEach
	void setUp() {

		stanza1 = new Stanza("Aula N11");
		stanza2= new Stanza("atrio");


		attrezzo = new Attrezzo("osso", 1);

	}

	@Test
	void testImpostaStanzaAdiacente() {
		stanza1.impostaStanzaAdiacente("ovest", stanza2);
		assertEquals(stanza2, stanza1.getStanzaAdiacente("ovest"));
	}

	@Test
	void testGetStanzaAdiacente() {
		assertNull(stanza1.getStanzaAdiacente("sud"));
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(this.stanza1.addAttrezzo(this.attrezzo));
	}

}
