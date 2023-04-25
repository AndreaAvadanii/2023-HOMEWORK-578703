package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando{

	private String posaAttrezzo;
	private IO io;
	private final static String nome = "posa";


	@Override
	public void esegui(Partita partita) {

		if(posaAttrezzo == null) {

			io.mostraMessaggio("Quale attrezzo vuoi posare?");
			posaAttrezzo = io.leggiRiga();
		}

		if(partita.getGiocatore().getBorsa().hasAttrezzo(posaAttrezzo)) {			

			Attrezzo attrezzo = partita.getGiocatore().getBorsa().getAttrezzo(posaAttrezzo);
			partita.getGiocatore().getBorsa().removeAttrezzo(posaAttrezzo);

			partita.getStanzaCorrente().addAttrezzo(attrezzo);
		} else
			System.out.println("La borsa non contiene questo attrezzo");

		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());



	}

	@Override
	public void setParametro(String parametro) {
		this.posaAttrezzo = parametro;

	}

	@Override
	public String getParametro() {
		return this.posaAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		this.io = io;
	}

	@Override
	public String getNome() {
		return nome;
	}
	public String getPosaAttrezzo() {
		return posaAttrezzo;
	}

	public void setPosaAttrezzo(String posaAttrezzo) {
		this.posaAttrezzo = posaAttrezzo;
	}

}
