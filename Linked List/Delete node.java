public class Problem237 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        Node head = a;
        Node node = b;
        displayList(deleteNode(node, head));
    }
    public static Node deleteNode(Node node, Node head){
        node.data = node.next.data;
        node.next = node.next.next;
        return head;
    }
    public static void displayList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

// TC:- O(1), SC:- O(1)
