package kata.fizzbuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by jllado on 27/08/16.
 */
public class FizzBuzzTest {

    @Test
    @DisplayName("should return one when one")
    public void return_one_when_one() {
        assertThat(fizzbuzz(1), is("1"));
    }

    private String fizzbuzz(int number) {
        return "";
    }
}
