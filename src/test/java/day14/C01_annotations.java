package day14;

import org.testng.annotations.Test;

public class C01_annotations {

    // harf ve isim sırasına göre calışır.
    // priority yazmazsak sıfır kabul eder

    @Test (priority=6)
    public  void ilkTest(){
        System.out.println("ilk test çalıştı");

        }
    @Test
    public void ikinciTest(){
        System.out.println("ikinci test çalıştı");
    }

    @Test(priority=-9)
    public void ucuncuTest(){
        System.out.println("üçüncü çalıştı");
    }
}
