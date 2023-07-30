package day01_15_JavaInstruction.day02_data_türleri_variable.day03_coding;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çember yarıçapını girin");

        double yaricap = scanner.nextDouble();
        System.out.println("Çemberin çevresi : " + 2 * 3.14*yaricap);

        System.out.println("Dairenin alani : " + yaricap*3.14*yaricap);
    }
}
