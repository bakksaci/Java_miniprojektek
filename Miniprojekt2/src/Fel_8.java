import java.util.Scanner;

public class Fel_8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kérem adja meg a tömb méretét: ");
            int meret = scanner.nextInt();

            int[] tomb = new int[meret];
            System.out.println("Kérem adja meg a tömb elemeit:");
            for (int i = 0; i < meret; i++) {
                tomb[i] = scanner.nextInt();
            }

            rendezTomb(tomb);

            System.out.println("Növekvő sorrendben rendezett tömb:");
            for (int elem : tomb) {
                System.out.print(elem + " ");
            }

            scanner.close();
        }

        public static void rendezTomb(int[] tomb) {
            int n = tomb.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (tomb[j] > tomb[j + 1]) {
                        int temp = tomb[j];
                        tomb[j] = tomb[j + 1];
                        tomb[j + 1] = temp;
                    }
                }
            }
        }

}
