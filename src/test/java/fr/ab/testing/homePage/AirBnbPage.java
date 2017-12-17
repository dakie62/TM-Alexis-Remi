package fr.ab.testing.homePage;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.airbnb.fr/")
public class AirBnbPage extends PageObject {
	
	//Déclaration des WebElements
	//<--
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/header/div/div/div[3]/div/nav/ul/li[8]/div/div/div/a/div/div/span")
	WebElement connexion;
	@FindBy(id="email-login-email")
	WebElement idBar;
	@FindBy(id="email-login-password")
	WebElement motDePasseBar;
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/header/div/div/div[3]/div/nav/ul/li[7]/div/div")
	WebElement messagerie;
	@FindBy(id="language-selector")
	WebElement barreDeLangue;
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/header/div/div/div[3]/div/nav/ul/li[6]/div/div/button")
	WebElement aide;
	@FindBy(xpath="//*[@id=\"field-guide-container\"]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/input[1]")
	WebElement barreDeRechercheDaide;
	//-->

	
	//<--Déclaration des méthodes liées aux WebElements et aux features
	public void connexionClick() {
		connexion.click();
	}

	//Permet de remplir les inputs des identifiants
	public void remplirToolbar(String id,String motDePasse) {
		element(idBar).clear();
		element(idBar).type(id);
		element(motDePasseBar).clear();
		element(motDePasseBar).type(motDePasse);
	}

	//Permet d'envoyer les logins pour verification au serveur
	public void envoyerLogin() {
		($("._1r3muaxb")).click();
	}

	//Augmente la taille du client Chrome
	public void maximiserChrome() {
		getDriver().manage().window().maximize();
	}

	//Permet de verifier que l'onglet Messagerie est visible
	public void isMessagerieVisible() throws InterruptedException {
		element(messagerie).waitUntilVisible();
		Thread.sleep(2000);
		assertTrue(element(messagerie).isVisible());
	}
	
	//Permet de selectionner la langue anglaise
	public void choisirAnglais() throws InterruptedException {
		// TODO Auto-generated method stub
		element(barreDeLangue).selectByValue("en");
		Thread.sleep(1000);
	}

	//permet de retourner/rafraichir le lien AirBnb
	public void precedent() throws InterruptedException {
		// TODO Auto-generated method stub
		getDriver().navigate().refresh();
		Thread.sleep(1000);
	}

	//Permet de verifier que la langue selectionné est Française
	public void langueEstFrancaise() {
		// TODO Auto-generated method stub
		assertTrue(element(barreDeLangue).getValue().equals("fr"));
	}

	//Permet de cliquer sur l'onglet d'aide
	public void clickAide() {
		// TODO Auto-generated method stub
		aide.click();
	}

	//Permet de saisir une recherche dans l'aide (donnée dans la feature)
	public void saisitRechercheAide(String arg1) {
		barreDeRechercheDaide.clear();
		element(barreDeRechercheDaide).typeAndEnter(arg1);
	}

	//Permet de verifier que le premier article contient les champs "condition d'annulation"
	public void trouverConditionDannulation(String arg1) {
		// TODO Auto-generated method stub
		WebElement article0=$("#ArticleLink0");
		assertTrue(article0.getText().contains(arg1));
	}

	

	
	//-->

}
