package kata.fizzbuzz;

import java.util.Optional;

/**
 * Created by jllado on 29/08/16.
 */
public class Rule {

    private final RuleCondition condition;
    private final String result;

    public Rule(final RuleCondition condition, final String result) {
        this.condition = condition;
        this.result = result;
    }

    public Optional<String> applyFor(final Number number) {
        return condition.isValid(number) ? Optional.of(result) : Optional.empty();
    }

}
