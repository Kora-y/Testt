package day01_15_JavaInstruction.day02_data_türleri_variable.day06_Coding;

public class C01_Concatenation {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3 ;
        int b = 5 ;
        // sadece yukarıdaki variable'lar ile
        // aşağıda verilen metinleri oluşturun

        //Java35
        System.out.println(s1 + a+b);

        System.out.println(s1 + a*b);
        System.out.println(a*b + s1);
        //8Candir

        System.out.println(a+b + s2);

        // 53Java
        System.out.println('a' + 'b' + s1);

        //"23" Integer
        //35 Java
        System.out.println( a + b + s1);

    }
}
