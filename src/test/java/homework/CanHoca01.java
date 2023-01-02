package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

import java.util.List;

public class CanHoca01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //go to web site : https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        //maximize the web site
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        // ikinci emojiye tıklayın

        driver.switchTo().frame("emoojis");
        driver.findElement(By.xpath("(//img[@draggable='false'])[1]"));
        // ikinci emoji altındaki tüm öğelere tıklayın
         List<WebElement> emojies = driver.findElements(By.xpath("//*[@class='mdl-tabs__panel is-active']//img"));
         emojies.stream().skip(1).forEach(t-> t.click());
        // ana iframe'e geri dön
        driver.switchTo().parentFrame();
        //formu doldurun,(Formu istediğiniz metinlerle doldurun)
        // uygula butonuna tıklayın
        driver.findElement(By.xpath("//*[@id='text']")).sendKeys("aa", Keys.TAB,"bb",
                Keys.TAB,"cc",Keys.TAB,"dd",Keys.TAB,"ee",Keys.TAB,"ff",Keys.TAB,"gg",Keys.TAB,"hh",Keys.TAB,"ii",
                Keys.TAB,"jj",Keys.TAB,"kk",Keys.TAB,Keys.ENTER);
        Thread.sleep(3000);

    }


}
