package kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FizzBuzz {

    private List<Rule> rules = new ArrayList<>();

    public FizzBuzz() {
        rules.add(number -> isDivisible(number, 3) && isDivisible(number, 5) ? Optional.of("FizzBuzz") : Optional.empty());
        rules.add(number -> isDivisible(number, 3) ? Optional.of("Fizz") : Optional.empty());
    }

    public String of(Integer number) {
        for (Rule rule : rules) {
            Optional<String> result = rule.apply(number);
            if (result.isPresent()) {
                return result.get();
            }
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