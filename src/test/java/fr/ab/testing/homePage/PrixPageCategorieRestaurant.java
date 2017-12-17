package fr.ab.testing.homePage;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.functions.ExpectedCondition;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class PrixPageCategorieRestaurant  extends PageObject{

	//Permet de cliquer sur la catégorie restaurant visible à l'accueil
	public void clickBoutonRestaurant() {
		// TODO Auto-generated method stub
		$("#site-content > div > div > div > div > div:nth-child(1) > div > div > div:nth-child(3) > div > div > div > div:nth-child(3) > div > button > div > div > div._ni9axhe > div").click();
	}


	//Permet de Verifier qu'il y a un prix dans le premier restaurant proposé
	public void verifierPremierRestaurantDevise(String arg) {
		WebElement descriptionPremierRestaurant=$("#site-content > div > div:nth-child(1) > div._e55k2of > div > div > div:nth-child(2) > div > div > div:nth-child(3) > div > div:nth-child(1)");
		((JavascriptExecutor) getDriver()).executeScript("window.scrollBy(0,150)", "");
		assertTrue(element(descriptionPremierRestaurant).getText().contains(arg));
	}

}
