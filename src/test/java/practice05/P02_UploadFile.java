package practice05;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

public class P02_UploadFile extends TestBase {

    @Test
    public void uploadTest() throws InterruptedException {
        //https://demo.guru99.com/test/upload/ adresine gidiniz
        driver.get("https://demo.guru99.com/test/upload/");
        //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
     //   driver.findElement(By.xpath("//*[text()='Tümünü Kabul Et']")).click();
        WebElement ifrane = driver.findElement(By.xpath("//*[@id='gdpr-consent-notice']"));
        driver.switchTo().frame(ifrane);
        driver.findElement(By.xpath("//*[text()='Tümünü Kabul Et']")).click();
        driver.switchTo().defaultContent();

       // String farkliYol = System.getProperty("user.home");
        String dosyaYolu01 = "\"C:\\Users\\Dell\\Desktop\\b10 all test cases, code.docx\"";//sifte basık saga tıklayoınca cıkan dosya yolu
        WebElement dosyaSec = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        dosyaSec.sendKeys(dosyaYolu01);
        // I accept terms of service bölümünü tikleyin
        // Submit File buttonuna basınız
        WebElement checkBox =  driver.findElement(By.xpath("//*[@id='terms']"));
        checkBox.click();
        checkBox.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        // "1 file has been successfully uploaded" görünür olduğunu test edin
        Thread.sleep(2000);
        assert driver.findElement(By.xpath("//*[@id='res']")).isDisplayed();





    }
}
