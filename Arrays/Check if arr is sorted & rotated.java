//Approach :- single traversal
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                count++;
            }
        }
        return count<=1;
    }
    
}

TC:- O(n), SC:- O(1)





//Approach 2:- brute force approach :
class Solution{
    public boolean check(int[] nums){
        int n = nums.length;
        for(int r = 0 ; r < n; r++){
            boolean sorted = true;
            for(int i = 1 ; i < n; i++){
                int prev = nums[(r+i-1+n)%n];
                int curr = nums[(r+i)%n];
                if(prev > curr){
                    sorted = false;
                    break;
                }
            }
            if(sorted){
                return true;
            }

        }
        return false;
    }
}

TC: O(n^2), SC:- O(n)
