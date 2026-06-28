public class bubbleSort {
   public static void main(String[] args) {
       int[] nums = { 7,4,1,5,3};
       bubbleSort(nums);
       for(int i = 0; i < nums.length; i++){
           System.out.print(nums[i] + " ");
       }
   }
   public static void bubbleSort(int[] nums){
       int n = nums.length;
       for(int i = 0; i < n-1 ; i++){
           for(int j = 0; j < n-i-1; j++){
               if(nums[j] > nums[j+1]){
                   int temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;
               }
           }
       }
   }
}

// optimized version
public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = { 7,4,1,5,3};
        bubbleSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void bubbleSort(int[] nums){
        int n = nums.length;
        for(int i = 0; i < n-1 ; i++){
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
// TC: O(n) for best case , O(n^2) for av and worst case , SC:O(1)
