package PatikaWeek3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumsClosest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        // Benzersiz ve pozitif 10 sayı ekleme
        while (numbers.size() < 10) {
            int num = rand.nextInt(100) + 1; // 1-100 arasında sayı
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println("Liste: " + numbers);

        // Listeyi sırala
        Collections.sort(numbers);
        System.out.println("Sıralı Liste: " + numbers);

        // En yakın iki elemanı bulma
        int minDiff = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = numbers.get(i + 1) - numbers.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);
            }
        }

        System.out.println("En yakın iki eleman: " + num1 + " ve " + num2 + " (Fark: " + minDiff + ")");
    }



}
