package kata.fizzbuzz;

import java.util.Optional;

/**
 * Created by jllado on 29/08/16.
 */
public class Rule {

    private RuleCondition condition;
    private String result;

    public Rule(RuleCondition condition, String result) {
        this.condition = condition;
        this.result = result;
    }

    public Optional<String> applyFor(Number number) {
        return condition.isValid(number) ? Optional.of(result) : Optional.empty();
    }

}
