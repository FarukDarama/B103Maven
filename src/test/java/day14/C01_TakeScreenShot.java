package day14;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utlilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01_TakeScreenShot extends TestBase {

    @Test
    public void takeScreenShotTest01() throws IOException {
        //--------Interview------------------
       /*
         Selenium tum ekran goruntusu nasil alinir?
         -tum ekran goruntusu selenium'dan gelen getScreenshotAs method'u ile alinir
         -getScreenshotAs method'u Selenium'daki TakeScreenshot API' indan gelir.
        */




        //Techpro education a git ve Sayfanin goruntusunu al
        driver.get("https://www.techproeducation.com");
        //1.Ekran goruntusunu getScreenShotAs () metodu ile alıp file olarak olusturalım
        File goruntu = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Almıs oldugum ekran goruntusunu belirledigim bir PATH'e kaydet
        String currentDate = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
        //---------NOTE:Kayıt ismini dinamik yapmak için date objesi kullandık----------------
        String path = System.getProperty("user.dir")+"/test-output/EkranGoruntuleri/"+currentDate+"image.png";
        File hedef = new File(path);
        //Goruntum ile dosyamı birleştirip kaydet
        FileUtils.copyFile(goruntu,hedef);

        //  ALTERNATIF OLARAK TUM BU ADIMLARI TEK SEFERDE DEGISKEN KULLANMADAN YAPABILIRIM
        //  FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),//goruntu
        //  new File(System.getProperty("user.dir")+"/test-output/EkranGoruntuleri/image.png"));//path

        //-“QA” aramasi yap
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("QA", Keys.ENTER);
        waitFor(3);
        //Acilen sayfanin metnini test et ve ekran goruntusu al: “Search Results for: qa”
        String expected ="Search Results for: QA";
         String metin  = driver.findElement(By.xpath("//*[contains(text(),'Search Results for')]")).getText();
        Assert.assertTrue(expected.contains(metin));
        //Reusable method yuardımı ile ekran goruntusu alalım
        takeScreenShotOfPage();

    }
}
