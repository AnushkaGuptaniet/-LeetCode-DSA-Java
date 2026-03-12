//Approach 1:- Two Traversals (Brute Force)
public class Solution {
    public ListNode findNthEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        ListNode temp = head;
        for(int i = 0; i < m; i++){
            temp = temp.next;
        }
        return temp;
    }
}







//Approach 2: - Single Traversal (Two Pointer)
public class Solution {
    public ListNode findNthEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

TC:- O(n)
