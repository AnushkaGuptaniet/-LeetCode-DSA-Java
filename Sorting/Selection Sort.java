public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7,4,1,5,3};
        selectionSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
    public static void selectionSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j ;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}

// optimized version (avoid unnecessary swaps) 
if(minIndex != i){
int temp = nums[i];
nums[i]=nums[minIndex];
nums[minIndex]=temp;
}
// TC: O(n^2) for all cases, SC: O(1)

