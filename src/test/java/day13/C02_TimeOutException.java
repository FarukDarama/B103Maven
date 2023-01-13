package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utlilities.TestBase;

import java.time.Duration;

public class C02_TimeOutException extends TestBase {
    @Test
    public void timeOutExceptionTest() {
        driver.get("https://www.techproeducation.com");
        //Explit waitler icin olusturdugumuz methodlardan birini kullannalım


       // waitForVisibility(driver.findElement(By.xpath("//input[@type='searchh']")),15).sendKeys("QA", Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yanlıs id")));





    }
}
