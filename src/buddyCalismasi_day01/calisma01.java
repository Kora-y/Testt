package buddyCalismasi_day01;

import java.util.Scanner;

public class calisma01 {
    public static void main(String[] args) {
        /*
            Verilen iki sayının toplamını -sıfırdan büyük veya eşit olabilir- hesaplamak ve yazdırmak için bir program oluşturalım
            Eğer verilen tamsayıların veya toplamın 10'dan fazla basamağı varsa, "Fazla Yüklenme" yazdıralım
            Ipucu:  IF/Else kullanabilirsiniz.
            Örnek:
            İki tamsayı girin:
            25  veya  4567986321453
            46   veya 123456
            Konsolda Çıktı :

        Sayıların toplamı: 71  veya  Fazla Yüklenme

bir stringle bir de if/else ile
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int girilenSayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci bir tam sayi giriniz");

        int girilenSayi2 = scanner.nextInt();

        int toplam = girilenSayi2 + girilenSayi1;
        String yeniVariable1 = "" + toplam;
        if (yeniVariable1.length() >= 10) {
            System.out.println("Fazla Yüklenme");
        } else if (girilenSayi1 + girilenSayi2 < 0) {
            System.out.println("Geçersiz toplam,toplam sayı 0'dan küçük olamaz.");
        } else if (girilenSayi1 + girilenSayi2 == 0 ) {
            System.out.println("Geçersiz toplam,toplam sayı 0'a eşit olamaz.");
        }
        else {
            System.out.println(girilenSayi2 + girilenSayi1);
        }
    }
}
