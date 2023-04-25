package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoPosa;

class ComandoPosaTest {

	private Partita partita;
	private Attrezzo attrezzo;
	private IO io;
	private Comando comando;
	
	@BeforeEach
	void setUp() throws Exception {
		partita = new Partita();
		attrezzo = new Attrezzo("arco",5);
		comando = new ComandoPosa();
		io = new IOConsole();
		comando.setIo(io);
	}

	@Test
	void testEseguiBase() {
		partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
		comando.setParametro("arco");
		comando.esegui(partita);
		assertEquals(attrezzo,partita.getStanzaCorrente().getAttrezzo("arco"));
	}
	@Test
	void testEseguiInesistente() {
		partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
		comando.setParametro("Mela");
		comando.esegui(partita);
		assertEquals(null,partita.getStanzaCorrente().getAttrezzo("Mela"));
	}

}
