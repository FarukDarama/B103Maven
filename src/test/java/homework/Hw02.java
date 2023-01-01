package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

import java.util.List;
import java.util.Set;

public class Hw02 extends TestBase {
    //2.Odev
    //https://testcenter.techproeducation.com/index.php?page=multiple-windows
    //Title in ‘Windows’ oldugunu test edin
    //Click here a tiklayin
    //Sonra açılan sayfadaki title in ‘New Window’ oldugunu dogrulayin


    @Test
    public void test01() {
    driver.get("https://testcenter.techproeducation.com/index.php?page=multiple-windows");
    String window1Handle = driver.getWindowHandle();
    String actuelTitle = driver.getTitle();
        Assert.assertEquals("Windows",actuelTitle);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
     Set<String> handleList = driver.getWindowHandles();
     for (String w:handleList){
         if (!w.equals(window1Handle)){
             driver.switchTo().window(w);
         }
     }

     String window2Handle = driver.getWindowHandle();
    String window2Title = driver.getTitle();
     Assert.assertEquals("New Window",window2Title);

    }


}
