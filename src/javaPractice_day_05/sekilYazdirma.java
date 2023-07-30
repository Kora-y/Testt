package javaPractice_day_05;

public class sekilYazdirma {

    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        A B C D E F G

        Şeklini yazdırınız. 65 = A'nın ASCII değeri

         */


        for (int i = 65; i < 72; i++) {
            for (int j = 65; j <i+1 ; j++) {
                System.out.print("  " + j);
            }
            System.out.println();
        }




    }
}
