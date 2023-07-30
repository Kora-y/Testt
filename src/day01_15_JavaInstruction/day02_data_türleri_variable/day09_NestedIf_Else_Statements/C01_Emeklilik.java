package day01_15_JavaInstruction.day02_data_türleri_variable.day09_NestedIf_Else_Statements;

import java.util.Scanner;

public class C01_Emeklilik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyet gir");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yaş gir");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("gecersiz yas");
        } else if (yas < 60) {
            if (cinsiyet == 'K') {
                System.out.println("kdn şu kadar çalışmalı" + (60 - yas));
            } else if (cinsiyet == 'E') {
                System.out.println("erkek emekli olmak için" + (65 - yas));
            }
            //kimse emekli olamaz
        } else if (yas < 65) {
            if (cinsiyet == 'K') {
                System.out.println("kdn emekli olr");
            } else if (cinsiyet == 'E') {
                System.out.println("erk için " + (65 - yas));

            } else {
                System.out.println("cinsiyet hatalı");
            }
            //sadece kadınlar emekli olabilir
        } else {
            //herkes emekli olabilir
        }

    }
}
