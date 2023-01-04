package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utlilities.TestBase;

public class WindowHnadle extends TestBase {


    @Test
    public void test01() {

        //*Yeni bir class oluşturun: ındowHandle
        //*Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");
        //*Sayfa'nin window handle degerini String bir degiskene atayin
        String window1 = driver.getWindowHandle();
        //*Sayfa title'nin "Amazon" icerdigini test edin
        String actuelTitle1 = driver.getTitle();
        Assert.assertTrue(actuelTitle1.contains("Amazon"));
        //*Yeni bir tab oluşturup, acilan tab'da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);//Yeni bir sekme acmıs oldu biz actırıyoruz yani
        //*Sayfa title'nin 'TECHPROEDUCATION" icermedigini test edin
        driver.get("https://techproeducation");
        String actualTechProTitle =driver.getTitle();
        String istenenkelime ="TECHPROEDUCATION";
        Assert.assertFalse(actualTechProTitle.contains(istenenkelime));
        //*Yeni bir window oluşturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni bir window acmıs olduk
        driver.get("https://walmart.com");
        //*Sayfa title'nin "Walmart" icerdigini test edin
        String actualWollmartTitle = driver.getTitle();
        String beklenenKelime ="Walmart";
        Assert.assertTrue(actualWollmartTitle.contains(beklenenKelime));
        //*ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(window1);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
