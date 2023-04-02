package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;


/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	
	private Labirinto labirinto;
	private Giocatore giocatore;
	
	private boolean finita;

	public Partita(){

		labirinto = new Labirinto();
		giocatore = new Giocatore();
		labirinto.creaStanze();
		this.stanzaCorrente = labirinto.getEntrata() ;
		this.stanzaVincente = labirinto.getUscita();
	}


	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return getStanzaCorrente()== getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (giocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}



	public Labirinto getLabirinto() {
		return labirinto;
	}


	public void setLabirinto(Labirinto labirinto) {
		this.labirinto = labirinto;
	}	
	
	public Giocatore getGiocatore() {
		return giocatore;
	}
	
	public void setGiocatore(Giocatore giocatore) {
		this.giocatore = giocatore;
	}


	public Stanza getStanzaCorrente() {
		return stanzaCorrente;
	}


	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}


	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}


	public void setStanzaVincente(Stanza stanzaVincente) {
		this.stanzaVincente = stanzaVincente;
	}



}
