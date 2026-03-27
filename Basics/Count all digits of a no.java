import java.util.*;
public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        if(n == 0) return 1;   // edge case
        n = Math.abs(n);
        int count = 0;
        while(n>0){
            n = n / 10;
            count++;
        }
        return count;
    }
}



//Time complexity = O(log10n), Space = O(1)
