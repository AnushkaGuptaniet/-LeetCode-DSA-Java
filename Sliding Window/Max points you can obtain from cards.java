class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        
        for(int x : cardPoints) total += x;
        
        if(k == n) return total;
        
        int window = 0;
        int size = n - k;
        
        for(int i = 0; i < size; i++) window += cardPoints[i];
        
        int minSum = window;
        
        for(int i = size; i < n; i++){
            window += cardPoints[i];
            window -= cardPoints[i - size];
            minSum = Math.min(minSum, window);
        }
        
        return total - minSum;
    }
}
