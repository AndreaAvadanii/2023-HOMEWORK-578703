package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBloccata;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBloccataTest {

	private StanzaBloccata stanzabloccata;
	private Stanza stanza;
	private Attrezzo attrezzo;
	
	@BeforeEach
	void setUp() throws Exception {
		stanzabloccata = new StanzaBloccata("StanzaBloccata", "est", "chiave");
		stanza = new Stanza ("Corridoio");
		attrezzo = new Attrezzo("chiave", 1);
		stanzabloccata.impostaStanzaAdiacente("est", stanza);

	}

	@Test
	void testStanzaBloccata() {
		stanzabloccata.addAttrezzo(attrezzo);
		assertEquals(stanza, stanzabloccata.getStanzaAdiacente("est"));

	}
	@Test
	public void testDescrizione() {
		assertEquals("Stanza bloccata puoi accedere con la chiave", stanzabloccata.getDescrizione());
		
	}

}
