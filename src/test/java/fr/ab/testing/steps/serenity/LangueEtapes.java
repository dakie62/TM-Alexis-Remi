package fr.ab.testing.steps.serenity;

import fr.ab.testing.homePage.AirBnbPage;

public class LangueEtapes {
	private static AirBnbPage airBnb;
	
	public static void openAirBnb() {
		// TODO Auto-generated method stub
		airBnb.maximiserChrome();
		airBnb.open();
	}

	public static void choisirAnglais() throws InterruptedException {
		// TODO Auto-generated method stub
		airBnb.choisirAnglais();
	}

	public static void clickPrecedent() throws InterruptedException {
		// TODO Auto-generated method stub
		airBnb.open();
	}

	public static void langueEstFrancaise() {
		// TODO Auto-generated method stub
		airBnb.langueEstFrancaise();
	}

}
