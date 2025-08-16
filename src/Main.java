//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> tasks = new ArrayList<>();
            int choice;

            do {
                System.out.println("\n--- 📌 To-Do List ---");
                System.out.println("1. Görev Ekle");
                System.out.println("2. Görevleri Listele");
                System.out.println("3. Görev Sil");
                System.out.println("0. Çıkış");
                System.out.print("Seçiminiz: ");
                choice = sc.nextInt();
                sc.nextLine(); // buffer temizleme

                switch (choice) {
                    case 1:
                        System.out.print("Eklemek istediğiniz görevi yazın: ");
                        String task = sc.nextLine();
                        tasks.add(task);
                        System.out.println("Görev eklendi.");
                        break;

                    case 2:
                        System.out.println("\n--- Görevler ---");
                        if (tasks.isEmpty()) {
                            System.out.println("📭 Henüz görev yok.");
                        } else {
                            for (int i = 0; i < tasks.size(); i++) {
                                System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Silmek istediğiniz görev numarasını girin: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        if (index > 0 && index <= tasks.size()) {
                            System.out.println("🗑️ '" + tasks.get(index - 1) + "' silindi.");
                            tasks.remove(index - 1);
                        } else {
                            System.out.println("Geçersiz numara.");
                        }
                        break;

                    case 0:
                        System.out.println("Çıkış yapılıyor...");
                        break;

                    default:
                        System.out.println("Geçersiz seçim!");
                }
            } while (choice != 0);

            sc.close();
        }
    }

