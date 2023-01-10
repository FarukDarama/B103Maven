package practice03;

import org.junit.Test;
import utlilities.TestBase;

public class P01_BasicAut extends TestBase {

    //http://httpbin.org/basic-auth/foo/bar adresine gidiniz
    //Username  : foo
    //password  : bar
    //Yukardaki verileri kullanarak güvenliği geçin
    @Test
    public void basic_auth() throws InterruptedException {
        //http://httpbin.org/basic-auth/foo/bar adresine gidiniz
        driver.get("http://httpbin.org/basic-auth/foo/bar");
        Thread.sleep(2000);
        //Username  : foo
        //password  : bar
        driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");
        //Yukardaki verileri kullanarak güvenliği geçin
    }

}
