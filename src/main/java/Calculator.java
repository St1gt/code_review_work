public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        switch (b) {
            case 0:
                throw new ArithmeticException("На ноль делить нельзя!!!");
            default:
                return a / b;
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

        switch (operation) {
            case '+':
                result = add(operand1, operand2);
                break;
            case '-':
                result = dif(operand1, operand2);
                break;
            case '*':
                result = times(operand1, operand2);
                break;
            case '/':
                result = div(operand1, operand2);
                break;
        }

        return result;
    }
}