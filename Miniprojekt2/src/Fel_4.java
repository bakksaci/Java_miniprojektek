import java.util.Scanner;
public class Fel_4 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Kérem adjon meg egy karakterláncot:");
            String karakterlanc = scanner.nextLine();

            String tomoritettKarakterlanc = tomorit(karakterlanc);

            System.out.println("A tömörített karakterlánc: " + tomoritettKarakterlanc);

            scanner.close();
        }

        public static String tomorit(String karakterlanc) {
            if (karakterlanc == null || karakterlanc.isEmpty()) {
                return "";
            }

            StringBuilder tomoritettKarakterlanc = new StringBuilder();
            char currentChar = karakterlanc.charAt(0);
            int count = 1;

            for (int i = 1; i < karakterlanc.length(); i++) {
                if (karakterlanc.charAt(i) == currentChar) {
                    count++;
                } else {
                    tomoritettKarakterlanc.append(currentChar);
                    tomoritettKarakterlanc.append(count);
                    currentChar = karakterlanc.charAt(i);
                    count = 1;
                }
            }

            // Az utolsó karakter hozzáadása
            tomoritettKarakterlanc.append(currentChar);
            tomoritettKarakterlanc.append(count);

            return tomoritettKarakterlanc.toString();
        }

}
