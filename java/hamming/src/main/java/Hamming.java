import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Objects.isNull;

public class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        illegalArgumentsError(leftStrand, rightStrand).ifPresent(msg -> {
            throw new IllegalArgumentException(msg);
        });
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    private Optional<String> illegalArgumentsError(String leftStrand, String rightStrand) {
        if (isNull(leftStrand) || isNull(rightStrand)) {
            return Optional.of("leftStrand or rightStrand can not be null.");
        } else if (leftStrand.length() != rightStrand.length()) {
            if (leftStrand.isEmpty()) {
                return Optional.of("left strand must not be empty.");
            } else if (rightStrand.isEmpty()) {
                return Optional.of("right strand must not be empty.");
            } else {
                return Optional.of("leftStrand and rightStrand must be of equal length.");
            }
        } else {
            return Optional.empty();
        }
    }

    int getHammingDistance() {
        if (Objects.equals(leftStrand, rightStrand)) {
            return 0;
        } else {
            return (int) IntStream
                    .range(0, leftStrand.length())
                    .filter(index -> leftStrand.charAt(index) != rightStrand.charAt(index))
                    .count();
        }
    }

}
