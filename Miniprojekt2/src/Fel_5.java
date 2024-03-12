import java.util.Arrays;
public class Fel_5 {
    public static void main(String[] args) {
            int[] tomb = {1, 2, 3, 4, 5};

            System.out.println("Eredeti tömb: " + Arrays.toString(tomb));

            if (tomb.length >= 2) {
                // Első és utolsó elem csere
                int temp = tomb[0];
                tomb[0] = tomb[tomb.length - 1];
                tomb[tomb.length - 1] = temp;

                System.out.println("Csere utáni tömb: " + Arrays.toString(tomb));
            } else {
                System.out.println("A tömbnek legalább két eleme kell legyen a cserehez!");
            }
        }

}
