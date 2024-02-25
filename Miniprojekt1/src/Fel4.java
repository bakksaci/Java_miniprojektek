import java.util.Scanner;
public class Fel4 {
    public Fel4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerek egy szamot:");
        int a = sc.nextInt();

        for(int i = 1; i <= a; ++i) {
            System.out.println();

            for(int j = 0; j < i; ++j) {
                System.out.print("*");
            }
        }

    }
}



