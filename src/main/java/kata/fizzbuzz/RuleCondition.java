package kata.fizzbuzz;

/**
 * Created by jllado on 29/08/16.
 */
@FunctionalInterface
public interface RuleCondition {
    public boolean isValid(Number number);
}
