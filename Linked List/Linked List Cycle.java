import java.util.HashSet;

public class Prob141 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        Node head = a;
        int pos = 1;
        System.out.println(hasCycle(head));
    }

    // brute force
//    public static boolean hasCycle(Node head){
//        Node temp = head;
//        HashSet<Node> set = new HashSet<>();
//        while(temp!=null){
//            if(set.contains(temp)){
//                return true;
//            }
//            else{
//                set.add(temp);
//                temp = temp.next;
//            }
//        }
//        return false;
//    }

    // TC: O(N), SC: O(n)


    // optimized approach
    public static boolean hasCycle(Node head){
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    // TC: O(N), SC: O(1)
}
