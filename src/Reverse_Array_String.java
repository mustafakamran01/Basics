import java.util.Scanner;

public class Reverse_Array_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of strings you want to give: ");
        int length = scanner.nextInt();

        String[] str = new String[length];

        for(int i = 0; i < length; i++){
            System.out.println("Enter " + (i+1) + " string");
            str[i] = scanner.next();
        }

    }
}
