package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	public boolean verifierIdentite(String nomVendeur) {
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
	}
	public Gaulois[] trouverEtal(String produit) {		
		return village.rechercherVendeursProduit(produit);
	}
	public int acheterProduit(Gaulois gaulois,int quantite) {		
		Etal etalVendeur = controlTrouverEtalVendeur.trouverEtalVendeur(gaulois.getNom());
		return etalVendeur.acheterProduit(quantite);
	}
}
