package day03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class P03_Actions extends TestBase {
    @Test
    public void test01() {

        //    http://uitestpractice.com/Students/Actions adresine gidelim
        driver.get("http://uitestpractice.com/Students/Actions");
        //    Mavi kutu uzerinde 3 saniye bekleyelim ve rengin degistigini gorelim
         WebElement maviKutu = driver.findElement(By.xpath("//*[@class='col col-md-4 col-offset-8']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(maviKutu).perform();
        waitFor(2);

        //    Double Click Me! butonuna tiklayalim ve cikan mesajin "Double Clicked !!" oldugunu dogrulayalim
        WebElement doubleClicked = driver.findElement(By.xpath("//*[@name='dblClick']"));
        actions.doubleClick(doubleClicked).perform();
        Assert.assertEquals("Double Clicked !!",driver.switchTo().alert().getText());
        //Accept ile alert'ü kapatalım
        driver.switchTo().alert().accept();
        //    Drag and drop kutularini kullanin ve islemi yaptiktan sonra hedef  kutuda "Dropped!" yazildigini dogrulayin
        WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement drop =driver.findElement(By.xpath("//*[@id='droppable']"));
        actions.dragAndDrop(drag,drop).perform();
        Assert.assertEquals("Dropped!", drop.getText());




    }






}
