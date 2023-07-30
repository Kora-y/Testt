package buddyCalismasi_day01;

import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {


        /*

        Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
        Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        Ipucu:
        Switch konusunu hatırlayalım!

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("a,b veya c şıklarından birini giriniz.");
        String cevap = scanner.next();

        char anaCevap = cevap.charAt(0);

        switch (anaCevap){
            case 'a' :
                System.out.println("İsteğiniz işleniyor");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c':
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş,lütfen tekrar deneyin!");
        }

    }
}
