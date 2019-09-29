import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class IsogramChecker {

    boolean isIsogram2(String phrase) {
        Set<Character> uniqueCharacters = new HashSet<>();
        String phraseIgnoreCase = phrase.toLowerCase();
        return IntStream.range(0, phrase.length())
                .filter(index -> Character.isAlphabetic(phraseIgnoreCase.charAt(index)))
                .allMatch(index -> uniqueCharacters.add(phraseIgnoreCase.charAt(index)));
    }

    boolean isIsogram(String phrase) {
        String phraseIgnoreCase = phrase.replaceAll("[- ]", "").toLowerCase();
        return phraseIgnoreCase.chars().distinct().count() == phraseIgnoreCase.length();
    }

}
