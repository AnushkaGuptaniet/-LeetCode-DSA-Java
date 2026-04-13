import java.util.Scanner;
public class CountDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int ans = countDigit(n);
        System.out.println(ans);
    }
    public static int countDigit(int n){
        if ( n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
}



//Time complexity = O(log10n), Space = O(1)
