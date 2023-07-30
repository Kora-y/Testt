package day01_15_JavaInstruction.day02_data_türleri_variable.Day14_For_Loops;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz : ");

        String sifre = scanner.nextLine();

        char ilkHarf = sifre.charAt(0);

        if (!((ilkHarf >= 'a') && (ilkHarf <= 'z'))) {

            System.out.println("İlk karakter küçük olmalı");

            flag = false;

        }

        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("Son karakter rakam olmalı");
            flag = false;
        }

        if ((sifre.contains(" "))) {
            System.out.println("Sifre boşluk içermemeli");

            flag = false;
        }


        if (!(sifre.length() >= 10)){
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalı");

            flag = false;
        }

        if (flag){
            System.out.println("Şifre başarılı");
        }

    }
}
