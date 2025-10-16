import java.util.Scanner;

public class Sum_Of_Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking length of the series
        System.out.println("Enter the length of fibonacci series");
        int length = scanner.nextInt();

        // Initializing 1st and 2nd element of series
        int num1 = 0;
        int num2 = 1;

        // Printing 1st and 2nd element of series
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        // Adding 1st and 2nd element of series
        int sum = num1 + num2;

        // Printing and adding series up to given length
        for(int i = 2; i < length; i++){
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            sum += num3;
            num1 = num2;
            num2 = num3;

            if (i == length - 1){
                System.out.println();
            }
        }
        // Printing the sum of series
        System.out.println("Sum of fibonacci series: " + sum);
    }
}
