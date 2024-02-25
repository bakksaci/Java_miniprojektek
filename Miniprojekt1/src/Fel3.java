import java.util.Scanner;
public class Fel3 {
    public Fel3() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kerek egy szamot:");
        int a = sc.nextInt();
        System.out.println("Kerek meg egy szamot:");
        int b = sc.nextInt();
        System.out.println("" + a + "+" + b + "=" + (a + b));
        System.out.println("" + a + "-" + b + "=" + (a - b));
        System.out.println("" + a + "*" + b + "=" + a * b);
        System.out.println("" + a + "/" + b + "=" + a / b);
    }

}






