import java.util.Scanner;

public class Sorting_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Here we are taking length of array
        System.out.println("Enter the number of elements you want to give: ");
        int length = scanner.nextInt();

        // Empty array with given length
        int[] arr = new int[length];

        // Inserting the values into array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = scanner.nextInt();
        }

        // Sorting array
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Here is the sorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}