package stepDefs;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import livraison.Package;

public class PoidsColisStepdefs {

        @Given("le poids total du colis {Package} avec un poids initial weight1 de 0.1 {double}")
        public void poidsColis(double weight1) throws Exception {
                Package pack1 = new Package(weight1);
                throw new PendingException();
        }
        @When("le client charge le colis")
        public void chargeColis(double weight1) throws Exception {
                Package pack1 = new Package(weight1);
                pack1.getWeight();
                throw new PendingException();
        }
        @Then("le poids du colis weight2 {double} sera automatiquement calculé")
        public void calculPoids(double weight1, double charge1) throws Exception {
                Package pack1 = new Package(weight1);
                pack1.getWeight();
                weight1 += charge1;
                throw new PendingException();
        }
}
