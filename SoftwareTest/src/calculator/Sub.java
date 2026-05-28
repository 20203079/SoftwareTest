package calculator;

public class Sub implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}