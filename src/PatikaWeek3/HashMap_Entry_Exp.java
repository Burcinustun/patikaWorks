package PatikaWeek3;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Entry_Exp {
    public static void main(String[] args) {
        // HashMap tanımı
        Map<String, Integer> scores = new HashMap<>();

        // 5 farklı giriş ekleme
        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Tüm key-value çiftlerini yazdırma
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
