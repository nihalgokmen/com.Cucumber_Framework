package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"html:target/cucumber-reports.html"},
    features = "src/test/recources/features",
    glue = "stepdefinitions",
    tags = "@ae",

    dryRun = true
)

public class Runner {

    /*
        Cucumber'da istedigimiz testleri calistirmak
        ve her calistirilan test icin rapor hazirlamak amaciyla kullanilir

        Runner class'i bos bir class'dir

        Belirtilen bu isleri class icerisindeki kodlar degil
        class deklerasyonunda kullancagimiz notasyonlar halleder

        @RunWith notasyonu framework'umuze JUnit yuklememizin sebebidir
                 ve Runner Class'inin cucumber ile calismasini saglar

         @CucumberOptions ise framework'umuzde gerekli ayarlari yapar

         features : feature dosyalarimizin bulundugu konumu gosterir
                    dikkat edilirse tek tek feature dosyalarini degil
                    tum feature dosyalarini iceren klasorun yolunu yazariz

         glue : feature dosyalari ile bagli olan
                Java method'larinin yerini gosterir
                Burada da tek tek class'lari degil
                tum class'lari iceren package'in adresini yazariz
                Boylece iligili step hangi class altinda olursa olsun
                cucumber bulup calistirir.

         tags : calistirilacak Feature veya Scenario()'lari isaretlemek icin kullanilir
                Cucumber Runner Class'i calistirildiginda tum feature dosyalarini
                gozden gecirir ve Runner Class'inda belirtilen tag'a sahip
                TUM  Feature ve Scenerio'lari calistirir

                Eger birden fazla tag'i kontrol ederek calaistirmasini istersek
                "@regression or @smoke" veya "@regression and @smoke" gibi yazabiliriz

         dryRun : Bir feature dosyasini ilk defa yazdigimizda
                step'lerden bazilari daha once var oldugundan BEYAZ
                bazilari ise ilk defa kullanacagimiz icin SARI olur

                Bu Feature dosyasini direk calistirmak istersek
                Bastan baslayarak beyaz olan adimlari calistirir
                Ilk sari adima geldiginde, exception firlatip
                calistirmayi denedigi ilk sari satir
                ve geriye kalan sari satirlarin
                eksik steplerini bize yazdirir

                Amacimiz Feature dosyasini calistirmak degil,
                sadece eksik step'lere ait kodlari olusturmak ise
                Runner class'inda dryRun = true yapip
                Runner class'ini calistiririz

                dryRun = true dedigimizde
                Cucumber testleri calistirmaz, sadece eksik adim var mi diye kontrol eder
                eksik adim yoksa Test PASSED yazar

                dryRun = false default degerdir
                ve Testleri normal olarak calistirmamizi saglar

     */
}
