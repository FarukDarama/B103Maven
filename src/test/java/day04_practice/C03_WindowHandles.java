package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

import java.util.Set;

public class C03_WindowHandles extends TestBase {

    @Test
    public void test01() {
        // 'https://www.n11.com' adresine gidin
        driver.get("https://www.n11.com");
        // arama motoruna 'oppo' yazıp aratın
        driver.findElement(By.xpath("//*[@id='searchData']")).sendKeys("oppo", Keys.ENTER);
        // ilk ürüne tıklayın

       driver.findElement(By.xpath("(//img[@class='lazy cardImage'])[1]")).click();

        switchToWindow2(1);

        // Basligin 'Oppo' icerdigini test edin.
       String baslik = driver.findElement(By.xpath("//*[@class='proName']")).getText();
        Assert.assertTrue(baslik.contains("Oppo"));

        // ilk sayfaya donun ve Title'ını yazdırın
        switchToWindow2(0);
       String title = driver.getTitle();
        System.out.println("title = " + title);






    }
}
