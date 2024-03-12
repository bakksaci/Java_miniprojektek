import java.util.Scanner;
public class Fel_2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Kérem adjon meg egy szót:");
            String szo = scanner.nextLine();

            if (szo.contains("a")) {
                String modositottSzo = szo.replace('a', '*');
                System.out.println("A módosított szó: " + modositottSzo);
            } else {
                System.out.println("A megadott szóban nincs 'a' karakter!");
            }

            scanner.close();
        }
}
