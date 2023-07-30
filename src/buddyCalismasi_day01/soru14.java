package buddyCalismasi_day01;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim = scanner.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);
        int sayac = 0;
        int index = 0;
        while (index < isim.length()){
            if (isim.charAt(index) == karakter){
                sayac ++;
            }
            index++;
        }
        System.out.println(karakter + " sayısı " + sayac + " adettir");

        }
    }

