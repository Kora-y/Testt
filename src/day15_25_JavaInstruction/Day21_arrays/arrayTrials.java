package day15_25_JavaInstruction.Day21_arrays;

public class arrayTrials {
    public static void main(String[] args) {

        String[] isimler = {"Resul", "Omer", "Mehmet", "Ertugrul"};

        enUzunKisaYazdir(isimler);


        String str = "Koray";

    }

    public static void enUzunKisaYazdir(String[] isimler) {
        String enKisaKelime = isimler[0];
        String enUzunKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }
        }

        System.out.println("En uzun kelime: " + enUzunKelime);
        System.out.println("En kısa kelime: " + enKisaKelime);
    }
}
