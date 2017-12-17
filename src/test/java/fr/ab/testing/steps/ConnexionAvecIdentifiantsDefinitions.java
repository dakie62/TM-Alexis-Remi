package fr.ab.testing.steps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;
import fr.ab.testing.steps.serenity.ConnexionEtapes;
import net.thucydides.core.annotations.Steps;


public class ConnexionAvecIdentifiantsDefinitions {
	@Steps
	ConnexionEtapes connexionEtapes;
	
	@Soit("^un utilisateur d'AirBnb$")
	public void un_utilisateur_d_AirBnb() throws Exception {
			connexionEtapes.ouvrirAirBnb();	    
	}


	@Lorsque("^il clique sur le bouton connexion$")
	public void il_clique_sur_le_bouton_connexion() throws Exception {
			connexionEtapes.connectionClick();
	}

	@Lorsque("^il saisit ses identifiants '(.*)' et '(.*)'$")
	public void il_saisit_ses_identifiants_et(String arg1, String arg2) throws Exception {
	    	connexionEtapes.remplirIdentifiants(arg1,arg2);
	    	connexionEtapes.send();
	}

	@Alors("^un onglet messagerie est apparu$")
	public void un_onglet_messagerie_est_apparu() throws Exception {
			connexionEtapes.isMessagerieVisible();
	}
		
}

