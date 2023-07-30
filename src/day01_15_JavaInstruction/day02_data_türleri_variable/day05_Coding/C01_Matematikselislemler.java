package day01_15_JavaInstruction.day02_data_türleri_variable.day05_Coding;

import java.util.Scanner;

public class C01_Matematikselislemler {
    public static void main(String[] args) {


        // Kullanıcıdan 3 basamaklı bir sayı alıp
        //sayının rakamlarını toplayıp yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamaklı pztf sayi : ");
     int girilenSayi = scanner.nextInt();

     int birlerBasamagi = 0;
     int rakamlarToplami = 0;


     //ilk sayi için birler basamağını bulalım

        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;



        //birler basamağındaki sayiyi aldık,artık ondan kurtul

        girilenSayi = girilenSayi / 10 ; // yeni değer 12 olur

        //bu satıra geldiğimizde girilen sayıyı 2 basamaklı


        birlerBasamagi = girilenSayi % 10 ;





    }
}
