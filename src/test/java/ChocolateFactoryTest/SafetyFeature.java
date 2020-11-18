package ChocolateFactoryTest;

import ChocolateFactory.BouilleurChocolat;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SafetyFeature {

    private BouilleurChocolat A;
    private BouilleurChocolat B;

    @Given("^A is BouilleurChocolat and B is BouilleurChocolat$")
    public void aIsBouilleurChocolatAndBIsBouilleurChocolat() {
        A = BouilleurChocolat.getInstance();
        B = BouilleurChocolat.getInstance();
    }

    @When("^A is ordered to fill and boil$")
    public void aIsOrderedToFillAndBoil() {
        A.remplir();
        A.bouillir();
    }

    @Then("^B cannot boil$")
    public void bCannotBoil() {
        assertEquals("", B.bouillir());
    }

}
