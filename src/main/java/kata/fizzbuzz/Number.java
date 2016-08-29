package kata.fizzbuzz;

/**
 * Created by jllado on 29/08/16.
 */
public class Number {

    private final Integer value;

    public Number(Integer value) {
        this.value = value;
    }

    public boolean isDivisibleBy(Integer number) {
        return value % number == 0;
    }
}
