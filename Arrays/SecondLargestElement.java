public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {8,8,7,6,5};
        int n = nums.length;
        int result = secondLargestElement(nums, n);
        System.out.print(result);
    }
    public static int secondLargestElement(int[] nums, int n){
        int largest = 0;
        int second_largest = nums[0];
        for(int i = 0; i < n; i++){
            if(nums[i] > largest){
                second_largest = largest;
                largest = nums[i];
            }else if(nums[i] < largest && nums[i] > second_largest){
                second_largest = nums[i];
            }
        }
        return second_largest;
    }
}
// TC:O(n), SC:O(1)
