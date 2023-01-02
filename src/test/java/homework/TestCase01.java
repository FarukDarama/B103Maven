package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

import java.util.List;

public class TestCase01 extends TestBase {



    @Test
    public void test01() {
        //https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");
        //Alerts, Frame & Windows Butonuna click yap
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[3]")).click();
        //(//*[@class='card mt-4 top-card'])[3]
        //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
       WebElement yazi = driver.findElement(By.xpath("//*[@id='Ad.Plus-728x90']"));
       Assert.assertTrue(yazi.isDisplayed());
        //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
        //New Tab butonunun görünür olduğunu doğrula
        //New Tab butonuna click yap
        //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
        //İlk Tab'a geri dön
        ////New Tab butonunun görünür olduğunu doğrulaı





    }
}
