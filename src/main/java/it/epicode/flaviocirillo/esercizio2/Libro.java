package it.epicode.flaviocirillo.esercizio2;

import java.util.List;

public class Libro implements ElementoLibro {

	private List<Autore> autori;
	private int prezzo;
	List<Sezione> sezioni;
	
	public Libro(List<Autore> autori, int prezzo, List<Sezione> sezioni) {
		this.autori = autori;
		this.prezzo = prezzo;
		this.sezioni = sezioni;
	}

	@Override
	public void stampa() {
		System.out.println("Il libro è composto da " + getNumeroPagineSezioni() + " pagine");
	}
	
	public int getNumeroPagineSezioni() {
		int nPagineSezioni = 0;
		
		for(Sezione s : sezioni) {
			nPagineSezioni += s.getNumeroPagineSottosezioni();
		}
		
		return nPagineSezioni;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public List<Autore> getAutori() {
		return autori;
	}

	public void setAutori(List<Autore> autori) {
		this.autori = autori;
	}
	
}
