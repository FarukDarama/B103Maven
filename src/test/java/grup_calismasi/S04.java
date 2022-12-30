package grup_calismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class S04 {

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
        // go to url :http://demo.automationtesting.in/Alerts.html
        driver.get("http://demo.automationtesting.in/Alerts.htm");
        //"Alert with OK" butonuna tıklayın ve "click the button to display an  alert box:" 'a tıklayın
        //Alert(I am an alert box!) konsolda yazdırın ve Alert'ü kabul edin.
        //"Alert with OK & Cancel" butonuna tıklayın ve"click the button to display a confirm box " butonuna tıklayın
        //Alert'ü kapatın
        //"Alert with Textbox" butonuna tıklayın ve "click the button to demonstrate the prompt box " butonuna tıklayın.
        //Açılan alert e 'TechProEducation' (Lütfen İsminizi girin).
        //Gönderdiğiniz metnin isminizi içerdiğini doğrulayın







    }
}
