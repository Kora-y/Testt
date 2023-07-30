package projePractice_dersleri;

public class MountainArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 3, 2, 1, 0};
        System.out.println(mountainArrayKontrol(array1)); // true
    }

    public static boolean mountainArrayKontrol(int[] girilenArray) {
        int sayac = 0;
        boolean mountainArrayKontrol1 = false;
        boolean mountainArrayKontrol2 = false;
        int enBuyukSayi = -10000; // En büyük sayıyı bulmak için değişkeni döngü öncesi tanımlayın

        for (int i = 0; i < girilenArray.length; i++) {
            if (girilenArray[i] > enBuyukSayi) {
                enBuyukSayi = girilenArray[i];
                sayac++;
            }
        }

        for (int j = 0; j < sayac-1; j++) {
            if (girilenArray[j] < girilenArray[sayac - 1]) {
                mountainArrayKontrol1 = true;
            } else {
                mountainArrayKontrol1 = false;
            }
        }

        for (int j = sayac; j < girilenArray.length; j++) {
            if (girilenArray[sayac - 1] > girilenArray[j]) {
                mountainArrayKontrol2 = true;
            } else {
                mountainArrayKontrol2 = false;
            }
        }

        return mountainArrayKontrol2 && mountainArrayKontrol1;
    }
}

