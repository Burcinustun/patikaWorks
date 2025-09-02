package ClassList;

public class Main {
    public static void main(String[] args) {
        MyClassList<String> list = new MyClassList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Python");

        System.out.println("Liste: " + list);
        System.out.println("indexOf(Java): " + list.indexOf("Java"));
        System.out.println("lastIndexOf(Python): " + list.lastIndexOf("Python"));
        System.out.println("contains(C++): " + list.contains("C++"));
        System.out.println("isEmpty: " + list.isEmpty());

        // Eleman silme ve güncelleme
        list.remove(0);
        list.set(1, "Go");
        System.out.println("Güncellenmiş Liste: " + list);

        // Alt liste
        MyClassList<String> sub = list.sublist(0, 1);
        System.out.println("Sublist: " + sub);

        // Düzeltilmiş toArray kullanımı
        String[] array = list.toArray(new String[0]);
        System.out.println("Array[0]: " + array[0]);

        // Listeyi temizleme
        list.clear();
        System.out.println("Temizlenmiş Liste: " + list);
        System.out.println("isEmpty: " + list.isEmpty());
    }

}
