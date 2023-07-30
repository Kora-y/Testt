package day01_15_JavaInstruction.day02_data_türleri_variable.day08_If_Else_Statements;

import java.util.Scanner;

public class IF_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyet gir");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("yaş gir");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas >=65)
        {
            System.out.println("erkek emekli olabilir");
        }else if (cinsiyet == 'E' && yas < 65)
        {
            System.out.println("Erkek Emekli olamaz");
        }
        else if ( cinsiyet == 'K' && yas >= 60 )
        {
            System.out.println("Kadın emekli olabilir");
        }
        else if (cinsiyet == 'K' && yas <60) {
            System.out.println("Kadin emekli olamaz");
        }
    }
}
