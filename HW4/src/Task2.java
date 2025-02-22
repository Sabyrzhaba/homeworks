import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double result;
            
            while (true) {
                System.out.print("Введите первое число: ");
                double firstNumber = scanner.nextDouble();

                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();

                System.out.print("Выберите операцию (сложение[0] / вычитание[1] / деление[2]): ");
                int operator = scanner.nextInt();

                switch (operator) {
                    case 0 -> result = add(firstNumber, secondNumber);
                    case 1 -> result = subtract(firstNumber, secondNumber);
                    case 2 -> {
                        if (secondNumber != 0) {
                            result = divide(firstNumber, secondNumber);
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                            return;
                        }
                    }
                    default -> {
                        System.out.println("Ошибка: неверный выбор операции!");
                        return;
                    }
                }

                System.out.println("Результат: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено нечисловое значение!");
        }
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль!");
        }
        return a / b;
    }
}
