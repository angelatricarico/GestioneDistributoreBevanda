package DistributoreBevande;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        //nuovo oggetto distributore
		Distributore distributore = new Distributore("AllYouCanDrink");
		System.out.println("->BENVENUTO AL DISTRIBUTORE😊<- \n" + distributore.nome + "!🎉" + "\nSELEZIONARE CATEGORIA: ");

		Scanner scanner = new Scanner(System.in);

		int input;
        //MENU UTENTE
		input = 1;
		while (input == 1) {
			distributore.stampaCategorie();
			System.out.print("-> ");
			int sceltaCategoria=0;
			//GESTIONE DELL ERRORE SU INSERIMENTO CARATTERE ANZICHE NUMERO INTERO
			try {
			sceltaCategoria = scanner.nextInt();
			}
	       catch(Exception e){
	    	   System.out.println("Carattere non valido. Inserire numero intero."); 
	    	   scanner.nextLine();
	    	   continue;
	       }
			if (sceltaCategoria == 9) {
				System.out.println("Arrivederci👋");
				input = -1;
			} else if (distributore.modalitaOperatore(scanner, sceltaCategoria)) {
				continue;

			} else if (sceltaCategoria > distributore.categorie.length || sceltaCategoria<=0) {
				System.out.println("Input non valido. Per favore, riprovare.⚠️");
			} else {
				Categoria categoriaScelta = distributore.categorie[sceltaCategoria - 1];

				int sceltaProdotto = -1;
				while (true) {
					System.out.println("Ecco i seguenti prodotti della categoria " + categoriaScelta.nome + ":");
					distributore.categorie[sceltaCategoria - 1].stampaProdotti();
					System.out.println("Quale prodotto vuoi scegliere?");
					System.out.print("-> ");
					sceltaProdotto = scanner.nextInt();

					if (sceltaProdotto == 0) {
						break;
					} else if (sceltaProdotto > categoriaScelta.prodotti.size()||sceltaProdotto<0) {
						System.out.println("Input non valido. Per favore, riprovare.⚠️");
					} else {
						Prodotto prodottoScelto = categoriaScelta.prodotti.get(sceltaProdotto - 1);
						if (distributore.controlloQuantita(categoriaScelta, prodottoScelto, scanner)) {
							break;
						}

					}
				}
			}

		}
		scanner.close();
	}

}
