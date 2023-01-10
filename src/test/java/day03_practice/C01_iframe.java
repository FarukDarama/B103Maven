package day03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class C01_iframe extends TestBase {

    @Test
    public void test01() {
        // https://html.com/tags/iframe sayfasına gidiniz
        driver.get("https://html.com/tags/iframe");
        // Videoyu görecek kadar asagiya ininiz
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        // Videoyu izlemek icin Play tusuna basiniz
        WebElement iframe = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
         driver.switchTo().frame(iframe);
        WebElement playTusu = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        playTusu.click();
        // Videoyu calistirdiginizi test ediniz
        WebElement youtubeYazisi =  driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
        Assert.assertTrue(youtubeYazisi.isDisplayed());
        // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
        driver.switchTo().defaultContent();
        WebElement yazi2 = driver.findElement(By.xpath("//*[@id='Powerful_but_easy_to_misuse']"));
       Assert.assertTrue(yazi2.isDisplayed());
      //      //*[@aria-label='Wiedergabe']     play tusu




    }
}
