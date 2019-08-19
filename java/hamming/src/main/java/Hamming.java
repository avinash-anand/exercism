import java.util.Objects;
import java.util.stream.IntStream;

import static java.util.Objects.nonNull;

class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (nonNull(leftStrand) && nonNull(rightStrand)) {
            validateArguments(leftStrand, rightStrand);
            this.leftStrand = leftStrand;
            this.rightStrand = rightStrand;
        } else {
            throw new IllegalArgumentException("leftStrand or rightStrand can not be null.");
        }
    }

    private void throwIllegalArgumentException(String msg) {
        throw new IllegalArgumentException(msg);
    }

    private void validateArguments(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            if (leftStrand.isEmpty()) {
                throwIllegalArgumentException("left strand must not be empty.");
            } else if (rightStrand.isEmpty()) {
                throwIllegalArgumentException("right strand must not be empty.");
            } else {
                throwIllegalArgumentException("leftStrand and rightStrand must be of equal length.");
            }
        }
    }

    int getHammingDistance() {
        if (Objects.equals(leftStrand, rightStrand)) {
            return 0;
        } else {
            return IntStream
                    .range(0, leftStrand.length())
                    .reduce(0,
                            (acc, index) -> (leftStrand.charAt(index) != rightStrand.charAt(index)) ? acc + 1 : acc
                    );
        }
    }

}
