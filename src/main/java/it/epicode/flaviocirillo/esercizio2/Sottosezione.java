package it.epicode.flaviocirillo.esercizio2;

public class Sottosezione implements ElementoLibro {

	private int nPagine;

	public Sottosezione(int nPagine) {
		this.nPagine = nPagine;
	}

	@Override
	public void stampa() {
		System.out.println("Questa sottosezione è formata da " + getNumeroPagine() + " pagine");
	}

	public int getNumeroPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}
	
}
