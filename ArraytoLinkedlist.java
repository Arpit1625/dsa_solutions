public class ArraytoLinkedlist {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        ArrtoLL al = new ArrtoLL();
        Node b = al.constructLL(arr);
        ArraytoLinkedlist.display(b);
        Node c = al.insertAtEnd(b,10);
        ArraytoLinkedlist.display(c);
    }
    static void display(Node head){
        if(head == null){
            System.out.println("Linked list is empty");
            return ;
        }
        Node cur = head ;
        while(cur != null){
            System.out.print(cur.data + "->");
            cur = cur.next ;
        }
        System.out.println();
    }
}
class Node{
    int data;
    Node next;
    Node(int data , Node node){
        this.data = data;
        this.next = node;
    }
    Node (int data){
        this.data = data;
        this.next = null;
    }
}
class ArrtoLL{
    Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node ptr = head;
        for(int i = 1; i< arr.length ; i++){
            Node temp  = new Node(arr[i]);
            ptr.next = temp;
            ptr = temp;
        }
        return head;
    }
    Node insertAtEnd(Node head, int x) {
        if(head == null){
            head = new Node (x);
            return head;
        }
        Node a = head;
        while (a.next != null){
            a = a.next;
        }
        a.next = new Node(x);
        return head;
     }
}