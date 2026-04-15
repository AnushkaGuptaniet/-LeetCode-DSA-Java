public class Prob876 {


    public static Node middleNode(Node head) {            // brute force
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i < count / 2; i++){
            temp = temp.next;
        }
        return temp;
    }

    // TC:O(n), SC:_O(1)


//    public static Node middleNode(Node head) {          // optimal - two pointer
//        Node slow = head;
//        Node fast = head;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
// TC:O(n), SC:_O(1)


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node head = a;
        head = middleNode(head);
        displayList(head);
    }
    public static void displayList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }



}
