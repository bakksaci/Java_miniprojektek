import java.util.HashMap;
import java.util.Map;

public class Fel_7 {
    public static void main(String[] args) {
            int[] tomb = {1, 2, 3, 4, 5, 2, 3, 4, 5, 5};

            Map<Integer, Integer> elemekGyakorisaga = new HashMap<>();

            for (int elem : tomb) {
                if (elemekGyakorisaga.containsKey(elem)) {
                    elemekGyakorisaga.put(elem, elemekGyakorisaga.get(elem) + 1);
                } else {
                    elemekGyakorisaga.put(elem, 1);
                }
            }

            System.out.println("A többször előforduló elemek:");
            for (Map.Entry<Integer, Integer> entry : elemekGyakorisaga.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " (megjelenés: " + entry.getValue() + " alkalom)");
                }
            }
        }

}
