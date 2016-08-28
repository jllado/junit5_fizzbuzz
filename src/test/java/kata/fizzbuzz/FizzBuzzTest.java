package kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
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
    @DisplayName("return")
    public Stream<DynamicTest> return_number_when_number() {
        return IntStream.of(1, 2, 4).mapToObj(number -> DynamicTest.dynamicTest(number + " when " + number,
                () -> assertThat(fizzbuzz(number), is(String.valueOf(number)))));
    }

    @Test
    public void return_fizz_when_three() throws Exception {
        assertThat(fizzbuzz(3), is("Fizz"));
    }

    @Test
    public void return_fizz_when_six() throws Exception {
        assertThat(fizzbuzz(6), is("Fizz"));
    }

    private String fizzbuzz(Integer number) {
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        return number.toString();
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }
}
