import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountToken {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Chua nhap tham so.");
            return;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        String inputString = String.join(" ", args);

        char[] charArray = inputString.replaceAll("\\s", "").toCharArray();
        for (char token : charArray) {
            frequencyMap.put(token, frequencyMap.getOrDefault(token, 0) + 1);
        }
        Map<Character, Integer> sortedFrequencyMap = new TreeMap<>(frequencyMap);

        System.out.println("Token\tNum");
        for (Map.Entry<Character, Integer> entry : sortedFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}