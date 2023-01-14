package day14;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import utlilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C03_ExtentReports extends TestBase {

    //  HATIRLAMAMIZ GEREKEN 3 CLASS

    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;


    @Test
    public void extentReportsTest01() {

        //      REPORT  PATH
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/reports/"+currentTime+"html_report.html";
        //        creating HTML report in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);
        //        creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();
        //******************RAPORU CUSTOMIZE EDEBİLİRİZ
            extentReports.setSystemInfo("Test Enviroment","Regression");
            extentReports.setSystemInfo("Application","TechPro Education");
            extentReports.setSystemInfo("Browser","Chrome");
            extentReports.setSystemInfo("Takim","Eagles");
            extentReports.setSystemInfo("Epic","    Odeme Sayfasi");
            extentReports.setSystemInfo("Sprint Numarasi","Sprint-145");
            extentReports.setSystemInfo("QA","FARUK");

        //*******************EXTRA RAPOR ISMI VE DOCUMAN ISMI EKLEYEBILIRIZ**************
            extentHtmlReporter.config().setDocumentTitle("TechproEd Extent Report");
            extentHtmlReporter.config().setReportName("Regresion Test Sonucu ");
        //******************* RAPOR AYARLARI BITTI **************

        //******Raporu projeye ekliyoruz**************
        extentReports.attachReporter(extentHtmlReporter);
        //Extent Test objesini olustur.
        extentTest= extentReports.createTest("Extent Report Login Test","Smoke Test Raporu");
        //TUM AYARLAR BITTI.EXTENT TEST OBJESİ İLE LOGLAMA (RAPORA YAZDIRMA) ISLEMİNİ YAPABİLİRİZ
        extentTest.pass("Kullanıcı Ana Sayfaya gider");
        driver.get("https://www.techproeducation.com");

        //LMS SAYFASINA GİDELİM
        extentTest.pass("Kullanıcı LMS sayfasına gider");
        driver.findElement(By.linkText("LMS LOGIN")).click();
        //TEST BİTTİ
        extentTest.pass("Test Basari ile Gerceklesti");



        //Raporu gostermek icin.Raporun olusması icin bu adım zorunludur
        extentReports.flush();




    }













    }





