package fr.ab.testing.steps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import fr.ab.testing.steps.serenity.AproposEtapes;
import net.thucydides.core.annotations.Steps;

public class AproposDefinitions {
	@Steps
	AproposEtapes aPropos;

	@Lorsque("^le lien a propos est clické$")
	public void le_lien_a_propos_est_clické() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		aPropos.clickSurApropos();
	}

	@Lorsque("^le lien coordonnée est clické$")
	public void le_lien_coordonnée_est_clické() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		aPropos.clickSurCoordonnee();
	}


	@Alors("^la page contient un champ '(.*)'$")
	public void la_page_contient_un_champ(String arg1) throws Exception {
		aPropos.verifierChamp(arg1);
	}

}
