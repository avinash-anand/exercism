import java.util.Arrays;
import java.util.stream.IntStream;

class ResistorColor {

    private final String[] COLORS = {
            "black", "brown", "red",
            "orange", "yellow", "green",
            "blue", "violet", "grey", "white"
    };

    int colorCode(String color) {
        return Arrays.asList(COLORS).indexOf(color);
    }

    int colorCode2(String color) {
        return IntStream.range(0, COLORS.length)
                .filter(index -> COLORS[index].equals(color))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid color provided"));
    }

    String[] colors() {
        return COLORS;
    }
}
