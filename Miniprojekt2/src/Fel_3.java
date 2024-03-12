import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Fel_3 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Kérem adjon meg egy karakterláncot:");
            String karakterlanc = scanner.nextLine();

            String egyediKarakterek = removeDuplicates(karakterlanc);

            System.out.println("Az egyedi karakterekkel rendelkező karakterlánc: " + egyediKarakterek);

            scanner.close();
        }

        public static String removeDuplicates(String karakterlanc) {
            Set<Character> karakterHalmaz = new HashSet<>();
            StringBuilder egyediKarakterek = new StringBuilder();

            for (int i = 0; i < karakterlanc.length(); i++) {
                char karakter = karakterlanc.charAt(i);
                if (!karakterHalmaz.contains(karakter)) {
                    karakterHalmaz.add(karakter);
                    egyediKarakterek.append(karakter);
                }
            }

            return egyediKarakterek.toString();
        }

}
