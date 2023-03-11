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
		boolean villageois=controlAcheterProduit.verifierIdentite(nomAcheteur);
		if(!villageois) {
			System.out.println("Vous n'etes pas un villageois");
		}else {
			System.out.println("Quel produit voulez vous acheter ?");
			String produit=scan.nextLine();
			Gaulois[] etalProduit=controlAcheterProduit.trouverEtal(produit);
			System.out.println("Chez quels marchand voulez vous acheter des "+produit);
			for(int i=0;i<etalProduit.length;i++) {
				System.out.println(i+1+" - "+etalProduit[i].getNom());
			}
			System.out.println("Chez quel commercant voulez vous acheter?");
			int numCommercant=scan.nextInt();
			System.out.println(nomAcheteur+" se deplace jusqu'a l'etal du vendeur "+ etalProduit[numCommercant-1].getNom());
			System.out.println("Bonjour "+nomAcheteur);
			System.out.println("Combien de "+produit+" voulez vous acheter?");
			int nbrProduit=scan.nextInt();
			int quantiteAcheter=controlAcheterProduit.acheterProduit(etalProduit[numCommercant-1], nbrProduit);
			System.out.println(nomAcheteur+" a acheter "+quantiteAcheter+" "+produit+ " a "+ etalProduit[numCommercant-1].getNom());
			
			
		}
	}
}
