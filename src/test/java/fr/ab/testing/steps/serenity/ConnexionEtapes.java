package fr.ab.testing.steps.serenity;


import fr.ab.testing.homePage.AirBnbPage;

public class ConnexionEtapes {
	private AirBnbPage airbnb;
	
	public void ouvrirAirBnb(){
		airbnb.maximiserChrome();
		airbnb.open();
	}

	public void connectionClick() {
		airbnb.connexionClick();
	}
	
	public void remplirIdentifiants(String arg1, String arg2) {
		airbnb.remplirToolbar(arg1,arg2);
	}


	public void send() {
		airbnb.envoyerLogin();
	}

	public void isMessagerieVisible() throws InterruptedException {
		airbnb.isMessagerieVisible();		
	}
	
}
