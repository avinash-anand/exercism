import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return squareOf(IntStream.rangeClosed(1, input).sum());
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(1, input)
                .map(this::squareOf)
                .sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    private int squareOf(int number) {
        return number * number;
    }

}
