package day15_25_JavaInstruction.day23_multiDimensionalArrays;

public class arraydeki_EnBuyukveEn_Kucuk_Sayiyi_Yazdir {

    public static void main(String[] args) {
        int[][] arr1 = {{3, 6, 8}, {2, 5, 9}, {-12, 3}, {12, 23, 72}};


        enBuyukEnKucukYazdir(arr1);
    }

    public static void enBuyukEnKucukYazdir(int[][] arr){


        int enKücükSayi = arr[0][0];
        int enBüyükSayi = arr[0][0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]<enKücükSayi) {
                    enKücükSayi = arr[i][j];
                }

                if (arr[i][j]>enBüyükSayi) {
                    enBüyükSayi = arr[i][j];
                }

            }
        }


        System.out.println(enKücükSayi);
        System.out.println(enBüyükSayi);

    }
}
