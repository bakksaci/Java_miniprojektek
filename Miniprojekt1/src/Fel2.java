import java.util.Scanner;

public class Fel2 {
    public static final int PASSWORD_LENGTH = 4;
    public static final int MAX_ATTEMPTS = 3;

    public static boolean checkPassword(String password) {
        if (password.length() != PASSWORD_LENGTH) {
            return false;
        }
        return password.equals("abcd"); // Példa jelszó: "abcd"
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Kérem, adja meg a jelszót:");
            String input = sc.nextLine();

            if (checkPassword(input)) {
                System.out.println("Sikeres belépés!");
                break;
            } else {
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Hibás jelszó. Még " + (MAX_ATTEMPTS - attempts) + " próbálkozás maradt.");
                } else {
                    System.out.println("Háromszori hibás próbálkozás után a belépés sikertelen.");
                }
            }
        }
    }
}
