package fr.ab.testing.steps;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;
import fr.ab.testing.steps.serenity.LangueEtapes;
import net.thucydides.core.annotations.Steps;



public class ChangementDeLangueDefinitions {
	
	@Steps 
	LangueEtapes langueEtapes;

	@Soit("^un utilisateur AirBnb$")
	public void un_utilisateur_AirBnb() throws Exception {
			LangueEtapes.openAirBnb();
	}


	@Lorsque("^il clique sur Français et choisit Anglais$")
	public void il_clique_sur_Français_et_choisit_Anglais() throws Exception {
			LangueEtapes.choisirAnglais();
	}

	@Lorsque("^il se connecte à nouveau sur airBnb$")
	public void il_se_connecte_à_nouveau_sur_airBnb() throws Exception {
			LangueEtapes.clickPrecedent();
	}

	@Alors("^la langue est redevenu française$")
	public void la_langue_est_redevenu_française() throws Exception {
			LangueEtapes.langueEstFrancaise();
	}

}
