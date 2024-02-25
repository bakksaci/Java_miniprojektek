import java.util.Scanner;
public class Fel1 {
    public Fel1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hanyas szorzotablat irassuk ki?");
        int n = sc.nextInt();

        while (n < 1 || n > 10) {
            System.out.println("Hibás bemenet! A számnak 1 és 10 között kell lennie.");
            System.out.println("Kérem adjon meg egy 1 és 10 közötti egész számot:");
            n = sc.nextInt();
        }

        for(int j = 1; j <= 10; ++j) {
            System.out.println("" + n + "*" + j + "=" + n * j);
        }

    }
}












