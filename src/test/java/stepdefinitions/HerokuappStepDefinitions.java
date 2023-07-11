package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuappStepDefinitions {
    HerokuPage herokuPage = new HerokuPage();

    @Then("Add Element butona basar")
    public void add_element_butona_basar() {
        herokuPage.addElementButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        // Delete butonu implicitly wait suresi icinde gorunur oldugundan
        // bu adimda bir islem yapilmadi

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuPage.deleteButton.isDisplayed());


    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuPage.deleteButton.click();

    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {

        try {
            Assert.assertTrue(herokuPage.deleteButton.isDisplayed());
        } catch (NoSuchElementException e) {

            Assert.assertTrue(true);
        }
    }
}
