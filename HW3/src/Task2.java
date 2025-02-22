import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во рублей: ");
        int rubles = scanner.nextInt();

        System.out.print("Введите курс доллара: ");
        double dollarRate = scanner.nextDouble();

        System.out.print("Введите курс евро: ");
        double euroRate = scanner.nextDouble();

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.printf("Результат в долларах: %.2f%n", dollars);
        System.out.printf("Результат в евро: %.2f%n", euros);
    }
}
