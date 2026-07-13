import java.util.Scanner;

public class SumOfTenNumbers{

    // Method to calculate the sum of ten numbers
    public static int calculateSum(){
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int total = calculateSum();
        System.out.println("The sum of the ten numbers is: " + total);
    }
}