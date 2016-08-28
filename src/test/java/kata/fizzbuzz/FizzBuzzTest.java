package kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by jllado on 27/08/16.
 */
@DisplayName("FizzBuzz should")
public class FizzBuzzTest {

    @TestFactory
    public Stream<DynamicTest> return_number_when_number() {
        return IntStream.of(1, 2, 4).mapToObj(number -> DynamicTest.dynamicTest(number + " when " + number,
                () -> assertThat(fizzbuzz(number), is(String.valueOf(number)))));
    }

    @TestFactory
    public Stream<DynamicTest> return_fizz_when_number_is_divisible_by_three() throws Exception {
        return IntStream.of(3, 6, 9).mapToObj(number -> DynamicTest.dynamicTest("Fizz when " + number,
                () -> assertThat(fizzbuzz(number), is("Fizz"))));
    }

    @TestFactory
    public Stream<DynamicTest> return_buzz_when_number_is_divisible_by_five() throws Exception {
        return IntStream.of(5, 10).mapToObj(number -> DynamicTest.dynamicTest("Buzz when " + number,
                () -> assertThat(fizzbuzz(number), is("Buzz"))));
    }

    private String fizzbuzz(Integer number) {
        if (isDivisible(number, 3)) {
            return "Fizz";
        }
        if (isDivisible(number, 5)) {
            return "Buzz";
        }
        return number.toString();
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
