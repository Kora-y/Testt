package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class C7_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilkSayi = scanner.nextInt();

        System.out.println("İkinci sayi ");

        int ikinciSayi = scanner.nextInt();

            int temp = ilkSayi;
            ilkSayi = ikinciSayi;

            ikinciSayi = temp;

        System.out.println(temp + " " + ilkSayi + " " + ikinciSayi);

    }
}
