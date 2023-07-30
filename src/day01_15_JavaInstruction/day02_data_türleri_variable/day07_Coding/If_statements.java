package day01_15_JavaInstruction.day02_data_türleri_variable.day07_Coding;

import java.util.Scanner;

public class If_statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pozitif tam sayı gir");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 5 == 0) {
            System.out.println("Sayi 5'in tam katı");
        }
    }
}
