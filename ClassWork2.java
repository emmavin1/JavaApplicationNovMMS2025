public class ClassWork2{

    // Method to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {

        double a = 10;
        double b = 20;
        double c = 30;

        double average = calculateAverage(a, b, c);

        System.out.println("The average is: " + average);
    }
}