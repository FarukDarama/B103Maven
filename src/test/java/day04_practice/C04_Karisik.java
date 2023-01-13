package day04_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utlilities.TestBase;

public class C04_Karisik extends TestBase {
    @Test
    public void test01() {
        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        WebElement dil = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dil).perform();
        // Change country/region butonuna basiniz
        driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();
        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        WebElement dropdown =  driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Turkey (Türkiye)");
        driver.findElement(By.xpath("(//span[@class='a-text-bold'])[1]")).click();
        // Go to website butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@id='icp-save-button']")).click();
        switchToWindow2(1);
        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
        String title =  driver.getTitle();
        Assert.assertTrue(title.contains("Elektronik"));
    }
}
