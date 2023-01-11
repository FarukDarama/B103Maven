package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class Hw07_Actions extends TestBase {

    @Test
    public void test01() {
        //http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");
        //    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        Actions actions = new Actions(driver);
        //    - Son olarak sayfayı temizleyiniz
        WebElement sayfa = driver.findElement(By.xpath("//*[@class='signature-pad']"));
        actions.clickAndHold(sayfa).moveToElement(sayfa,100,100).release(sayfa).perform();

        actions.clickAndHold(sayfa).moveToElement(sayfa,120,0).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,115,5).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,110,10).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,105,15).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,100,20).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,95,25).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,90,30).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,85,35).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,80,40).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,75,45).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,70,50).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,65,55).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,60,60).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,55,65).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,50,70).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,45,75).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,40,80).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,35,85).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,30,90).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,25,95).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,20,100).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,15,105).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,10,110).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,5,115).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,0,120).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,5,115).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,10,110).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,15,105).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,20,100).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,25,95).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,30,90).release(sayfa).perform();

        actions.clickAndHold(sayfa).moveToElement(sayfa,-120,0).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,0,-120).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,120,120).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,-120,-120).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,-120,120).release(sayfa).perform();
        actions.clickAndHold(sayfa).moveToElement(sayfa,120,-120).release(sayfa).perform();


    }

    @Test
    public void test02() {

        driver.get("http://szimek.github.io/signature_pad/");
        //    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        Actions actions = new Actions(driver);
        //    - Son olarak sayfayı temizleyiniz
        WebElement sayfa = driver.findElement(By.xpath("//*[@class='signature-pad--body']"));


    }



    }





