import java.util.stream.IntStream;

class NaturalNumber {

    private final Classification classification;

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.classification = determineClassification(number);
    }

    private Classification determineClassification(int number) {
        int aliquotSum = aliquotSum(number);
        if (aliquotSum < number) {
            return Classification.DEFICIENT;
        } else if (aliquotSum == number) {
            return Classification.PERFECT;
        } else {
            return Classification.ABUNDANT;
        }
    }

    public Classification getClassification() {
        return classification;
    }

    private int aliquotSum(int number) {
        return IntStream.rangeClosed(1, number / 2)
                .filter(n -> number % n == 0)
                .sum();
    }

}
