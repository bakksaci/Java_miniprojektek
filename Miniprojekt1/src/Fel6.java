public class Fel6 {
    public Fel6() {
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Két teszttömb inicializálása
        int[] tomb1 = new int[]{1, 8, 3, 5, 4, 9};
        int[] tomb2 = new int[]{1, 8, 3, 2, 4, 9};

        boolean equalArrays = areArraysEqual(tomb1, tomb2);

        if (equalArrays) {
            System.out.println("A tömbök egyenlőek.");
        } else {
            System.out.println("A tömbök nem egyenlőek.");
        }
    }
}

