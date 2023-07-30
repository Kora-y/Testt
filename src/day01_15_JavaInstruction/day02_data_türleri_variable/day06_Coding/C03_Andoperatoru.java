package day01_15_JavaInstruction.day02_data_türleri_variable.day06_Coding;

public class C03_Andoperatoru {
    public static void main(String[] args) {
        System.out.println( 5 > 3 && 6 > 4); // true and true ==> true

        System.out.println(5 < 3 && 6 > 4 ); // false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4); // true and false ==> false

        System.out.println(5 <= 3 && 6<=4); //false and false ==> false

        //and operatoru ile bağlanan boolean ifadeler kaç tane olursa olsun
        //hepsi true ise sonuç true,bunun dışındaki tüm durumlarda falsedur

        // bu yönüyle matematikteki çarpmaya benzer




        // bir sayinin hem 2,hem 3 hem 5 ile bölünebilmesi lazım

        int sayi = 24 ;

        System.out.println( sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);

         // eğer sayımız 24 ise sonuç false'dur

        //sayi 0 veya daha büyük ve 100 veya daha küçük  olmalıdır

        System.out.println( sayi >= 0 && sayi <= 100);

        //true && true ==> true




    }
}
