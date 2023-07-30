package day01_15_JavaInstruction.day02_data_türleri_variable.day06_Coding;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        //Java'da "=" işareti karşılaştırma değil
        //atama işaretidir "assignment"

        b = 2 * a ;

        // java'da eşitliği kontrol etmek
        //istersek "==" kullanırız

        System.out.println( b == 2*a); //20 ==20


        System.out.println(3*b > 5*a);

        //assignment'ta eşitliğin sol tarafında
        //sadece variable bulunur

        //karşılaştırma operatorlerinde iki
        //tarafta da işlem olabilir

        System.out.println(b>= b-a);
        //20>=10 ==> true

        System.out.println( a<= b-a);



        //Java'da karşılaştırma operatorler
        //inde kullanılan boolean değeri
        //tersine çevirir

        System.out.println(a < b); //true


        System.out.println(!(a < b) );
        // önce parantezi yapacak
        //başında ünlem true ise false
        //false ise true yapar

        System.out.println(a != b); //true





    }
}
