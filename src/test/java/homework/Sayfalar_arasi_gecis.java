package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class Sayfalar_arasi_gecis extends TestBase {

    @Test
    public void name() {

        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);



       for (int i = 0; i < 5; i++) {
           WebElement nextButton = driver.findElement(By.xpath("//*[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']"));
          scrollIntoViewJS(nextButton);
          clickByJS(nextButton);
            waitFor(2);
       }









    }
}
