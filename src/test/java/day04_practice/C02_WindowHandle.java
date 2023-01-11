package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utlilities.TestBase;

public class C02_WindowHandle extends TestBase {
    @Test
    public void test01() {
        // 1- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        String window1 =driver.getWindowHandle();
        // 2- url'in 'amazon' icerdigini test edelim
        String url =  driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));
        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
       String window2 = driver.getWindowHandle();
        // 4- title'in 'Best Buy' icerdigini test edelim
        String title =  driver.getTitle();
        Assert.assertTrue(title.contains("Best Buy"));
        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        driver.switchTo().window(window1);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("java", Keys.ENTER);
        // 6- arama sonuclarının 'Java' icerdigini test edelim
        WebElement sonuc = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String sonucYazi = sonuc.getText();
        Assert.assertTrue(sonucYazi.contains("java"));
        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(window2);
        // 8- logonun gorundugunu test edelim
        WebElement logo = driver.findElement(By.xpath("//*[@alt='Best Buy Logo']"));
        Assert.assertTrue(logo.isDisplayed());



    }
}
