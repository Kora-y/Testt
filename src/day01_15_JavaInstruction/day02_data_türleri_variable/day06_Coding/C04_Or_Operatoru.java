package day01_15_JavaInstruction.day02_data_türleri_variable.day06_Coding;

public class C04_Or_Operatoru {

    public static void main(String[] args) {


        //or operatoru iyimserdir
        //yani tek bir true bile yeterli olur
        //or operatorunde tüm mantıksal ifadeler false ise sonuç false
        //değil ise sonuç truedur


        //or operatoru matematikteki toplama işlemine benzer
        //toplanan sayılardan bir tane bile sıfır olmayan varsa sonuç sıfır
        //sonuç sıfır olmaz

        System.out.println( 3 > 5 || 6 > 4);

        System.out.println( 3 < 5 || 6 > 4 );
        System.out.println(3 < 5 || 6 < 4 );

        System.out.println( 3 > 5 || 6 < 4); //false ||false >> false

        int sayi = 24 ;

        // sayi 3 veya 5'e bölünmelidir


        System.out.println( sayi % 3 == 0 || sayi % 5 == 0);

        //sayi 0'dan büyük veya 100'den küçük olmalıdır

        System.out.println(sayi > 0 || sayi < 100); //true || true ==>> true

        System.out.println();
    }
}
