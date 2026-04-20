import java.util.HashSet;

public class Prob142 {
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
        head = detectCycle(head);
        if(head != null){
            System.out.println("Cycle starts at node: " + head.data);
        } else {
            System.out.println("No cycle");
        }
    }

    // brute force
    public static Node detectCycle(Node head){
        Node temp = head;
        HashSet<Node> set = new HashSet<>();
        while(temp!=null){
            if(set.contains(temp)){
                return temp;
            }
            else{
                set.add(temp);
                temp = temp.next;
            }
        }
        return null;
    }

    // TC: O(N), SC: O(n)


    // optimized approach
//    public static Node detectCycle(Node head){
//        if(head == null){
//            return null;
//        }
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                Node temp = head;
//                while(temp != slow){
//                    temp = temp.next;
//                    slow = slow.next;
//                }
//                return temp;
//            }
//        }
//        return null;
//    }
    // TC: O(N), SC: O(1)


}
