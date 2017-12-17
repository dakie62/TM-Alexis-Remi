package fr.ab.testing.steps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import fr.ab.testing.steps.serenity.PrixEtapes;
import net.thucydides.core.annotations.Steps;

public class PrixDefinitions {
	@Steps
	PrixEtapes prix;


	@Lorsque("^il clique sur le bouton Restaurant$")
	public void il_clique_sur_le_bouton_Restaurant() throws Exception {
		prix.clickBoutonRestaurant();
	}

	@Alors("^le premier restaurant affiché contient une tranche de prix '(.*)'$")
	public void le_premier_restaurant_affiché_contient_une_tranche_de_prix_par_personne(String arg1) throws Exception {
		prix.verifierPremierRestaurantDevise(arg1);
	}

}
