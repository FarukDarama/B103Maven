package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class Hw05_Actions extends TestBase {
    @Test
    public void test01() {

        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin  2- Hover over Me First" kutusunun ustune gelin
        driver.get("http://webdriveruniversity.com/Actions");
        WebElement first = driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        Actions actions =new Actions(driver);
        actions.moveToElement(first).perform();
        //Link 1" e tiklayin
        waitFor(1);
        driver.findElement(By.xpath("(//*[text()='Link 1'])[1]")).click();
        //Popup mesajini yazdirin
        String alertMesaj =  driver.switchTo().alert().getText();
        System.out.println("AlertMesaj = " + alertMesaj);
        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //“Click and hold" kutusuna basili tutun
        WebElement clickAndHold =driver.findElement(By.id("click-box"));
        actions.clickAndHold(clickAndHold).perform();
        String yazi = clickAndHold.getText();
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println("Yazi = " + yazi);
        actions.keyUp(clickAndHold, Keys.UP);
        //8- “Double click me" butonunu cift tiklayin

        WebElement ciftTik =  driver.findElement(By.xpath("//h2"));
        actions.doubleClick(ciftTik);








    }
}
