package day01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropDownMenu {
    // ...Exercise 1...
    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

    static WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test
    public void test01() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");
        // dropdown'dan "Books" secenegini secin
        // Dropdown 3 adimda handle edilir.
        // 1. Adim: Locate edilmeli.
        WebElement ddMenu = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        // 2. Adim: Select object'i olusturulmali.
        Select select = new Select(ddMenu);
        // 3. Adim: Option secilir.
        select.selectByValue("search-alias=stripbooks-intl-ship");
        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);
        // arama sonuclarinin Java icerdigini test edin
        String java = driver.findElement(By.xpath("//*[@class='sg-col-inner']")).getText();
        Assert.assertTrue(java.contains("Java"));

    }

    @After
    public void tearDown(){
        driver.close();
     }








}
