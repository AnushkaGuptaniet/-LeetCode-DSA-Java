public class InsertionAtHeadLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        Node head = a;
        int X = 7;
        head = insertAtHead(head,X);
        displayList(head);
    }
    public static Node insertAtHead(Node head, int X){
        Node temp = new Node(X);
        if(head == null){
            temp = head;
        }else{
            temp.next = head;
            head = temp;
        }
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
