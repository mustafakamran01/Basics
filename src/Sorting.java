public class Sorting {
    public static void main(String[] args) {

        int[] arr = {23, 67, 4, 55, 33, 78, 1000, 7, 100, 12, 44, 200};

        for(int i = 0; i < arr.length -1; i++){
            for(int j = i; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
