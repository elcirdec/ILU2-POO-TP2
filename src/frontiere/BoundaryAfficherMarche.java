package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infosMarche=controlAfficherMarche.donnerInfosMarche();
		
		if(infosMarche.length==0) {
			System.out.println("Le marché est vide, revenez plus tard");
		}else {
			String vendeur,quantite,produit;
			System.out.println(nomAcheteur+", vous trouverez au marche ");
			for(int i =0;i<infosMarche.length-2;i++) {
				vendeur=infosMarche[i];
				quantite=infosMarche[i+1];
				produit=infosMarche[i+2];
				System.out.println("-"+vendeur+" qui vend "+quantite+" "+produit);
			}
		}
	}
}
