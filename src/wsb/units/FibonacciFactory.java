package wsb.units;

import wsb.fib.Fibonacci;
import wsb.fib.PlainFibonacci;
import wsb.fib.RecursiveFibonacci;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FibonacciFactory {
    private static Pattern PATTERN = Pattern.compile("^([rp])(\\d+)$");

    public static final String QUIT_MODE = "q";
    public static final String PLAIN_MODE = "p";
    public static final String RECURSIVE_MODE = "r";

    public String mode;
    public Integer index;


    public FibonacciFactory(String input) {
        Matcher matcher = PATTERN.matcher(input);

        if (input.equals(QUIT_MODE)) {
            this.mode = QUIT_MODE;
        } else if (matcher.find()) {
            this.mode = matcher.group(1);
            this.index = new Integer(matcher.group(2));
        }
    }

    public Fibonacci findProperFibonacci() {
        switch (mode) {
            case PLAIN_MODE:
                return new PlainFibonacci();
            case RECURSIVE_MODE:
                return new RecursiveFibonacci();
            default:
                return null;
        }
    }

}
