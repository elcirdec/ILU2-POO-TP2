package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		Boolean nomVendeurConnu=controlPrendreEtal.verifierIdentite(nomVendeur);
		if(!nomVendeurConnu) {
			System.out.println("Je suis désolée "+nomVendeur+" je vais regarder si je peux vous trouver un etal.\n");
		}else {
			System.out.println("Bonjour "+nomVendeur+" je vais regarder si je peux vous trouver un etal.\n");
			Boolean etalDisponible= controlPrendreEtal.resteEtals();
			if(!etalDisponible) {
				System.out.println("Désolée "+nomVendeur+" jen'ai plus d'etal qui ne soit pas deja occupé\n");
			}else {
				installerVendeur(nomVendeur);
			}
		}
	}

	private void installerVendeur(String nomVendeur) {
		System.out.println("C'est parfait, il me reste un etal pour vous !\n");
		System.out.println("Il me faudrait quelques renseignements :\n");
		System.out.println("Quel produit souhaitez vous vendre ?\n");
		String produit=scan.nextLine();
		int nbProduit = Clavier.entrerEntier("Combien souhaitez vous en vendre?\n");
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if(numeroEtal!=-1) {
			System.out.println("Le vendeur "+nomVendeur+" s'est installé a l'étal n° "+(numeroEtal+1));
		}
	}
}
