package practice05;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import utlilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P05_Screenshot extends TestBase {

    @Test
    public void secreenShotTest() throws IOException {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Tüm sayfanın resmini alalım
        //DateTimeFormatter gunTarih = DateTimeFormatter.ofPattern("MM/dd/yyyy");  BOYLEDE TARİH ALINABİLİR.
        String tarih = new SimpleDateFormat("hh_mm_ss_ddMMyyyy").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        FileUtils .copyFile(ts.getScreenshotAs(OutputType.FILE), new File("target/tumSayfaResimleri/tumSayfa"+tarih+".jpeg"));
        waitFor(3);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://techproeducation.com");
        tarih = new SimpleDateFormat("hh_mm_ss_ddMMyyyy").format(new Date());
        FileUtils .copyFile(ts.getScreenshotAs(OutputType.FILE), new File("target/tumSayfaResimleri/tumSayfa"+tarih+".jpeg"));
        /*
        File utiles class'i FİLE NESNELERİ İLE BİRLİKTE KULLANABİLECEGİMİZ METHODLAR İÇERİR.
        BU METHODLARI KULLANARAK DOSYALARDA OKUMA ,YAZMA VE KOPYALAMA İŞLEMLERİNİ COKK DAHA KOLAY
        YAPABİLİRİZ.
         */
       // takeScreenShotOfPage();
        //Yeni bir sekmede techproeducation sayfasına gidip sayfanın resmini alalım
        //Tekrar amazon sayfasına dönüp iphone aratalım
        //Arama sonucunun resmini alalım







    }
}
