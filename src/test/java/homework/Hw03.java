package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class Hw03 extends TestBase {
    @Test
    public void test01() {
        //Bir Class olusturalim KeyboardActions2
        //https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ARROW_DOWN).perform();
        //video’yu gorecek kadar asagi inin
        //videoyu izlemek icin Play tusuna basin
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        //video’yu gorecek kadar asagi inin
        //videoyu izlemek icin Play tusuna basin
        //videoyu calistirdiginizi test edin
        waitFor(4);
        WebElement pauseButton = driver.findElement(By.xpath("//button[@title='Pause (k)']"));
        Assert.assertTrue(pauseButton.isEnabled());






    }
}
