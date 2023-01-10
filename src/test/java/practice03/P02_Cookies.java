package practice03;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utlilities.TestBase;

import java.util.Set;

public class P02_Cookies extends TestBase {
    @Test
    public void test01() {

        //Techproeducation adresine gidiniz
         driver.get("https://techproeducation.com");
        //Sayfadaki cookie lerin sayısını yazdırınız
         Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("cookies sayisi: "+cookies.size());
        //Sayfadaki cookie lerin isim ve değerlerini yazdırınız
        cookies.stream().forEach(t-> System.out.println("cookie name und value : "+t.getName()+" : "+t.getValue()));
        //Yeni bir cookie ekleyiniz
        Cookie mycookie = new Cookie("myCookie","28");
        driver.manage().addCookie(mycookie);
        //Yeni cookie eklendikten sonra cookie sayısını ve isimlerini yazdırınız

        Set<Cookie> cookies2 = driver.manage().getCookies();
        System.out.println("cookies sayisi: "+cookies2.size());
        cookies2.stream().forEach(t-> System.out.println(t.getName()+" "+ t.getValue()));
        //Oluşturduğumuz cookie'i silelim
        driver.manage().deleteCookie(mycookie);
        //Tüm cookieleri silelim
         driver.manage().deleteAllCookies();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        System.out.println("cookies sayisi: "+cookies3.size());







    }
}
