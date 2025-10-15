import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;

        if(num < 0){
            System.out.println("Given number is negative");
        } else if (num <= 3) {
            System.out.println("Please give number more than 3");
        } else {

            for (int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    count++;
                    break;
                }
            }

            if (count != 0){
                System.out.println(num + " is not prime");
            } else {
                System.out.println(num + " is prime");
            }
        }
    }
}
