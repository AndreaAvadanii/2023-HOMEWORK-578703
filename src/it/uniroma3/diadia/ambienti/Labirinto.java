package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.Attrezzo;


/* Classe Labirinto - ha la responsabilità di creare il labirinto, di memorizzare
   la stanza iniziale (entrata) e quella finale (uscita) */


public class Labirinto {

	private Stanza entrata;
	private Stanza uscita;


	public Labirinto() {
		creaStanze();
	}


	public void creaStanze() {

		/* crea gli attrezzi */
		Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
		
		/*Stanza buia e bloccata*/
		Attrezzo chiave = new Attrezzo("chiave",1);
		

		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new Stanza("Aula N11");
		Stanza aulaN10 = new Stanza("Aula N10");
		Stanza laboratorio = new Stanza("Laboratorio Campus");
		Stanza biblioteca = new Stanza("Biblioteca");
		/*Stanza buia e bloccata*/
		StanzaBuia magazzino = new StanzaBuia ("Magazzino","lanterna");
		StanzaBloccata gabbiotto = new StanzaBloccata("Gabbiotto","sud","chiave");

		/* collega le stanze */
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);
		
		/*Stanza buia e bloccata*/
		laboratorio.impostaStanzaAdiacente("sud", gabbiotto);
		gabbiotto.impostaStanzaAdiacente("nord", magazzino);
		magazzino.impostaStanzaAdiacente("sud", gabbiotto);


		/* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		
		/*Stanza buia e bloccata*/
		atrio.addAttrezzo(chiave);

		// il gioco comincia nell'atrio
		setEntrata(atrio); 
		setUscita(biblioteca);
		
		
	}


	public Stanza getEntrata() {
		return entrata;
	}


	public void setEntrata(Stanza entrata) {
		this.entrata = entrata;
	}


	public Stanza getUscita() {
		return uscita;
	}


	public void setUscita(Stanza uscita) {
		this.uscita = uscita;
	}
}
