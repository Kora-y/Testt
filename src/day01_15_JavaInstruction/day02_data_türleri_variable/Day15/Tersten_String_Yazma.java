package day01_15_JavaInstruction.day02_data_türleri_variable.Day15;

import java.util.Scanner;

public class Tersten_String_Yazma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tersten yazdırmak istediğiniz metni girin");

        String str = scanner.nextLine();

        //Java Candir

        String tersmetin = "";
        int uzunluk = str.length();

        for (int i = 0; i < uzunluk ; ) {
            uzunluk = uzunluk - 1;
            System.out.print(str.charAt(uzunluk));
            tersmetin = tersmetin + str.charAt(uzunluk);
        }


        System.out.println(tersmetin);
    }
}
