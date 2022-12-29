package grup_calismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class S01 {
        // https://the-internet.herokuapp.com/dropdown adresine gidin.
        // 1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın 4.Tüm dropdown değerleri(value) yazdırın
        // 5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse False yazdırın.
        static WebDriver driver;
        @Before
        public  void setup() throws Exception {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        }

    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement aa = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(aa);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());


        // 2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        // 3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        // 4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> option = select.getOptions();
        for (WebElement w: option){
            System.out.println(w.getText());
        }

        //5. Dropdown'un boyutunu bulun, Dropdown'da 4 öğe varsa konsolda True , degilse False yazdırın.
        int actual = option.size();
        Assert.assertFalse(actual>4);
        String sonuc = actual==4 ? "True" : "False";
        System.out.println("sonuc = " + sonuc);

    }
}
