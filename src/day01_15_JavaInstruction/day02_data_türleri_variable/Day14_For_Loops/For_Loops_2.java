package day01_15_JavaInstruction.day02_data_türleri_variable.Day14_For_Loops;

import java.util.Scanner;

public class For_Loops_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen başlangıç değeri için pozitif tam sayı girin");

        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitiş değeri için pozitif bir tam sayı girin");

        int bitis = scanner.nextInt();

        if (baslangic > bitis) {
            System.out.println("Başlangıç değeri,bitiş değerinden büyük olamaz");

        }


        int toplam = 0;

        for (int i = baslangic ; i <= bitis ; i++){
            //toplam = toplam + i;
            toplam += i ;
        }
        

        System.out.println(toplam);




    }
}
