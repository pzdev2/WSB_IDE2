package wsb.fib;

public class PlainFibonacci implements Fibonacci {

    @Override
    public long findElement(int index) {
        if (index <= 0) {
            return 0;
        }

        long a = 0, b = 1;
        for (int i = 0; i < index; i++) {
            a += b;
            b = a - b;
        }

        return a;
    }
}
