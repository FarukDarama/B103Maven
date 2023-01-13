package day14;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C02_ScreeShot2 extends TestBase {
    @Test
    public void screenshotOfSpecificElements() throws IOException {
        //Techpro education a git
        driver.get("https://www.techproeducation.com");
        //1.Ekran görüntüsünü çek
        WebElement sosyalMediaIconlari = driver.findElement(By.xpath("(//*[@class='elementor-widget-container'])[1]"));
        File image = sosyalMediaIconlari.getScreenshotAs(OutputType.FILE);
        // 2. goruntuyu kaydet
               String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // Path of screenshot save folder               folder / folder    /file name
               String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentTime+"image.png";
                FileUtils.copyFile(image,new File(path));

        //Sosyal medya elemanlarını goruntusun
        //LOGONUN EKRAN GORUNTUSU AL (parametre olarak webelement alıyor)
        takeScreenshotOfElement(driver.findElement(By.xpath("//div[@data-id='898ce2e']")));





    }
}
