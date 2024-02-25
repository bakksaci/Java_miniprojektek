import java.util.Scanner;

public class Fel5 {
    public static boolean containsOnlyAlphabetic(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adjon meg egy szót:");
        String input = scanner.next();

        boolean result = containsOnlyAlphabetic(input);

        if (result) {
            System.out.println("A szó csak alfabetikus karaktereket tartalmaz.");
        } else {
            System.out.println("A szó nem csak alfabetikus karaktereket tartalmaz.");
        }
    }
}
