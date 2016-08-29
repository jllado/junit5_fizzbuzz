package kata.fizzbuzz;

import java.util.Optional;

/**
 * Created by jllado on 29/08/16.
 */
@FunctionalInterface
public interface Rule {
    public Optional<String> apply(Number number);

}
