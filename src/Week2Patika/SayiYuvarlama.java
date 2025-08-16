package Week2Patika;

    import java.util.Scanner;

    public class SayiYuvarlama {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ondalıklı bir sayı giriniz: ");
            double number = sc.nextDouble();

            // Aşağı yuvarlama
            System.out.println("Aşağı yuvarlama (floor): " + Math.floor(number));

            // Yukarı yuvarlama
            System.out.println("Yukarı yuvarlama (ceil): " + Math.ceil(number));

            // En yakın tam sayıya yuvarlama
            System.out.println(" En yakın tam sayı (round): " + Math.round(number));

            sc.close();
        }
}
