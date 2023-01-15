package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C01_ExcellRead {

    //JAVA dosyasına saga tıkla ve resources adında bi klasor olustur
    //Excel dosyasını bu klasore at
    //Resources dosyası excell word text gibi data dosyalarının oldugu klasor olacaktır






    @Test
    public void readExcellTest() throws Exception {
     //workbook > sheet(sayfa) > row(satır) > cell(veri hucresi)
      String path = "./src/test/java/Resources/Capitals.xlsx";
        //        String path =".\\src\\test\\java\\resources\\Capitals.xlsx";//WINDOWS

        FileInputStream fileInputStream = new FileInputStream(path);
        //        EXCEL DOSYASINI AC /WORKBOOK AC
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //        SAYFAYI AC / Sheet1
        //  Sheet sheet1 = workbook.getSheetAt(0);
       Sheet sheet2 = workbook.getSheet("Sheet1"); // sayfa ismi ile gitmek istersek

        //        ILK SATIRA GIT / Row
        Row row1 = sheet2.getRow(0); //ilk satıra Git

        //        INK SATIRDAKI ILK VERIYI AL
        Cell cell1 = row1.getCell(0);//İlk hucredeki datayı aldık

        //        O VERIYI YAZDIR
        System.out.println(cell1);

        //1.satir 2. sutun
        Cell cell12 = sheet2.getRow(0).getCell(1);
        System.out.println(cell12);
         //3.satır 1. sutun yazdır ve o verinin France oldugunu test et.NOTE: Stringe cevirerek assertion yapılabilir.
        String cell31 =  sheet2.getRow(2).getCell(0).toString();
        System.out.println(cell31);
        Assert.assertEquals("France",cell31);

        //Exceldeki toplam kullanılan  satır sayısını bul
        int toplamSatir = sheet2.getLastRowNum()+1;//son satır numarası.ındex 0 dan basladıgı ıcın +1 diyoruz
        System.out.println(toplamSatir);
        //Kullanılan toplam satır sayisi(bos satır varsa onları saymaz)
        int kullanilanToplamSatirSayisi = sheet2.getPhysicalNumberOfRows();//1 den baslıyor saymaya
        System.out.println(kullanilanToplamSatirSayisi);

        //Country , Capitals key ve valueleri map e alıp print et

        //{{USA,D.C},{FRANCE,PARIS}}
           //Variable olusturalim.Bu variable country,capital verilerini tutacak
        Map<String ,String> ulkeBaskentleri = new HashMap<>();
        sheet2.getRow(0).getCell(0);
        for (int satirSayisi = 1; satirSayisi < kullanilanToplamSatirSayisi; satirSayisi++) {

            String country = sheet2.getRow(satirSayisi).getCell(0).toString();
            String capitals = sheet2.getRow(satirSayisi).getCell(1).toString();

            ulkeBaskentleri.put(country, capitals);

        }

        System.out.println(ulkeBaskentleri);

    }


}
