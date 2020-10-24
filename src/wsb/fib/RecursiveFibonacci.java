package wsb.fib;

public class RecursiveFibonacci implements Fibonacci {

    @Override
    public long findElement(int index) {
        if (index <= 0) {
            return 0;
        }

        if (index <= 2) {
            return 1;
        }

        return findElement(index - 1) + findElement(index - 2);
    }
}
