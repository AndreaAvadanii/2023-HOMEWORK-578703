package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando{

	private String prendiAttrezzo;
	private IO io;
	private final static String nome = "prendi";


	@Override
	public void esegui(Partita partita) {

		if(prendiAttrezzo == null) {

			io.mostraMessaggio("Quale attrezzo vuoi prendere?");
			prendiAttrezzo = io.leggiRiga();
		}

		if(partita.getStanzaCorrente().hasAttrezzo(prendiAttrezzo)) {				
			Attrezzo attrezzo = partita.getStanzaCorrente().getAttrezzo(prendiAttrezzo);
			if(partita.getGiocatore().getBorsa().addAttrezzo(attrezzo)) {
				partita.getStanzaCorrente().removeAttrezzo(attrezzo);
			}
			io.mostraMessaggio("L'attrezzo " + prendiAttrezzo + " è stato raccolto");
		} else
			io.mostraMessaggio("La stanza non contiene questo attrezzo");

		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());

	}

	@Override
	public void setParametro(String parametro) {
		this.prendiAttrezzo = parametro;		
	}

	@Override
	public String getParametro() {
		return this.prendiAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		this.io = io;

	}

	@Override
	public String getNome() {
		return nome;
	}

	public String getPrendiAttrezzo() {
		return prendiAttrezzo;
	}

	public void setPrendiAttrezzo(String prendiAttrezzo) {
		this.prendiAttrezzo = prendiAttrezzo;
	}

}
