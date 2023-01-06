package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class C01_Actions1 extends TestBase {
    @Test
    public void actionTest01() {
        //Class: Actions1
        //Method: rightClick
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
                    //1.Adım: Actions class’ta bir object oluşturulur.
                    //Actions actions= new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        //Kutuya sag tıklayın
        WebElement kutu = driver.findElement(By.id("hot-spot"));
        actions.contextClick(kutu).perform();
        //Alert’te cikan yazinin “You selected a context menu” oldugunu
        //test edin
        //Tamam diyerek alert’i kapatın
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();



    }

    //2. Adım: Üzerinde çalışmak istediğiniz WebElement
    //öğesini bulunur.
    //WebElement element = driver.findElement(locator);
    //3.Adim : perform() kullanarak bu webelement üzerinde action gerçekleştirilir.


}