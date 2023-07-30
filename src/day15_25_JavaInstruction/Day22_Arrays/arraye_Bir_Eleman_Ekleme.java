package day15_25_JavaInstruction.Day22_Arrays;

import java.util.Scanner;

public class arraye_Bir_Eleman_Ekleme {
    public static void main(String[] args) {


        int[] array1 = {1, 2, 3, 4, 5};

        //verilecek bir arrayin uzunluğunu bir arttırarak
        //verilecek değeri ekleyen bir method yazın

        Scanner scanner = new Scanner(System.in);

        int eklenecekArray = scanner.nextInt();


          int[] sonArray  =   arrayEkleme(eklenecekArray, array1);


        for (int i = 0; i < sonArray.length; i++) {
            System.out.println(sonArray[i]);
        }
    }


    public static int[] arrayEkleme(int verilecekDeğer, int[] degistirilecekArray) {


        int[] yeniArray = new int[degistirilecekArray.length + 1];

        for (int i = 0; i < degistirilecekArray.length ; i++) {
            yeniArray[i] = degistirilecekArray[i];

        }


        yeniArray[yeniArray.length - 1] = verilecekDeğer;



        return yeniArray;


    }
}
