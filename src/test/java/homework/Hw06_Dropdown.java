package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import utlilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Hw06_Dropdown extends TestBase {
    @Test
    public void test01() {
        //Test01 :  1- amazon gidin
        driver.get("https://amazon.com");
        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        options.stream().forEach(t-> System.out.println(t.getText()));
        System.out.println(options.size());

        //dropdown menude 40 eleman olduğunu doğrulayın
        Assert.assertNotEquals(40, options.size());
    }

    @Test
    public void test02() {
        //Test02
        driver.get("https://amazon.com");
        //dropdown menuden elektronik bölümü seçi
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        waitFor(1);
        Select select = new Select(dropdown);
        select.selectByValue("search-alias=electronics-intl-ship");
        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //sonuc sayisi bildiren yazinin iphone icerdigini test edin
        String[] sonucYazisi =  driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText().split(" ");
       // List<String> list = new ArrayList<>(Arrays.asList(sonucYazisi));
        Assert.assertEquals("\"iphone\"", sonucYazisi[6]);
        //ikinci ürüne relative locater kullanarak tıklayin
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]"));
        WebElement secondProductByRelativeLocate = driver.findElement(with(By.tagName("div")).toRightOf(firstProduct));
        secondProductByRelativeLocate.click();
        //ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
        String title = driver.getTitle();
        System.out.println(title);
        String fiyat = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getText();//?
        System.out.println(fiyat);//fiyatı yazdıramadım


    }

    @Test
    public void test03() {

        //yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);//yeni pencere olustrur 2. Oraya geçiş yapar
        driver.get("https://www.amazon.com");
        //dropdown’dan bebek bölümüne secin
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(dropdown);
        select.selectByValue("Baby");

        //bebek puset aratıp bulundan sonuç sayısını yazdırın
        //sonuç yazsının puset içerdiğini test edin
        //5-üçüncü ürüne relative locater kullanarak tıklayin
        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin  Test 4
        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın





    }









}
