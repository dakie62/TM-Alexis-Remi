package fr.ab.testing.homePage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ContactPage  extends PageObject {

	//Déclaration des WebElements
	//<--
	@FindBy(css="div._1jl220aq:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)")
	WebElement lienApropos;
	@FindBy(css=".sidenav-list > li:nth-child(3) > a:nth-child(1)")
	WebElement lienCoordonnee;
	@FindBy(css=".text-copy > p:nth-child(9) > strong:nth-child(1)")
	WebElement numeroEntreprise;
	//-->

	
	//<--Déclaration des méthodes liées aux WebElements et aux features
	
	//Permet de cliquer sur le lien a propos tout en bas de la page
	public void clickSurApropos() {
		// TODO Auto-generated method stub
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		lienApropos.click();
	}

	//Permet de cliquer sur l'onglet coordonnée
	public void clickSurCoordonnee() {
		// TODO Auto-generated method stub
		lienCoordonnee.click();
	}

	//Permet de que les coordonnées contiennent le numéro de l'entreprise
	public void verifierChamp(String arg1) {
		// TODO Auto-generated method stub
		assertTrue(numeroEntreprise.getText().contains(arg1));
	}
	//-->
}
