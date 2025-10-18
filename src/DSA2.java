import java.util.Scanner;

public class DSA2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String[] arr = new String[num];

        for (int i = 0; i < num; i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1) {
                    stringBuilder.append('*');
                }
                else {
                    if (j == 0 || j == num - 1) {
                        stringBuilder.append('*');
                    } else {
                        stringBuilder.append(' ');
                    }
                }
            }
            arr[i] = stringBuilder.toString();
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }
}

