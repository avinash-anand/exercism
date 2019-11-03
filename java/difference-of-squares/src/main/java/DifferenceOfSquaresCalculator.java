class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return squareOf(sumOfConsecutiveNumbers(input));
    }

    int computeSumOfSquaresTo(int input) {
        return input * (input + 1) * (2 * input + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    private int squareOf(int number) {
        return number * number;
    }

    private int sumOfConsecutiveNumbers(int number) {
        return (number * (number + 1)) / 2;
    }

}
