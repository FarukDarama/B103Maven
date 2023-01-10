package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class P07_BuyuKucukHarf extends TestBase {
    @Test
    public void test() {
        //google sayfasuna gidelim
        driver.get("https://google.com");
        //buyuk kusuk harf olacak sekilde hallo yazdıralım
        WebElement searchBox =driver.findElement(By.xpath("//*[@class='gLFyf']"));
        searchBox.sendKeys(Keys.SHIFT,"h",Keys.SHIFT,"e",Keys.SHIFT,"l",Keys.SHIFT,"l",Keys.SHIFT,"o",Keys.SHIFT);//HeLlO


    }
}
