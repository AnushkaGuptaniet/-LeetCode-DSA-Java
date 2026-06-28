import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {8,8,7,6,5};
        int n = nums.length;
        int result = secondLargestElement(nums, n);
        System.out.print(result);
    }
    // Approach 1 : brute force (Sorting)
   public static int secondLargestElement(int[] nums, int n){
       Arrays.sort(nums);
       int largest = nums[nums.length - 1];
       for(int i = nums.length - 2; i >= 0; i--){
           if(nums[i] != largest){
               return nums[i];
           }
       }
       return -1;
   }
    // TC: O(n log n), SC:O(log n)


    //Approach 2 : Optimal but 2 traversals
   public static int secondLargestElement(int[] nums, int n){
       int largest = nums[0];
       for(int i = 0; i < n; i++){
           if(nums[i] > largest){
               largest = nums[i];
           }
       }
       int secondLargest = -1;
       for(int i = 0; i < n; i++){
           if(nums[i] != largest && nums[i] > secondLargest){
               secondLargest = nums[i];
           }
       }
       return secondLargest;
   }
    // TC: O(n), SC:O(1)


    //Approach 3: optimal with one traversal
    public static int secondLargestElement(int[] nums, int n){
        int largest = nums[0];
        int secondLargest = -1;
        if(n < 2){
            return -1;
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] != largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    // TC:O(n), SC:O(1)
}
