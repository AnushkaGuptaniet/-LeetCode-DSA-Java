public class LinkedList2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

//    public static int length(Node head){
//        Node temp = head;
//        int count = 0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }

    //Alternate approach
    public static int length(Node head){
        if(head == null){
            return 0;
        }
        return 1 + length(head.next);
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        Node a = new Node(5);
        Node b = new Node(10);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(25);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(ll.length(a));
    }
}


