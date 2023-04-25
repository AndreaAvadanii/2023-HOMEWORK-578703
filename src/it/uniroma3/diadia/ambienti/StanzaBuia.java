package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {

	private String attrezzo;
	
	public StanzaBuia(String nome , String attrezzo) {
		super(nome);
		this.attrezzo = attrezzo;
	}

	@Override
	public String getDescrizione() {
		String buio;
		buio = "qui c'è un buio pesto";
		if(!this.hasAttrezzo(attrezzo))
			return buio;
		return super.getDescrizione();
	}
}