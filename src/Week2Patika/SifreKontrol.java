package Week2Patika;


    import java.util.Scanner;

    public class SifreKontrol {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Şifrenizi giriniz: ");
            String password = scan.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Geçerli Şifre");
            } else {
                System.out.println("Geçersiz Şifre");
            }

            scan.close();
        }

        public static boolean isValidPassword(String password) {
            // 1. En az 8 karakter
            if (password.length() < 8) {
                return false;
            }

            // 2. Space karakteri içermemeli
            if (password.contains(" ")) {
                return false;
            }

            // 3. İlk harf büyük harf olmalı
            char firstChar = password.charAt(0);
            if (!(firstChar >= 'A' && firstChar <= 'Z')) {
                return false;
            }

            // 4. Son karakter '?' olmalı
            if (password.charAt(password.length() - 1) != '?') {
                return false;
            }

            return true; // tüm kurallardan geçtiyse
        }
}
