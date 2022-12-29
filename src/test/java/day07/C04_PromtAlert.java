package day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

public class C04_PromtAlert extends TestBase {
    //    3. butona tıklayın,


    //    ve result mesajında isminizin görüntülendiğini doğrulayın.


    @Test
    public void sendKeysMethod() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        //    uyarıdaki metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("Faruk yapıyorsun bu sporu :)");
        //    OK butonuna tıklayın
        driver.switchTo().alert().accept();
        //    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String actuelResult = driver.findElement(By.xpath("//*[text()='You entered: Faruk yapıyorsun bu sporu :)']")).getText();
        String exceptedResult = "Faruk yapıyorsun bu sporu :)";
        Assert.assertTrue(actuelResult.contains(exceptedResult));

    }
}
