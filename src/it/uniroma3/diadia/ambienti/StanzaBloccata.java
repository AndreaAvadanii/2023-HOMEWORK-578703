package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {

	private String direzione;
	private String attrezzo;

	public StanzaBloccata(String nome, String direzione, String attrezzo) {
		super(nome);
		this.direzione = direzione;
		this.attrezzo = attrezzo;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzione.equals(this.direzione) && !this.hasAttrezzo(attrezzo)) {
			return this;
		}
		return super.getStanzaAdiacente(direzione);
	}

	@Override
	public String getDescrizione() {

		if(!this.hasAttrezzo(attrezzo))
			return "Stanza bloccata puoi accedere con la "+attrezzo;
		return super.getDescrizione();
	}
}
