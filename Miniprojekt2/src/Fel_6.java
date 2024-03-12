public class Fel_6 {
    public static void main(String[] args) {
            int[] tomb = {4, 7, 2, 9, 1, 6, 3, 8, 5};

            int legkisebb = tomb[0];
            int legnagyobb = tomb[0];

            for (int i = 1; i < tomb.length; i++) {
                if (tomb[i] < legkisebb) {
                    legkisebb = tomb[i];
                }
                if (tomb[i] > legnagyobb) {
                    legnagyobb = tomb[i];
                }
            }

            System.out.println("A tömb legkisebb eleme: " + legkisebb);
            System.out.println("A tömb legnagyobb eleme: " + legnagyobb);
        }

}
