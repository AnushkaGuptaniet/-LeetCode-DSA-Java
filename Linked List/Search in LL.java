/* Defination of ListNoode
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
*/


class Solution {
    public boolean searchKey(ListNode head, int key) {
         ListNode temp = head;
         boolean res = false;
         while(temp != null){
            if(temp.val == key){
                res = true;
                break;
            }else{
                temp = temp.next;
            }
         }
         return res;
    }
}
