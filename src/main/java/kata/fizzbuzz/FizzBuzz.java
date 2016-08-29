package kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FizzBuzz {

    private List<Rule> rules = new ArrayList<>();

    public FizzBuzz() {
        rules.add(number -> isDivisible(number, 3) && isDivisible(number, 5) ? Optional.of("FizzBuzz") : Optional.empty());
        rules.add(number -> isDivisible(number, 3) ? Optional.of("Fizz") : Optional.empty());
        rules.add(number -> isDivisible(number, 5) ? Optional.of("Buzz") : Optional.empty());
    }

    public String of(Integer number) {
        return rules.stream()
                .map(rule -> rule.apply(number))
                .filter(result -> result.isPresent())
                .map(result -> result.get())
                .findFirst().orElse(number.toString());
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}