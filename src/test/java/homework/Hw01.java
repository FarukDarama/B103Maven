package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class Hw01 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/iframe  sitesine gidiniz
          driver.get("https://the-internet.herokuapp.com/iframe");
        //sayfadaki toplam iframe sayısını bulunuz.
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        //Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
        String actuelText = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        Assert.assertTrue(actuelText.contains("Editor"));
        //Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[.='Your content goes here.']")).clear();//yazı silindikten sonra xpath degişiyor.

        //Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("iframein icindeyim");

        //Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
        driver.switchTo().parentFrame();
        String actuelText2 = driver.findElement(By.xpath("//a[.='Elemental Selenium']")).getText();
        Assert.assertTrue(actuelText2.contains("Elemental Selenium"));
        // element.clear(); kullan
    }
}
