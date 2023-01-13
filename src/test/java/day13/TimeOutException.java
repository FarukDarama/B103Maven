package day13;

import utlilities.TestBase;

public class TimeOutException extends TestBase {
   //TimeOutException explicit wait kullanıldığı zaman ve element bulunamadığında alınan bir hatadır.
    //Şimdiye kadar karşılaşmamızın nedeni sadece implicit wait kullanmış olmamızdır.
    //Explicit wait ve yanlış locatar kullandığımız zaman TimeOutException alırız.
    //Explicit wait var, doğru locatar kullandık ama süre yeterli olmadığı durumlarda TimeOutException alırız.
    //Explicit wait var, doğru locatar kullandık, süre yeterli ama iframe var TimeOutException alırız.

    //Çözüm
    //Süreyi artırabiliriz.
    //Farkli explicit wait yöntemleri kullanırız. Örn: VisibilityOfElementLocated çözmedi yerine presenceOfElementLocator kullanılabilir.
    //Ya da javascript executor da ki waitleri sayfa geçişlerini beklemek için kullanabiliriz.
    //Locatorı kontrol ederiz.
    //Frameworkümde hazır reusable methodlar var. Bu durumda TimeOutException aldığımda o methodlar yardımıyla problemi çözebiliriz.


}
