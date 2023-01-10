package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class P04_Actions extends TestBase {

    @Test
    public void tesst01() {
        // -http://spicejet.com/ sayfasına gidelim
        driver.get("http://spicejet.com/");
        // -Sayfanın altındaki about us bölümü altındaki fleet linkine tıklayalım
        WebElement aboutUs = driver.findElement(By.xpath("//*[text()='About Us']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUs).perform();
        // -Sayfa başlığının Fleet içerdiğini test edelim
        driver.findElement(By.xpath("//*[text()='Fleet']")).click();






    }
}
