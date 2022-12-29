package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

public class C03_DismissAlert extends TestBase {
    @Test
    public void dismissAlertTest() throws InterruptedException {
     //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının “You clicked: Cancel” oldugunu test edin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();//Cancel secenegine tıklıyoruz
        String actuelResult = driver.findElement(By.id("result")).getText();
        String expectedResult ="You clicked: Cancel";
        Assert.assertEquals(expectedResult,actuelResult);
    }
}
