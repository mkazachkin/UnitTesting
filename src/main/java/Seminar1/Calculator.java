package Seminar1;

public class Calculator {
    public static double calculation(double firstOperand, double secondOperand, char operator) {
        double result;

        switch (operator) {
            case '+' -> result = firstOperand + secondOperand;
            case '-' -> result = firstOperand - secondOperand;
            case '*' -> result = firstOperand * secondOperand;
            case '/' -> {
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero is not possible");
                } else {
                    result = firstOperand / secondOperand;
                }
            }
            case '^' -> result = Math.pow(firstOperand, secondOperand);
            case 'v' -> {
                //Извлечение корня
                if (((secondOperand % 2 == 0) && (firstOperand < 0)) || (secondOperand == 0)) {
                    throw new ArithmeticException("Calculating the root is not possible");
                } else {
                    result = Math.pow(firstOperand, 1 / secondOperand);
                }
            }
            case '%' -> {
                //Расчет суммы со скидкой
                if ((secondOperand <= 0) || (secondOperand > 100) || (firstOperand <= 0)) {
                    throw new ArithmeticException("Calculating the discount is not possible");
                } else {
                    result = firstOperand * (100 - secondOperand) / 100;
                }
            }
            default -> throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
}