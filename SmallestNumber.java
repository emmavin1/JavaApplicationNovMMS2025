public class SmallestNumber{

    // Method to find the smallest number
    public static int findSmallest(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        int c = 20;

        System.out.println("The smallest number is: " + findSmallest(a, b, c));
    }
}