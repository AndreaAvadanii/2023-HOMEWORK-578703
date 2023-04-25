package it.uniroma3.diadia;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPrendi;

class ComandoPrendiTest {
	
	private Partita partita;
	private Attrezzo attrezzo;
	private Attrezzo attrezzoErrato;
	private Attrezzo attrezzoPesante;
	private IO io;
	private Comando comando;

	@BeforeEach
	void setUp() throws Exception {
		partita = new Partita();
		attrezzo = new Attrezzo("arco",5);
		attrezzoErrato = new Attrezzo("Balestra",2);
		attrezzoPesante = new Attrezzo("Masso",100);
		comando = new ComandoPrendi();
		io = new IOConsole();
		comando.setIo(io);
		
	}

	@Test
	void testEseguiAttrezzoBase() {
		partita.getStanzaCorrente().addAttrezzo(attrezzo);
		comando.setParametro("arco");
		comando.esegui(partita);
		assertTrue(partita.getGiocatore().getBorsa().getAttrezzo("arco").equals(attrezzo));
	}
	
	@Test
	void testEseguiAttrezzoErrato() {
		partita.getStanzaCorrente().addAttrezzo(attrezzo);
		comando.setParametro("Arco");
		comando.esegui(partita);
		assertFalse(partita.getGiocatore().getBorsa().equals(attrezzoErrato));
	}
	
	@Test
	void testEseguiAttrezzoPesante() {
		partita.getStanzaCorrente().addAttrezzo(attrezzoPesante);
		comando.setParametro("Masso");
		comando.esegui(partita);
		assertFalse(partita.getGiocatore().getBorsa().equals("Masso"));
	}
	
	
	

}
