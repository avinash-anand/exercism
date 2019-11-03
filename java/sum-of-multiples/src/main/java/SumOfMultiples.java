import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

class SumOfMultiples {

    private final int sumOfMultiples;

    SumOfMultiples(int number, int[] set) {
        this.sumOfMultiples = Arrays.stream(set)
                .filter(isNotZero())
                .flatMap(num -> allMultiplesOfNumLessThan(number, num))
                .distinct()
                .sum();
    }

    private IntStream allMultiplesOfNumLessThan(int number, int num) {
        return IntStream.rangeClosed(1, number / num)
                .map(index -> num * index)
                .filter(isLessThan(number));
    }

    private IntPredicate isNotZero() {
        return multiple -> multiple != 0;
    }

    private IntPredicate isLessThan(int number) {
        return multiple -> multiple < number;
    }

    int getSum() {
        return sumOfMultiples;
    }

}
