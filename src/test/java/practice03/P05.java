package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class P05 extends TestBase {

    @Test
    public void test01() {
        // https://the-internet.herokuapp.com/iframe adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        // An iFrame conteining... başlığının altındaki Text Box’a “Techproeducation” yazin.
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Techproeducation");
        // TextBox’in altinda bulunan “Elemental Selenium” linkinin gorunur oldugunu test edin
        driver.switchTo().defaultContent();
        WebElement link = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(link.isDisplayed());
        // Elemental Selenium linkine tıklayın
        link.click();
        // Açılan sayfada sayfa başlığını yazdırınız
       List<String> windowHandles = new ArrayList<>( driver.getWindowHandles());
       driver.switchTo().window(windowHandles.get(1));
        System.out.println(driver.getTitle());
        // Elemental Selenium başlığı altındaki "Source Labs" linkinin gorunur olduğunu test edin
        WebElement sourceLabLink =driver.findElement(By.xpath("//*[text()='Sauce Labs']"));
        Assert.assertTrue(sourceLabLink.isDisplayed());
        // Source labs linkine tıklayın
        sourceLabLink.click();
        // Açılan sayfada sayfa başlığını yazdırınız
        List<String> windowHandles02 = new ArrayList<>(driver.getWindowHandles());
       driver.switchTo().window(windowHandles02.get(2));
        System.out.println("SourceLap Sayfa Başligi ="+driver.getTitle());

        // ilk sekmeye geri dönelim ve url'ini yazdıralım
        driver.switchTo().window(windowHandles02.get(0));
        System.out.println(driver.getCurrentUrl());
        // ilk sekmeyi kapatalım
        driver.close();

    }
}
