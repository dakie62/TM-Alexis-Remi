package fr.ab.testing.steps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import fr.ab.testing.steps.serenity.AideEtapes;
import net.thucydides.core.annotations.Steps;

public class AideDefinitions {
	@Steps
	AideEtapes aide;
	
	@Lorsque("^il clique sur le bouton Aide$")
	public void il_clique_sur_le_bouton_Aide() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		aide.clickAide();
	}

	@Lorsque("^il saisit sa recherche '(.*)'$")
	public void il_saisit_sa_recherche(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		aide.saisitRechercheAide(arg1);
	}

	@Alors("^le premier lien recommande est un lien des '(.*)'$")
	public void le_premier_lien_recommande_est_un_lien_des(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		aide.trouverConditionDannulation(arg1);
	}

	
	
}
