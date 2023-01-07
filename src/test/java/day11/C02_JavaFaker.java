package day11;

import com.github.javafaker.Faker;
import net.bytebuddy.description.type.TypeDescription;
import org.junit.Test;

public class C02_JavaFaker {



    @Test
    public void javaFakerTest() {
        Faker faker = new Faker();//faker object olustur
        String fName = faker.name().firstName();
        System.out.println("fName = " + fName);

        String lName = faker.name().lastName();
        System.out.println("lName = " + lName);
        System.out.println(faker.name().title());//meslek ismi yazdırmak için
        System.out.println(faker.address().city());//şehirler için
        System.out.println(faker.address().state());//eyalet
        System.out.println(faker.address().fullAddress());//tüm adres icin
        System.out.println(faker.phoneNumber().cellPhone());//telefon numarası icin
        System.out.println(faker.internet().emailAddress());//email adresi almak için
        System.out.println(faker.address().zipCode());//posta kodu almak icin
        System.out.println(faker.number().digits(10));//rastgele numara almak icin


    }
}
