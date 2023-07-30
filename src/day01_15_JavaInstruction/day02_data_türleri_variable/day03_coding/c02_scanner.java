package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class c02_scanner {
    public static void main(String[] args) {



           //Kullanıcıdan bir tam sayı alıp
           // karesini yazdırın

        System.out.println("Lütfen bir Tam sayi gir.");
        //scanner ile kullanıcıdan bir bilgi almak

        // istersek,bilgiyi 3 adımda alabiliriz
        // 1. adım : scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        //2. adım : Kullanıcıya ne istediğinizi
        // söyleyin.


        //3.adım istediğiniz datanın türüne uygun
        //bir variable oluşturun.
        // scanner objesini kullanarak uygun methodla
        //kullanıcının girdiği değeri alın

        int kullaniciGirdi1 = scanner.nextInt();

        //artık kullanıcının girdiği sayı burada
        //bu girilen sayıyı istediğimiz gibi
        //kullanabiliriz

        System.out.println("SAYININ KARESİ " + kullaniciGirdi1*kullaniciGirdi1);
    }
}
