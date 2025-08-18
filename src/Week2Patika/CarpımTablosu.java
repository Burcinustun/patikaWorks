package Week2Patika;

import java.util.Scanner;

public class CarpımTablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üst sınırı giriniz (1-10): "); //üst sınır girişi
        int number = input.nextInt();

        if (number < 1 || number > 10) { // Girdinin 1 ile 10 arasında olması gerektiğini ifade et
            System.out.println("Hata: Sayı 1 ile 10 arasında olmalıdır.");
            return;

        }
        System.out.println("\n " + number + " x " + number + " Çarpım Tablosu:\n");

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print((i * j) + "\t"); // \t: tablo gibi hizalama için
            }
            System.out.println(); // alt satıra geç
        }
    }
}
