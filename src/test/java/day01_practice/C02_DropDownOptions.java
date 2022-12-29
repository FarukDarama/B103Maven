package day01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_DropDownOptions {
    // ...Exercise 2...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Baby" secenegini secin
// sectiginiz option'i yazdirin
// dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
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
        driver.get("https://www.amazon.com/");







    }

    @After
    public void tearDown(){
        driver.close();
    }





}
