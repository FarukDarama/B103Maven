package day07;

import org.junit.Assert;
import org.junit.Test;
import utlilities.TestBase;

public class C01_TestBaseDemo extends TestBase {
    /*
    UTILITIES
    -Utilities tekrar tekrar kullanacagımız methodları veya classları koydugumuz paketin adıdır
       -TestBase
       -Driver-->Sonra
       -ExcellUtil-->Sonra
       -Configuration-->Sonra
     -Utilities paketinde Testcaseler yazılmaz
     -Sadece tekrar kulllanılabilecek destek sınıfları(support class) olusturulur.Bu support classlar testcaselerin
     yazılmasını hızlandırır.
     */
    @Test
    public void test1(){
        //techproeducation anasayfasına git ve titlenin Bootcamps kelimesini içerdiğini test edin
        driver.get("https://www.techproeducation.com");
        String pageTitle =driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));







    }
}
