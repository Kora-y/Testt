package day15_25_JavaInstruction.day23_multiDimensionalArrays;

public class arrayMultiDimensionalQuestions {
    public static void main(String[] args) {


        int[][] arr1 = {{3, 6, 8}, {2, 5, 9}, {1, 3}, {12, 23, 34}};


        int sayac = 0;

        for (int i = 0; i < arr1.length; i++) {


            for (int j = 0; j < arr1[i].length; j++) {

                if (!(arr1[i][j] % 2 == 0)) {


                    System.out.print("  " + arr1[i][j]);

                    sayac++;

                }


            }
        }


        System.out.println(" Toplamda " + sayac + " kadar sayı yazdırıldı.");

    }
}
