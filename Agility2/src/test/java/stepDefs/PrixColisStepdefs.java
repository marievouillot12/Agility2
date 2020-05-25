package stepDefs;

import java.util.ArrayList;
import java.util.List;
import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import livraison.Package;

public class PrixColisStepdefs {

    @Given("Un bon de livraison peut contenir plusieurs colis <packageList1>")
    public void poidsTotalColis() throws Exception {
        List<Package> packageList = new ArrayList<Package>();
        throw new PendingException();
    }
    @When("le client pèse l'ensemble de colis <packageList1> de poids total <totalWeight1> {double}")
    public void calculPoidsTotal(List<Package> packageList1, double totalWeight1) throws Exception {
        for (Package pack1 : packageList1)
            totalWeight1 += pack1.getWeight();
        throw new PendingException();
    }
    @Then("le prix du colis <price1> sera automatiquement calculé")
    public void calculPrix(double totalWeight1, double price1) throws Exception {
        price1 = totalWeight1*10.5;
        throw new PendingException();
    }
}
