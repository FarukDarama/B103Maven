package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class C01Actions5 extends TestBase {
    @Test
    public void keybordActionsTest() {
        //Create a class: Action5
        //Create a method keyboardActions
        //Google a gidin https://www.google.com
        driver.get("https://www.google.com");
        //‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
        //‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
        //Ve ENTER tusuna bas
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.
                keyDown(aramaKutusu, Keys.SHIFT).//arama kutusunuun ustunde shift tusuna bas
                sendKeys("IPHONE X FIYATLARI").//shiftr basılıiken yazı yaz
                keyUp(aramaKutusu,Keys.SHIFT).//shifte artık basma
                sendKeys("cok pahalı"+Keys.ENTER).//normal halde yaz ve enter tusuna bas
                build().//birden fazla actions methodu kullanıldıgında kullanılması tavsiye edilir.
                perform();



    }
}
