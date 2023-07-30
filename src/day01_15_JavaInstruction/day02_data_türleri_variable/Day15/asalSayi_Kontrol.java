package day01_15_JavaInstruction.day02_data_türleri_variable.Day15;

import java.util.Scanner;

public class asalSayi_Kontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen asal sayı kontrolü için pozitif tam sayı giriniz");

        //int sayi1 = scanner.nextInt();

        /*for (int i = 2; i < sayi1-1; i++) {

            if (!(sayi1 % i == 0)) {
                System.out.println("Sayınız asal sayıdır.");
                break;
            } else { System.out.println("Sayınız normal sayıdır");}

        }*/
        asalSayi(7);
    }

    public static void asalSayi(int sayi) {
        boolean asal = true;
        int i = 2;
        while (i < sayi-1) {
            if (sayi % i == 0) {
                System.out.println("Asal Sayı DEGIL!");
                asal = false;
                break;
            }
            i++;
        }

        if (asal) {
            System.out.println("Asal SAYI");
        }
    }
}
