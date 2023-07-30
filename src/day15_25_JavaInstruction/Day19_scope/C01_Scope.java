package day15_25_JavaInstruction.Day19_scope;

public class C01_Scope {


    static int classLevelStatic = 12;

    String strClassLevelOlmayan = "Java Güzeldir";


    public static void main(String[] args) {


        int sayiMain = 20;

        for (int i = 0; i < 10; i++) {
            int sayiForLoop = 5 ;
        }
        

    }

    public static void staticMethod() {


        String strStaticMethod = "Java Candir";


    }


    public void staticOlmayanMethod() {


        boolean blStaticOlmayanMethod = true;

    }


}
