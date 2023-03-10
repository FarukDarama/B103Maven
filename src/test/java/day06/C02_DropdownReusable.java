package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_DropdownReusable {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    //REUSABLE METHODLAR():Dropdown icin tekrar tekrar kullanabilecgimiz bir method olusturalım
    public void selectFromDropdown(WebElement dropdown,String text){

      //Gonderilen dropdown elementinin tup optionlarını alırız
      List<WebElement> options = dropdown.findElements(By.tagName("option"));//tum option tagli elementleri alıyorum
      for (WebElement w: options){
          if(w.getText().equals(text)){
              w.click();
              break;
          }
      }



    }
    @Test
    public void selectFromDropdown(){
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")), "2005");//2005 i secti
        selectFromDropdown(driver.findElement(By.id("month")),"November");
        selectFromDropdown(driver.findElement(By.id("day")),"10");
        selectFromDropdown(driver.findElement(By.id("state")),"Texsas");
    }

}
