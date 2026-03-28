// Approach 1: brute force approach
// we will convert the integer to string then reverse the string and then compare
// TC : O(N), SC : O(N)



// Approach 2: optimal maths approach
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int x = input.nextInt();
        System.out.println(checkPalindrome(x));
    }
    public static boolean checkPalindrome(int x){
        if (x < 0){
            return false;
        }
        int original = x;
        int rev = 0;
        while(x!=0){
            int digit = x % 10;
            rev = rev * 10 + digit ;
            x = x/ 10;
        }
        return original == rev;
    }
}

// TC : O(log n), SC: O(1)



// Approach 3: half reverse approach 

class Solution {
    public static boolean isPalindrome(int x){
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int rev = 0;
        while(x > rev){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return (x == rev) || (x == rev / 10);
    }
}
