import java.util.Scanner;

public class SumEvenOrOdd {

    // Method to accept five numbers, calculate the sum,
    // and check if the sum is even or odd.
    public static void checkSumEvenOrOdd() {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter five numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = input.nextInt();
            sum += number;
        }

        System.out.println("Sum = " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is Even.");
        } else {
            System.out.println("The sum is Odd.");
        }

        input.close();
    }

    public static void main(String[] args) {
        checkSumEvenOrOdd();
    }
}