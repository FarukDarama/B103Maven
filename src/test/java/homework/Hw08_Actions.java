package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

import javax.swing.*;

public class Hw08_Actions extends TestBase {

    @Test
    public void renkTest() {
        //  -https://jqueryui.com/slider/#colorpicker adrese gidiniz
        driver.get("https://jqueryui.com/slider/#colorpicker");
        Actions actions = new Actions(driver);
        WebElement tus2 = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));

        //     -Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız




    }
}
