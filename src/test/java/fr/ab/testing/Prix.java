package fr.ab.testing;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/prix/trouverPrix.feature")
public class Prix {

}
