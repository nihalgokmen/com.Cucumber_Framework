package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @When("Nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.aramaCubugu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualSonucYazisi = amazonPage.aramaSonucYazisi.getText();
        String expected = "Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expected));
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("Java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaCubugu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actualSonucYazisi = amazonPage.aramaSonucYazisi.getText();
        String expected = "Java";
        Assert.assertTrue(actualSonucYazisi.contains(expected));
    }

    @When("Samsung icin arama yapar")
    public void samsung_icin_arama_yapar() {
        amazonPage.aramaCubugu.sendKeys("Samsung" + Keys.ENTER);
    }
    @Then("Arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actualSonucYazisi = amazonPage.aramaSonucYazisi.getText();
        String expected = "Samsung";
        Assert.assertTrue(actualSonucYazisi.contains(expected));
    }

    @Then("Title'in Amazon icerdigini test eder")
    public void titleInAmazonIcerdiginiTestEder() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @Given("Kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) { // amazonUrl , wiseUrl, facebookUrl

        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @When("{string} icin arama yapar")
    public void icinAramaYapar(String aranacakKelime) {

        amazonPage.aramaCubugu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @Then("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String expectedIcerik) {

        String actualAramaSonucu= amazonPage.aramaSonucYazisi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSaniye) {

        // cucumber sayi yazildiginda direk parametre olarak kabul eder

        try {
            Thread.sleep(beklenecekSaniye * 1000);
        } catch (InterruptedException e) {

        }
    }


    @Then("ilk urune click yapar")
    public void ilk_urune_click_yapar() {
        amazonPage.ilkUrunLocate.click();
    }
    @Then("acilan urun isminin {string} icerdigini test eder")
    public void acilan_urun_isminin_icerdigini_test_eder(String arananKelime) {
        String actualUrunIsim = amazonPage.ilkUrunIsimi.getText();
        Assert.assertTrue(actualUrunIsim.contains(arananKelime));
    }
}
