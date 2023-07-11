package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.tr.Fakat;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExPage;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutomationExPage automationExPage = new AutomationExPage();
    Faker faker = new Faker();
    String emailAdress;
    Actions actions;

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {
        automationExPage.singUpLinki.click();
    }
    @Given("user Create an account bölümüne name ve email adresi girer")
    public void user_create_an_account_bolumune_name_ve_email_adresi_girer() {
        // boyle de olabilir
        automationExPage.singUpName.sendKeys(faker.name().firstName());

        // boyle de olabilir
        emailAdress = faker.internet().emailAddress();
        automationExPage.singUpEmail.sendKeys(emailAdress);

    }
    @Given("signUp butonuna basar")
    public void sign_up_butonuna_basar() {
        automationExPage.singUpButton.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        actions = new Actions(Driver.getDriver());
        actions.click(automationExPage.mrsButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("August")
                .sendKeys(Keys.TAB)
                .sendKeys("2002")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .perform();

    }
    @Given("user Create Account butonuna basar")
    public void user_create_account_butonuna_basar() {

    }
    @Then("hesap olustugunu test edin")
    public void hesap_olustugunu_test_edin() {

    }

}
