package it.uniroma3.diadia;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoVai;

class ComandoVaiTest {
	
	private Stanza stanza1;
	private Stanza stanza2;
	private Comando vai;
	private Partita partita;
	

	@BeforeEach
	void setUp() throws Exception {
		
		stanza1 = new Stanza("Aula N11");
		stanza2= new Stanza("atrio");
		vai = new ComandoVai();
		partita = new Partita();
		vai.setIo(new IOConsole());
	}

	@Test
	void testEseguiDirezioneCorretta() {
		partita.setStanzaCorrente(stanza1);
		stanza1.impostaStanzaAdiacente("ovest", stanza2);
		vai.setParametro("ovest");
		vai.esegui(partita);
		assertEquals(stanza2, partita.getStanzaCorrente());
	}
	
	@Test
	void testEseguiDirezioneErrata() {
		partita.setStanzaCorrente(stanza1);
		stanza1.impostaStanzaAdiacente("ovest", stanza2);
		vai.setParametro("nord");
		vai.esegui(partita);
		assertFalse(partita.getStanzaCorrente().equals(stanza2));
	}

}
