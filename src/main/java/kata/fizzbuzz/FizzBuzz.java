package kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Rule> rules = new ArrayList<>();

    public FizzBuzz() {
        rules.add(new Rule(number -> number.isDivisibleBy(3) && number.isDivisibleBy(5), "FizzBuzz"));
        rules.add(new Rule(number -> number.isDivisibleBy(3), "Fizz"));
        rules.add(new Rule(number -> number.isDivisibleBy(5), "Buzz"));
    }

    public String of(Integer number) {
        return rules.stream()
                .map(rule -> rule.apply(new Number(number)))
                .filter(result -> result.isPresent())
                .map(result -> result.get())
                .findFirst().orElse(number.toString());
    }

}