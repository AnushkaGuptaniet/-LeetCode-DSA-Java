// Approach 1: brute force approach
// we will convert the integer to string then reverse the string and then compare
// TC : O(N), SC : O(N)



// Approach 2: optimal maths approach
import java.util.Scanner;
public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int rev = 0;
        while(x > rev){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);
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
