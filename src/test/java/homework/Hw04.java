package homework;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utlilities.TestBase;

public class Hw04 extends TestBase {
    @Test
    public void test01() {
        //Faker Kutuphanesi HOMEWORK
        //Faker class’i testlerimizi yaparken ihtiyav duydugumuz isim, soyisim, adres vb bilgiler icin fake
        //degerler uretmemize imkan tanir.
        //Faker degerler uretmek icin Faker class’indan bir obje uretir ve var olan method’lari kullaniriz.
        Faker faker = new Faker();
        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//*[@title='Temel ve isteğe bağlı çerezlere izin ver']")).click();
        //“create new account”  butonuna basin
        driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
        //“firstName” giris kutusuna bir isim yazin
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(faker.name().firstName(), Keys.TAB,faker.name().lastName(),Keys.TAB,faker.internet().emailAddress(),
                Keys.TAB,faker.internet().password(),Keys.TAB,Keys.TAB);
        //“surname” giris kutusuna bir soyisim yazin
        //“email” giris kutusuna bir email yazin
        //“email” onay kutusuna emaili tekrar yazin
        //Bir sifre girin
        //Tarih icin gun secin
       WebElement gunDropdown = driver.findElement(By.xpath("//select[@id='day']"));
        Select dropdownGun = new Select(gunDropdown);
        dropdownGun.selectByVisibleText("13");
        //Tarih icin ay secin
        WebElement ayDropdown =  driver.findElement(By.xpath("//select[@id='month']"));
        Select dropdownAy = new Select(ayDropdown);
        dropdownAy.selectByValue("9");
        //Tarih icin yil secin
        WebElement yılDropdown = driver.findElement(By.xpath("//select[@id='year']"));
        Select dropdownYıl = new Select(yılDropdown);
        dropdownYıl.selectByVisibleText("1985");
        //Cinsiyeti secin
        WebElement cinsiyetRaidoButton = driver.findElement(By.xpath("//input[@value='2']"));
        cinsiyetRaidoButton.click();
        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        Assert.assertTrue(cinsiyetRaidoButton.isSelected());
        //Sayfayi kapatin
        waitFor(2);
        driver.close();











    }
}
