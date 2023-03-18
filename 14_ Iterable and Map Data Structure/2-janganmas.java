import java.util.ArrayList;
import java.util.HashMap;

public class janganmas {
    public static void main(String[] args) {
        String input = "76523752";
        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Character, Integer> digitCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            digitCount.put(c, digitCount.getOrDefault(c, 0) + 1);
        }

        for (char c : digitCount.keySet()) {
            if (digitCount.get(c) == 1) {
                output.add(Character.getNumericValue(c));
            }
        }


        int[] result = output.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(java.util.Arrays.toString(result));
    }
}