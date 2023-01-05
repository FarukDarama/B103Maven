package day09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utlilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {
    @Test
    public void handleCookiesTest() {
        //Class: Cookies
        //Method: handleCookies
        //Amazona git
        driver.get("https://www.amazon.com");
        //1.toplam cookie sayisini bul
        Set<Cookie> allCookies = driver.manage().getCookies();
        int cookieSayisi =allCookies.size();
        System.out.println(cookieSayisi);
        //3. Bir Cookie yi smiyle bul
        //tüm cerezleri yazdıralım
        for (Cookie eachCookie : allCookies){
            System.out.println("COOKIE : "+eachCookie);
            System.out.println("COOKIE ISIMLERI : " + eachCookie.getName());
        }
        System.out.println(driver.manage().getCookieNamed("i18n-prefs"));
        //4. Yeni bir cookie ekle
            //cookie olusturmlalıyız
        Cookie favoriCookiem = new Cookie("Cikolatam","antep-fistikli-cikolata");

        driver.manage().addCookie(favoriCookiem);
        System.out.println(driver.manage().getCookies().size());//yeni cookie sayisi arttı
        //5. Bir Cookie yi ismiyle sil
        driver.manage().deleteCookieNamed("session-token");
        //6. Tum cookie leri sil
        driver.manage().deleteAllCookies();




    }
}
