package day16;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02_WriteExcell {

    @Test
    public void writeExcelTest() throws IOException {
    //WORKBOOK > SHEET > ROW > CELL > YAZ > KAYDET
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
        //Ilk satır 3. sutunu creat et
        Cell cell3 = row1.createCell(2);
        //O satıara nufus yazdır
        cell3.setCellValue("NUFUS");
        //2.satir 3. sutun a 45000 yazdırın
        sheet2.getRow(1).createCell(2).setCellValue("450000");
        sheet2.getRow(2).createCell(2).setCellValue("350000");
        //3.satir 3.sutun a 350000 yazdırın

        //YAZDIK AMA KAYDETMEDİK KAYDETMEK İCİN
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);




    }

}
