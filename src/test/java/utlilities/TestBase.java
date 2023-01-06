package utlilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class TestBase {
    //driver objesini olustur.Driver ya public yada protected olmali.sebebi child classlardan kullanılsın
    //    TestBase i abstract yapmamizin sebebi bu sinifin objesini olusturmak istemiyorum
    //    TestBase testBase = new TestBase(); -> YAPILAMAZ
    //    Amacim bu sinifi extend etmek ve icindeki hazir metodlari kullanmak
    //    driver objesini olustur. Driver ya public yada protected olmali.
    //    Sebepi child classlarda gorulebilir olmasi
    protected static WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown() {
        waitFor(5);
        driver.quit();
    }


    //    MULTIPLE WINDOW
    //1 parametre alır :gecis yapmak ıstedigim  safanın title'i
    public static void switchToWindow(String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)) {
                return;//cık.break;
            }
        }
        driver.switchTo().window(origin);
    }

    //windowNumber sıfır (0)'dan başlıyor.
    //index numarasını parametre olarak alır ve o indexli pencereye geçiş yapar.
    public static void switchToWindow2(int windowNumber) {
        List<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(windowNumber));
    }

    public void threadSleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    /*   HARD WAIT:
 @param : second
*/
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}//class parantezi


