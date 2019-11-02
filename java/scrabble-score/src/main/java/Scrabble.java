import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

class Scrabble {

    private final String word;
    private static final Map<Character, Integer> letterValues = prepareLetterValues();

    Scrabble(String word) {
        Objects.requireNonNull(word, "Can not compute score for null word");
        this.word = word.toUpperCase();
    }

    int getScore() {
        char[] characters = word.toCharArray();
        return IntStream.range(0, characters.length)
                .map(index -> letterValues.getOrDefault(characters[index], 0))
                .sum();
    }

    private static Map<Character, Integer> prepareLetterValues() {
        Map<Character, Integer> letterValueMap = new HashMap<>();
        Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T').forEach(ch -> letterValueMap.put(ch, 1));
        Arrays.asList('D', 'G').forEach(ch -> letterValueMap.put(ch, 2));
        Arrays.asList('B', 'C', 'M', 'P').forEach(ch -> letterValueMap.put(ch, 3));
        Arrays.asList('F', 'H', 'V', 'W', 'Y').forEach(ch -> letterValueMap.put(ch, 4));
        letterValueMap.put('K', 5);
        Arrays.asList('J', 'X').forEach(ch -> letterValueMap.put(ch, 8));
        Arrays.asList('Q', 'Z').forEach(ch -> letterValueMap.put(ch, 10));
        return letterValueMap;
    }

}
