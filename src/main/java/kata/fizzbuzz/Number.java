package kata.fizzbuzz;

import java.util.stream.Stream;

/**
 * Created by jllado on 29/08/16.
 */
public class Number {

    private final Integer value;

    public Number(Integer value) {
        this.value = value;
    }

    public boolean isDivisibleBy(Integer... numbers) {
        return Stream.of(numbers).allMatch(number -> value % number == 0);
    }
}
