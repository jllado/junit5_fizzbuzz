package kata.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jllado on 28/08/16.
 */
public class Game {

    public List<String> play() {
        return IntStream.rangeClosed(1, 100).mapToObj(number -> new FizzBuzz(number).toString()).collect(Collectors.toList());
    }

}
