package PatikaWeek3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String kelime = sc.nextLine().toLowerCase(); // küçük harfe çeviriyoruz

        Map<Character, Integer> frekans = new HashMap<>();

        for (char c : kelime.toCharArray()) {
            if (Character.isLetter(c)) { // sadece harfler sayılacak
                frekans.put(c, frekans.getOrDefault(c, 0) + 1);
            }
        }

        // Sonuçları yazdırma
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
