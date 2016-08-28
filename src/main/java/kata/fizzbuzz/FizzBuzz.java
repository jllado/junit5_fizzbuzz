package kata.fizzbuzz;

public class FizzBuzz {
    public FizzBuzz() {
    }

    public String of(Integer number) {
        if (isDivisible(number, 3) && isDivisible(number, 5)) {
            return "FizzBuzz";
        }
        if (isDivisible(number, 3)) {
            return "Fizz";
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