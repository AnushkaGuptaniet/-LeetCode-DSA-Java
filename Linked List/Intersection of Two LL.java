/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // Approach 1 : - Brute force approach 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        while(tempA != null){
            ListNode tempB = headB;
            while(tempB != null){
                if(tempA == tempB){
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }
        return  null;
    }
}

// TC: O(mn), SC: O(1), too slow

 // Approach 2 : - Length method 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        int lengthA = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        ListNode tempB = headB;
        int lengthB = 0;
        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(lengthA > lengthB){
            int steps = lengthA - lengthB;
            for(int i = 1; i <= steps; i++){
                tempA = tempA.next;
            }
        }
        if(lengthB > lengthA){
            int steps = lengthB - lengthA;
            for(int i = 1; i <= steps; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}

// TC: O(m+n), SC: O(1)


 // Approach 3 : - Two Pointer 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != tempB){
            if(tempA == null){
                tempA = headB;
            }else{
                tempA = tempA.next;
            }
            if(tempB == null){
                tempB = headA;
            }else{
                tempB = tempB.next;
            }
        }
        return tempA;
    }
}

// TC: O(m+n), SC: O(1)

