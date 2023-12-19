import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Podaj 20 liczb:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimalna liczba: " + min);
        System.out.println("Maksymalna liczba: " + max);

        System.out.println("Liczby podzielne przez 2:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Liczby niepodzielne przez 2:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}