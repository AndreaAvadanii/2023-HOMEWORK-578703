package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBuia;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBuiaTest {

	private StanzaBuia stanza;
	private Attrezzo lampada;
	
	@BeforeEach
	void setUp() throws Exception {
		lampada = new Attrezzo("lampada",3);
		stanza = new StanzaBuia("laboratorio","lampada");
	}

	@Test
	void testStanzaBuia() {
		stanza.addAttrezzo(lampada);
		assertEquals(stanza.toString(), stanza.getDescrizione());
	}
	@Test
	void testStanzaBuiaSenzaAttrezzo() {
		assertEquals("qui c'è un buio pesto", stanza.getDescrizione());
	}

}
