package DistributoreBevande;

import java.util.ArrayList;

//creazione classe
public class Categoria {
//attributi
	String nome;
	ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
	boolean controlloAggiuntivo;

	// costruttore
	public Categoria(String nome) {
		this.controlloAggiuntivo = false;
		this.nome = nome;
	}

	// metodo che stampa i prodotti dell' ArrayList prodotti
	public void stampaProdotti() {
		System.out.println("0) MENU' CATEGORIE");
		for (int i = 0; i < prodotti.size(); i++) {
			System.out.println((i + 1) + ")" + " " + prodotti.get(i).toString());
		}
	}
	
	public void cancellaProdotto(int indiceDaCancellare) {
		
		//controllare che l'indice inserito corrisponda ad un prodotto
		if (indiceDaCancellare >= 0 && indiceDaCancellare < prodotti.size()) {
			prodotti.remove(indiceDaCancellare);
			System.out.println("Prodotto rimosso con successo!");
		} else {
			System.out.println("Prodotto inesistente");
		}
		
	}
}
