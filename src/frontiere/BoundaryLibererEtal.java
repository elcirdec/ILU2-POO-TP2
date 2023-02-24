package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu=controlLibererEtal.isVendeur(nomVendeur);
		if(!vendeurReconnu) {
			System.out.println("Mais vous n'êtes pas inscript sur notre marché aujourd'hui");
		}else {
			String donneesEtal[]=controlLibererEtal.libererEtal(nomVendeur);
			if(donneesEtal[0]!=null) {
				String produit=donneesEtal[2];
				String quantiteInitial=donneesEtal[3];
				String quantiteVendu=donneesEtal[4];
				System.out.println("Vous avez vendu "+ quantiteInitial+" sur "+quantiteVendu+" "+produit+".\n");
				System.out.println("Au revoir "+nomVendeur+" ,passez une bonne journée");
			}
		}
	
	}

}
