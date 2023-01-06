package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class C02_Actions2 extends TestBase {
    /*
    Amazon home sayfasına git
    Account&List e uzerinde bekle
    Acılan pencerede Account linkine tıkla
    Acılan sayfanın title'inin Your Account oldugunu dogrula
     */

    @Test
    public void hoverOverTest() {
        driver.get("https://www.amazon.com/");
        //1. ACTIONS OBJESI
        Actions actions = new Actions(driver);
        //2. ELEMANI BUL
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);
        //2. UYGUN ACTIONS METHODUNU KULLAN. EN SONRA PERFORM KULLANAMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(3);

        //        Acilan pencerede Account linkine tikla
        driver.findElement(By.linkText("Account")).click();
 //       Acilan sayfanin title inin Your Account icerdigini dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));
    }
}
