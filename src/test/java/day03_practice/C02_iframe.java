package day03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class C02_iframe extends TestBase {

    @Test
    public void test01() {

        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
        WebElement yazi = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(yazi.isEnabled());
        System.out.println(yazi.getText());
        WebElement iframe = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
       WebElement textBox = driver.findElement(By.xpath("//*[@id='tinymce']"));
       textBox.clear();
        // TextBox'a 'Merhaba Dunya' yazin.
        textBox.sendKeys("Merhaba Dunya");
        driver.switchTo().parentFrame();
        // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin
        WebElement yazi2 = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(yazi2.isDisplayed());


    }
}
