// Approach 1: Brute force approach
// We first convert the integer no to string and then reverse the string and then again convert the string to integer
// TC : = 0(n), SC : O(n) ....takes extra space in converting string and all

//Approach 2: Optimal Mathematical Approach

import java.util.Scanner;
public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        int ans = reverse(x);
        System.out.println(ans);
    }
    public static int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10){
                return 0 ;
            }
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}
// TC : O(log n), SC : O(1)
