import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter value for n2: ");
        int n2 = input.nextInt();
        System.out.println(gcd(n1, n2));

    }

    // Approach 1: Brute Force Approach
//    public static int gcd(int n1, int n2){
//        int ans = 1;
//        for(int i = 1; i < Math.min(n1, n2); i++){
//            if(n1 % i == 0 && n2 % i == 0){
//                ans = i;
//            }
//        }
//        return ans;
//    }
    
    //TC, SC:-  O(n)


    // Approach 2 : Better Approach
//    public static int gcd(int n1, int n2){
//        int ans = 1;
//        for(int i = Math.min(n1, n2); i >= 1; i++){
//            if(n1 % i == 0 & n2 % i == 0){
//                return i;
//            }
//        }
//        return 1;
//    }
    
    // TC, SC : O(n)


    // Approach 3 : Optimal Approach (Euclidean Algorithm)
    public static int gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    
    // TC: O(log n), SC: O(1)

}
