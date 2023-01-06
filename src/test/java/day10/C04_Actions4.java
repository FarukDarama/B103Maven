package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utlilities.TestBase;

public class C04_Actions4 extends TestBase {
    @Test
    public void dragAndDropTest() { // SURUKLEMEK EN FAZLA ICIN KULLANILAN METHOD BUDUR !!!!

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
          //kaynak ve hedef elementleri iframenin içinde
        driver.switchTo().frame(0);
        //And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement hedef = driver.findElement(By.id("droppable"));
        Actions actions =new Actions(driver);
        actions.dragAndDrop(kaynak,hedef).perform();
    }

    @Test
    public void clickAndHoldTest() {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");
        //kaynak ve hedef elementleri iframenin içinde
        driver.switchTo().frame(0);
        //And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement hedef = driver.findElement(By.id("droppable"));
        //dragAndDrop surukleme işlemi gercekleştiri
        Actions actions =new Actions(driver);
        actions.
                clickAndHold(kaynak).//kaynagı tut
                moveToElement(hedef).//hedefe koy
                release().//tuttugun kaynagı bırak
                build().//onceki methodların ilişkisini kur/güçlendir.KULLANILMASI TERCİH EDİLİR.
                perform();//işlemi gerceklestir

    }

    @Test
    public void moveByOffSetTest() {

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.xpath("//*[@id='draggable']"));
        Actions actions =new Actions(driver);
        actions.
                clickAndHold(kaynak).
                moveByOffset(340,25).
                build().
                perform();

    }
}
