public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64,25,12,22,11};
        int n = arr.length;
        selectionSort(arr,n);
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
    static void selectionSort(int[] arr, int n){
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
