public class ArraytoLinkedlist {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        ArrtoLL al = new ArrtoLL();
        Node b = al.constructLL(arr);
        while(b != null){
            System.out.print(b.data + "->");
            b= b.next;
        }
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
}