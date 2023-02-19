import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum is: " + sum);
    }
}
