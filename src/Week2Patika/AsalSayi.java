package Week2Patika;

import java.util.Scanner;

public class AsalSayi {

    static boolean asalsayi(int n, int bolen) { //metot oluştur recorsive için
        if (n<2) {
            return false; // 2 den küçük sayılar asal değildir.
        }
        if (n%bolen==0){
            return n==bolen; //yalnızca kendine bölünüyorsa asal
        }
        if(bolen*bolen>n){
            return true;
        }
        return asalsayi(n, bolen + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        if (asalsayi(sayi, 2)) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");

        }
    }



}
