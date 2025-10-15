import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int fact = 1;

        // Checking if input is greater than 0 or not
        if(num <= 0){
            System.out.println("Please give number more than O");
        } else{
            for(int i = num; i > 0; i--){
                fact *= i;
            }

            System.out.println("Factorial: " + fact);
        }
    }
}
