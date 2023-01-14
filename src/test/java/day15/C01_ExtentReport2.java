package day15;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utlilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C01_ExtentReport2  {
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @BeforeClass
    public static void extentReportsSetUp()  {
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

    }

    @Test
    public void extentReportsTest() {
     extentTest.pass("PASS");
        extentTest.info("Bilgilendirme notu");
        extentTest.fail("FAILED");
        extentTest.warning("UYARI MESAJI VEREBLIRIZ");
        extentTest.skip("ATLAMA MESAJI");
        extentTest.fatal("SISTEM COKUS HATASI");



    }
    @AfterClass
    public static void extentReportsTearDown(){
        extentReports.flush();
    }



}
