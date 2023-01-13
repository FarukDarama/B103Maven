package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

import javax.swing.*;

public class Hw08_Actions extends TestBase {

    @Test
    public void renkTest() {
        driver.get("https://jqueryui.com/slider/#colorpicker");
        Actions actions = new Actions(driver);
        WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(iframe);
        WebElement Tus2 = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        Tus2.click();
        for (int i=0 ; i<200 ;i++){
            actions.sendKeys(Keys.ARROW_LEFT).build().perform();
        }
        WebElement Tus3 = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
        Tus3.click();
        waitFor(2);
        for (int i=0;i<100;i++){
            actions.sendKeys(Keys.ARROW_LEFT).build().perform();
        }
        Tus2.click();
        for (int i =0;i<300;i++){
            actions.sendKeys(Keys.ARROW_RIGHT).build().perform();



    }
}


}

