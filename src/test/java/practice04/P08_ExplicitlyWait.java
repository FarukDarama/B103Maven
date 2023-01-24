package practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utlilities.TestBase;

import java.time.Duration;

public class P08_ExplicitlyWait extends TestBase {
  /*
                                    - Explicit Wait -
        Selenium’da Explicit Wait, Web Sürücüsüne belirli koşulları (Expected Condition) veya
    “ElementNotVisibleException” exception’ı atmadan önce aşılan maksimum süreyi beklemesini söylemek için kullanılır.
    Akıllı bir bekleme türüdür ancak yalnızca belirli öğeler(elementler) için uygulanabilir.
    Dinamik olarak yüklenen web elementleri beklerken implicit wait’ten daha iyi seçenekler sunar.
        Explicit Wait kullandığımızda, “ExpectedConditions” tanımlamalıyız veya Fluent Wait kullanarak durumu ne
    sıklıkla kontrol etmek istediğimizi yapılandırmalıyız.
     Syntax:
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(element locator));
     */

    @Test
    public void explicitlyWaitTest() {

        //https://automationfc.github.io/dynamic-loading/ sayfasına gidelim
        driver.get("https://automationfc.github.io/dynamic-loading/");
        WebElement startButton = driver.findElement(By.xpath("//*[text()='Start']"));
        //Start button'nuna basalım
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));
        //Hello World! yazısının çıktığını doğrulayalım
        assert driver.findElement(By.xpath("//*[text()='Hello World!']")).isDisplayed();

    }


    @Test
    public void invisibiltyTest() {

        //https://automationfc.github.io/dynamic-loading/ sayfasına gidelim
        driver.get("https://automationfc.github.io/dynamic-loading/");
        extentTest.info("Url ye gidildi");
        WebElement startButton = driver.findElement(By.xpath("//*[text()='Start']"));
        //Start button'nuna basalım
        startButton.click();
        extentTest.info("Start Butonuna basıldı");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Loading... ']")));
        //Hello World! yazısının çıktığını doğrulayalım
        assert driver.findElement(By.xpath("//*[text()='Hello World!']")).isDisplayed();
        extentTest.info("Hello World yazısı dogrulandı");




    }
}
