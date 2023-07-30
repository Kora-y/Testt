package day01_15_JavaInstruction.day02_data_türleri_variable.day08_If_Else_Statements;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen tam sayi gir : ");
        int tamsayi = scanner.nextInt();

        if (tamsayi % 3 == 0 ) System.out.println(" 3 ün katı");
       else if (tamsayi% 5  == 0) System.out.println("5 in katı");

       else if (tamsayi % 3 == 0 && tamsayi % 5 == 0)  {
            System.out.println("süper sayi");

        }
    }
}
