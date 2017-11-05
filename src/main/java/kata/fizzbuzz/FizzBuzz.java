package kata.fizzbuzz;

import java.util.List;

public class FizzBuzz {

    private static final List<Rule> RULES = List.of(
            new Rule(number1 -> number1.isDivisibleBy(3, 5), "FizzBuzz"),
            new Rule(number1 -> number1.isDivisibleBy(3), "Fizz"),
            new Rule(number1 -> number1.isDivisibleBy(5), "Buzz"));

    private Number number;

    public FizzBuzz(Integer number) {
        this.number = new Number(number);
    }

    @Override
    public String toString() {
        return RULES.stream().flatMap(rule -> rule.applyFor(number).stream()).findFirst().orElse(number.toString());
    }

}