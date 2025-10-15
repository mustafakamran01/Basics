import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duplicate_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking input the size of array
        System.out.println("Enter the number of element you want to give: ");
        int length = scanner.nextInt();

        // Creating an empty array of given length
        int[] arr = new int[length];

        // Inserting values into array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = scanner.nextInt();
        }

        // Creating an empty list for storing elements
        List<Integer> arrList = new ArrayList<>();

        // Removing duplicates elements and storing into list
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1]){
                arrList.add(arr[i]);
            }
        }
        // Storing last element of array into list
        arrList.add(arr[arr.length - 1]);

        // Printing unique array
        System.out.println("Here is the sorted array: ");
        System.out.println(arrList);
    }
}
