package practice04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class P05_Actions extends TestBase {

    @Test
    public void name() throws InterruptedException {

        //    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");
        WebElement yaziTahtasi = driver.findElement(By.xpath("//canvas"));
        Actions actions = new Actions(driver);
         actions.moveToElement(yaziTahtasi).clickAndHold();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,5);

        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,0);


        }
        actions.release().build().perform();
        //    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        //    - Çizimden sonra clear butonuna basalım
        Thread.sleep(5);
        driver.findElement(By.xpath("/*[text()='Clear']")).click();
        //    - Son olarak sayfayı temizleyiniz

    }
}
