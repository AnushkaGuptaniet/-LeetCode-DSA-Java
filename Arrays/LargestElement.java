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
    public static int largestElement(int[] nums, int n){
        int largest = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
 // TC :O(n), SC:O(1)
