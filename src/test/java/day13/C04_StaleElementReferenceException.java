package day13;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class C04_StaleElementReferenceException extends TestBase {
    //stale = bayat, kullanılmaz
      /*
    StateElementReferenceException
    StateElementReferenceException = eski kullanılamaz durumda olan, kullanıma artık elverişli olmayan durumlarda alınan hatadır.
    Sayfayı yenilediğimizde,
    sayfada ileri geri gittiğimizde meydana gelen exception'dır.

        Çözüm
    Elemanı tekrar bulmak.

 */

    @Test
    public void staleElementReferenceExceptionTest01() {


        driver.get("https://www.techproeducation.com");
     // LMS LOGIN linkine tikla ve o sayfanin URL inin lms icerdigini test et
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(3);
        lmsLoginLink.click();//LMS e git
        Assert.assertTrue(driver.getCurrentUrl().contains("lms"));//URl in lms kelimesini icerdigini test et
        waitFor(3);
     // Tekrar ana sayfaya gel ve LMS LOGIN sayfasina tekrar
        driver.navigate().back();//tekrar ana sayfaya gittik
        waitFor(3);
        lmsLoginLink.click();//LMS e git

    }

    @Test
    public void staleElementReferenceExceptionTest02() {

        driver.get("https://www.techproeducation.com");
        waitFor(5);
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS LOGIN"));
        waitFor(5);
        driver.navigate().refresh();
         waitFor(5);
        // SAYFA YENILENMEDEN ONCE BULDUGUM ELEMENTI, SAYFA YENILENDIKDEN SONRA KULLANMAK ISTEDIM
         lmsLoginLink.click();// org.openqa.selenium.StaleElementReferenceException
        // COZUM ESKI(SLATE ELEMENT) ELEMENTI TEKRAR LOCATE ET
        // driver.findElement(By.linkText("LMS LOGIN")).click();








    }
}
