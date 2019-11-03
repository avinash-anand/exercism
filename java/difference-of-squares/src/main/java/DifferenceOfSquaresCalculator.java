class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return squareOf(sumOfConsecutiveNumbers(input));
    }

    int computeSumOfSquaresTo(int input) {
        return sumOfConsecutiveNumbers(input) * (2 * input + 1) / 3;
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
