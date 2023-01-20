package day15;

import day18.C02_Log4J;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utlilities.TestBase;

import java.util.List;

public class C02_WebTables extends TestBase {

    ////table[@id='table1']//tbody//tr[3]//td[2]
    //https://the-internet.herokuapp.com/tables


    //Task 2 : 3. Row’ datalarını print edin
    //Task 3 : Son row daki dataları print edin
    //Task 4 : 5. Column datalarini print edin
    //Task 5 : Iki parametreli bir Java metot oluşturalım: printData
    //Parameter 1 = row numarasi
    //Parameter 2 = column numarasi
    //printData(2,3);  => 2nd row, 3rd column daki datayı print etsin

    private static Logger logger = LogManager.getLogger(C02_WebTables.class.getName());
    @Test
    public void table1Print() {
        //Task 1 : Table1’i print edin
         driver.get("https://the-internet.herokuapp.com/tables");
        String table1 =  driver.findElement(By.xpath("//table[@id='table1']")).getText();
      //  System.out.println("Table 1 Verileri");
        logger.info("Table 1 Verileri");
        System.out.println("table1 = " + table1);
        //Liste atıp elemanları tek tek gormek icin
        List<WebElement> tumVeriler = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement w:tumVeriler){
            System.out.println(w.getText());
        }

    }

    @Test
    public void row3Print() {
        driver.get("https://the-internet.herokuapp.com/tables");
     List<WebElement> row3Elements = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
      row3Elements.forEach(t-> System.out.println(t.getText()));


    }

    @Test
    public void sonSatirVerileri() {
        driver.get("https://the-internet.herokuapp.com/tables");
      List<WebElement> sonSatir =   driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[last()]//td"));
       sonSatir.forEach(t-> System.out.println(t.getText()));


    }

    @Test
    public void sutun5Test() {
        driver.get("https://the-internet.herokuapp.com/tables");
    List<WebElement> sutun5 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
       sutun5.forEach(t-> System.out.println(t.getText()));



    }


    public void printData(int satir,int sutun) {
        //Task 5 : Iki parametreli bir Java metot oluşturalım: printData
        //Parameter 1 = row numarasi
        //Parameter 2 = column numarasi
        //printData(2,3);  => 2nd row, 3rd column daki datayı print etsin
        driver.get("https://the-internet.herokuapp.com/tables");
        String myXpath = "//table[@id='table1']//tbody//tr["+satir+"]//td["+sutun+"]";
        System.out.println(driver.findElement(By.xpath(myXpath)).getText());

    }

    @Test
    public void printDataTest() {
    printData(2,3);

    }



}
