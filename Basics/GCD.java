import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n1 = ");
        int n1 = sc.nextInt();
        System.out.print("n2 = ");
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
//    public static int gcd(int n1, int n2){        // brute force approach
//        int ans = 1;
//        for(int i = 1; i <= Math.min(n1, n2); i++){
//            if(n1 % i == 0 && n2 % i == 0){
//                ans = i;
//            }
//        }
//        return ans;
//    }
    // TC:- O(n), SC:- O(n)

    public static int gcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    // TC:- O(n), SC:- O(1)

}
