package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class C8_ScannerHW {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz ");

        int girilenSayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci bir sayi giriniz");

        int girilenSayi2 = scanner.nextInt();

        // değiştirme işlemi yapılacak
        //
        //
        //
        //

          girilenSayi1 = (girilenSayi1  +  girilenSayi2);
          girilenSayi2 = girilenSayi1 - girilenSayi2 ;
          girilenSayi1 = girilenSayi1 - girilenSayi2 ;

       System.out.println("İkinci girilen sayının değiştirilmiş hali : " + girilenSayi2 );
       System.out.println("Birinci girilen sayının değiştirilmiş hali : " + girilenSayi1);

    }
}
