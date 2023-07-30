package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Adınızı giriniz : ");
        char isim = scanner.next().charAt(0);

        System.out.println("Soy adınızı giriniz : ");

        String soyisim = scanner1.nextLine();

        System.out.println("Yasinizi giriniz ");

        int yas = scanner1.nextInt();


        System.out.println(isim + " " + soyisim + " " + yas );
    }
}
