import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = largestElement(nums, n);
        System.out.println(ans);
    }
    // approach 1 : brute force(Sorting)
    public static int largestElement(int[] nums, int n){
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
    
    // TC: O(n log n), SC:O(log n)
    
    // approach 2: optimal
   public static int largestElement(int[] nums, int n){
       int max = 0;
       for(int i = 0; i < n; i++){
           if(nums[i] > max){
               max = nums[i];
           }
       }
       return max;
   }
}
// TC:O(n), SC:O(1)
