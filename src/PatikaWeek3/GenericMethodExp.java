package PatikaWeek3;

public class GenericMethodExp {

    // Generic printArray metodu
    public static <T> void printArray(T[] array) {
        for (T element : array) { // <T> → Bu metodun generic olduğunu ve bir tip parametresi (T) alacağını Java’ya bildiriyor.
            System.out.print(element + " ");
        }
        System.out.println(); // satır sonu
    }

    public static void main(String[] args) {
        // Integer dizi
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String dizi
        String[] strArray = {"Java", "Generics", "Ödev"};
        // Double dizi
        Double[] dblArray = {1.1, 2.2, 3.3};

        // Metodu çağırma
        printArray(intArray);
        printArray(strArray);
        printArray(dblArray);
    }
}
