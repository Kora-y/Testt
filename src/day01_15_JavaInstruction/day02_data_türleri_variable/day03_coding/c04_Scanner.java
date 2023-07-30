package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim = scanner.nextLine();

        System.out.println("Soy isim giriniz");

        String soyisim = scanner.nextLine();
        System.out.println("yaş giriniz");
        int yas = scanner.nextInt();

        System.out.println("Isım " + isim);
        System.out.println("Soy isim " + soyisim);
        System.out.println("Yaş " + yas);
    }
}
