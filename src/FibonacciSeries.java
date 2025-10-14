import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the fibonacci series");
        int length = scanner.nextInt();

        if(length < 3){
            System.out.println("Enter number greater than 2");
        } else {
            int num1 = 0;
            int num2 = 1;

            System.out.print(num1 + ", ");
            System.out.print(num2 + ", ");

            for(int i = 2; i < length; i++){
                int num3 = num1 + num2;

                if(i == length - 1){
                    System.out.print(num3);
                }else {
                    System.out.print(num3 + ", ");
                }

                num1 = num2;
                num2 = num3;
            }
        }
    }
}
