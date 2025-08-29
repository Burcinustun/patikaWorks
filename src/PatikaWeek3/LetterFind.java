package PatikaWeek3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LetterFind {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // 4 rastgele harf ekleme
        while (letters.size() < 4) {
            char ch = (char) (rand.nextInt(26) + 'a'); // a-z arası
            String letter = String.valueOf(ch);
            if (!letters.contains(letter)) {
                letters.add(letter);
            }
        }

        System.out.println("Başlangıç listesi: " + letters);

        // Kullanıcıdan 4 harf alma ve işlem yapma
        for (int i = 0; i < 4; i++) {
            System.out.print("Bir harf giriniz: ");
            String input = sc.next().toLowerCase();

            if (letters.contains(input)) {
                int index = letters.indexOf(input);
                letters.set(index, "found");
                System.out.println(input + " bulundu, 'found' ile değiştirildi.");
            } else {
                letters.add(input);
                System.out.println(input + " listede yoktu, listeye eklendi.");
            }
        }

        System.out.println("Güncellenmiş liste: " + letters);
    }

}
