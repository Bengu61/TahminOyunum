import java.util.Scanner;
import java.util.Random;
import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sayı tahmin oyunumuza hoş geldiniz.");
        System.out.println("Öncelikle hangi aralıkta sayı tutmasını istersiniz programın ?");
        Scanner x=new Scanner(System.in);
        System.out.println("Alt değer:");
        int altDeğer=x.nextInt();
        System.out.println("Üst değer:");
        int üstDeğer=x.nextInt();


        Random rand=new Random();
        int sayi=rand.nextInt(üstDeğer-altDeğer+1)+altDeğer;

        System.out.println("Haydi oyunumuz başlasın 3 tahmin hakkınız olduğunu unutmayın.");
        System.out.println("Program sayıyı tuttu şimdi sıra sizde haydi aklınızdaki sayıyı girin:");
        for (int j=0;j<3;j++) {
            System.out.println((j+1)+".deneme:");
            int tahmin=x.nextInt();
            for (int i = 0; i < üstDeğer; i++) {
                if (sayi == tahmin) {
                    System.out.println("Doğru tahmin tebrikler.");
                    break;
                } else {
                    System.out.println("Üzgünüm yanlış tahmin.");
                    break;
                }
            }
        }
        System.out.println("Programın tuttuğu sayı:" + sayi);
    }
}