package DistributoreBevande;
//Creazione classe
public class Prodotto {	
	String nome;
	double prezzo;
	int quantita;
	int nAcquisti;

	// Costruttori
	public Prodotto(String nome) {
		this.nome = nome;
		this.prezzo = (double) Math.round((Math.random() * 3 + 1) * 100)/100;
		this.quantita = (int) (Math.random() * 21);
	}
	
	public Prodotto(String nome, int quantita, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}
	//metodi getter
	public String getNome() {
		return nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public int getQuantita() {
	    return quantita;	
	}
	//metodi setter
	public void setPrezzo(double prezzo) {
		this.prezzo=prezzo;
	}
	public void setQuantita(int quantita) {
	    this.quantita=quantita;	
	}
	
	@Override
	public String toString() {
				
		return String.format("%s - € %.2f - %d", nome, prezzo, quantita); //s per string, f per double, d per int
	}

}
