package day27_parametreliConstructer;

public class C02_HastaneRunner {
    public static void main(String[] args) {
        C01_Hastane personal1 = new C01_Hastane();
        System.out.println(personal1.personelIsmi);
        System.out.println(personal1.personelTelefonu);
        System.out.println(personal1.hastaneAdi);
        System.out.println(personal1.hastaneTelefonu);

        personal1.personelTelefonu = "322352334";
        personal1.personelIsmi = "Mertkan";

        C01_Hastane personal2 = new C01_Hastane();

        System.out.println(personal2.personelIsmi);
        System.out.println(personal2.personelTelefonu);
    }
}
