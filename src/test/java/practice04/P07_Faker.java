package practice04;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class P07_Faker extends TestBase {

    @Test
    public void name() throws InterruptedException {
   /*
                               - FAKER -
        Faker class'ı, adlar, telefon numaraları, adresler, SSN vb.
    gibi gerçek görünümlü verileri dinamik olarak oluşturmanıza olanak tanır.
    Web uygulamanızın bunları doğru bir şekilde kaydedeceğini bildiğiniz sürece,
    çoğu zaman ad veya adres gibi bu değerlerin ne olduğu umurunuzda olmaz ve faker kullanmak
    bu verileri modellemenize ve bu alanlar için şimdiye kadar test çalıştırması için yeni dinamik
    değerler oluşturmanıza olanak tanır.
        Faker class'ını kullanabilmemiz için mvn repository adresinden java faker kütüphanesini
    projemize eklememiz gerekmektedir.
     */
        //"https://demoqa.com/automation-practice-form"  Adresine gidin
        // Formu doldurunuz
        // Sayfayi kapatin

            //"https://demoqa.com/automation-practice-form"  Adresine gidin
            driver.get("https://demoqa.com/automation-practice-form");
            // Formu doldurunuz
            Faker faker = new Faker();
            WebElement firstName = driver.findElement(By.id("firstName"));
            firstName.sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),Keys.TAB,
                    faker.internet().emailAddress(),Keys.TAB,Keys.SPACE,Keys.TAB,faker.phoneNumber().cellPhone(),Keys.TAB
                    ,"20 Jul 1980",Keys.ENTER,Keys.TAB,faker.shakespeare().romeoAndJulietQuote(),Keys.TAB,Keys.SPACE);
            WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='uploadPicture']"));

          //  String anayol =System.getProperty("user.home")+"\\Desktop\\b10 all test cases, code.docx\"";
            String mainPath = System.getProperty("user.home");
            String commonPath = "\\Desktop\\logo.jpeg";
            String filePath = mainPath + commonPath;
            dosyaSec.sendKeys(filePath);
            WebElement adress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
            adress.sendKeys(faker.address().fullAddress(),Keys.TAB,"NCR");
            Thread.sleep(2000);



















        }
}
