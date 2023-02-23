package it.epicode.flaviocirillo.esercizio2;

import java.util.List;

public class Sezione implements ElementoLibro {
	
	List<Sottosezione> sottosezioni;
	
	public Sezione(List<Sottosezione> sottosezioni) {
		this.sottosezioni = sottosezioni;
	}

	@Override
	public void stampa() {
		System.out.println("Questa sezione è formata da " + getNumeroPagineSottosezioni() + " pagine");
	}
	
	public int getNumeroPagineSottosezioni() {
		int nPagineSottosezioni = 0;
		
		for(Sottosezione s : sottosezioni) {
			nPagineSottosezioni += s.getNumeroPagine();
		}
		
		return nPagineSottosezioni;
	}

}
