package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		boolean villageois=controlAcheterProduit.VerifierIdentite(nomAcheteur);
		if(!villageois) {
			System.out.println("Vous n'etes pas un villageois");
		}else {
			System.out.println("Quel produit voulez vous acheter ?");
			String produit=scan.nextLine();
			Gaulois[] etalProduit=controlAcheterProduit.TrouverEtal(produit);
			System.out.println("Chez quels marchand voulez vous acheter des "+produit);
			for(int i=0;i<etalProduit.length;i++) {
				System.out.println("- "+etalProduit[i].getNom());
			}
			
		}
	}
}
