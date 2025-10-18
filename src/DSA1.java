import java.util.Scanner;

public class DSA1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            StringBuilder stringBuilder = new StringBuilder(); // move inside the loop
            for (int j = 0; j < num; j++) {
                stringBuilder.append('*');
            }
            arr[i] = stringBuilder.toString(); // convert to String
        }

        // Print the pattern to verify
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
