package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

class FabbricaDiComandiFisarmonicaTest {

	private FabbricaDiComandiFisarmonica fabbrica;
	private IO io;
	
	@BeforeEach
	void setUp() throws Exception {
		io = new IOConsole();
		fabbrica = new FabbricaDiComandiFisarmonica(io);
	}

	@Test
	void testComando() {
		Comando comando = fabbrica.costruisciComando("posa");
		Comando prova = fabbrica.costruisciComando("posa");

		assertEquals(prova.getNome(),comando.getNome());
		assertEquals(prova.getParametro(),comando.getParametro());

		
	}
	
	@Test
	void testNonValido() {
		Comando comando = fabbrica.costruisciComando("getta");
		
		assertEquals("non valido",comando.getNome());
		
	}

}
