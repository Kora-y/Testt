package projePractice_dersleri;

import java.util.Scanner;

public class sezar_sifreleme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen şifrelenecek bir metin giriniz : ");

        String sifrelenecekMetin = scanner.nextLine();

        String sifrelenmisMetin = sezarSifreleme(sifrelenecekMetin,2);
      /*  for (int i = 0; i < sifrelenecekMetin.length(); i++) {

            int temp;

            temp = 1 + sifrelenecekMetin.charAt(i);

            char tempChar = (char) temp;

            String tempString = String.valueOf(tempChar);

            System.out.print(tempString.replaceAll("!", " "));


        }


       */

        System.out.println();
    }

    public static String sezarSifreleme(String sifrelenecekMetin,int kaydirmaMiktari){


        for (int i = 0; i < sifrelenecekMetin.length(); i++) {

           int temp = kaydirmaMiktari + sifrelenecekMetin.charAt(i);

            char tempChar = (char) temp;

            String tempString = String.valueOf(tempChar);

            System.out.print(tempString.replaceAll("!", " "));


        }


        return "";
    }
}
