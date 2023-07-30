package day01_15_JavaInstruction.day02_data_türleri_variable.Day15;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tam sayi giriniz");
        int girdi1 = scanner.nextInt();


        for (int i = 1; i <= girdi1; i++) {

            if (i % 15 == 0) {
                System.out.print(" FizzBuzz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {

                System.out.print("Fizz ");
            }else {
                System.out.print(i + " ");
            }


        }

    }

}

