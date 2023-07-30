package buddyCalismasi_day01;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {
    /*    Soru 15-)  Kullanıcıdan en az 5 harfli bir kelime alın.
             Alınan kelimenin son 3 harfinin 2 kopyasından oluşan yeni bir String oluşturun ve konsolda yazdırın
               Kullanicidan alinan isim uzunluğu en az 5 değilse yeni bir kelime  girmesini isteyin.
              Ipucu:  For/While/Do Loops konularını ve String Manipulation konularını hatırlayalım!
                Loopun içerisinde StringM methodlarından  yararlanalım!


     */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı en az 5 harfli bir kelime gir : ");

        String girdi1 = "";

        boolean flag = false;

        while (!flag) {
            girdi1 = scanner.next();
            if (girdi1.length() < 5) {
                System.out.println("Geçersiz girdi,kelime en az 5 harfli olmalıdır,lütfen yeni bir kelime girin : ");
            }else {
                String temp = girdi1.substring(girdi1.length()-3) + girdi1.substring(girdi1.length()-3);
                System.out.println(temp);
                flag = true ;
            }

        }


    }
}
