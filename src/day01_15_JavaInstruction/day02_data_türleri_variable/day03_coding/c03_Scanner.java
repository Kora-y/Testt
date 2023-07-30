package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class c03_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir double gir");


        double girilenDouble = scanner.nextDouble();

        System.out.println("Lütfen bir tamsayi gir");

        int girilenInt = scanner.nextInt();

        System.out.println("Ikı sayinin toplamı " + (girilenInt + girilenDouble) );
        System.out.println("Ikı sayinin çarpımı " + girilenDouble*girilenInt);
    }


}
