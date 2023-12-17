public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver() {
        int result = 0;
        int operand1 = 5;
        int operand2 = 3;
        char operation = '+';

        if (operation == '+') {
            result = add(operand1, operand2);
        } else if (operation == '-') {
            result = dif(operand1, operand2);
        } else if (operation == '*') {
            result = times(operand1, operand2);
        } else if (operation == '/') {
            result = div(operand1, operand2);
        }
        return result;
    }
}
