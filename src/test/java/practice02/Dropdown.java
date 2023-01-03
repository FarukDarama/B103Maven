package practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utlilities.TestBase;

import java.util.List;

public class Dropdown extends TestBase {

    @Test
    public void dropdownTest() {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Dropdown menuden baby seçelim
        //Dropdown menuyu yazdıralım
       List<WebElement>  dropdown = driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
       dropdown.forEach(t-> System.out.println(t.getText()));
       // Select select = new Select(dropdown);
        //Dropdown menuden baby seçelim
        driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Baby", Keys.TAB,"Milk",Keys.ENTER);
        //arama bölumunden milk aratalım
    }
}
