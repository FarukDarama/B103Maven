package day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

import java.util.Set;

public class C01_WindowHandle1 extends TestBase {
   //Tests package’inda yeni bir class olusturun: WindowHandle
    //https://the-internet.herokuapp.com/windows adresine gidin.
    //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //Click Here butonuna basın.
    //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    //Sayfadaki textin “New Window” olduğunu doğrulayın.
    //Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu  doğrulayın.


    @Test
    public void handleWindowTest() throws InterruptedException {

        //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //ILK SAYFANIN ID SİNİ ALALIM
            String window1Handle =driver.getWindowHandle();
        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String window1Text =driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",window1Text);

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String window1Title =driver.getTitle();
        Assert.assertEquals("The Internet",window1Title);

        //Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();
        //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        //Bu noktada 2 pencere acık ve ıkıcısıne gecis yapmak ıstıyoruz bunun için driver.getWindowsHandle() ile
        //tum pencerelerin ıd sini alalım
        Set<String> allWindowHandles = driver.getWindowHandles();//(window1 ve window2 nin handle'ı var)
        for (String w:allWindowHandles){
            if (!w.equals(window1Handle)){
                driver.switchTo().window(w);//Burdaki w bir sonraki yani window2 handle eşittir.
                break;
            }

        }

        //        BU NOKTADA DRIVER 2. PENCEREDE
        //    Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        Assert.assertEquals("New Window",driver.getTitle());
        //    Sayfadaki textin “New Window” olduğunu doğrulayın.
        Assert.assertEquals("New Window",driver.findElement(By.xpath("//h3")).getText());
        String window2Handle = driver.getWindowHandle();
        //    Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu  doğrulayın.
        Thread.sleep(3000);
        driver.switchTo().window(window1Handle);
        Assert.assertEquals("The Internet",driver.getTitle());
        //2.window a gecelim
        driver.switchTo().window(window2Handle);
        Thread.sleep(3000);
        driver.switchTo().window(window1Handle);
    }
}
