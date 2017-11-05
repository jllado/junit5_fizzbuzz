package kata.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Rule> rules = rules();
    private Number number;

    public FizzBuzz(Integer number) {
        this.number = new Number(number);
    }

    private List<Rule> rules() {
        List<Rule> rules = new ArrayList<>();
        rules.add(new Rule(number -> number.isDivisibleBy(3, 5), "FizzBuzz"));
        rules.add(new Rule(number -> number.isDivisibleBy(3), "Fizz"));
        rules.add(new Rule(number -> number.isDivisibleBy(5), "Buzz"));
        return rules;
    }

    @Override
    public String toString() {
        return rules.stream().flatMap(rule -> rule.applyFor(number).stream()).findFirst().orElse(number.toString());
    }

}