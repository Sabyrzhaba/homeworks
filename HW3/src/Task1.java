import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуту в градусах по Цельсия: ");
        double temperatureCelsius = scanner.nextDouble();

        final double COEFFICIENT1 = 1.8;
        final int COEFFICIENT2 = 32;

        double temperatureFahrenheit = temperatureCelsius * COEFFICIENT1 + COEFFICIENT2;
        System.out.println("Результат преобразования в градусах по Фарингейту: " + temperatureFahrenheit);
    }
}
