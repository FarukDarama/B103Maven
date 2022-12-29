package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

public class C02_AlertsAccept extends TestBase {
    @Test
    public void acceptAlertTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //   1. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        //   uyarıdaki OK butonuna tıklayın
        Thread.sleep(3000);
        driver.
                switchTo().//degiştir
                alert().//alerte degistir
                accept();//ok secenegine tıklanır
        Thread.sleep(3000);
        //   ve result mesajının
        //   “You successfully clicked an alert” oldugunu test edin.
        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "You successfully clicked an alert";
        Assert.assertEquals(expectedResult,actualResult);
    }
    /*
      Alertleri nasıl handel ederiz
      -Alertler javascript ile olusur inspect edilemez.Oncelikle alerte switch etmemiz gerekir.
     */
}
