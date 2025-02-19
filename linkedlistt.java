class  LinkedList {
  Node head ;

  LinkedList(){
    this.head = null ;
  }

  public void insert(int data){
    if(this.head == null){
        this.head = new Node(data) ;
    }
    else{
        Node cur = head ;
        while(cur.next != null){
          cur= cur.next;
        }
        cur.next = new Node(data);
    }
  }
  public void insertatEnd(int x){
    if(head == null){
      head= new Node (x);
      display();
  }
  Node a = head;
  while (a.next != null){
      a = a.next;
  }
  a.next = new Node(x);
    display();
}
  public void display(){
    if(head == null){
        System.out.println("Linked list is empty");
        return ;
    }
    Node cur = head ;
    while(cur != null){
        System.out.print(cur.data + "->");
        cur = cur.next ;
    }
  }

  public void reverse (){
    Node pre = null ;
    Node cur = head ;
    
    while (cur != null) {
        Node nextNode = cur.next ;
        cur.next = pre ;
        pre = cur ;
        cur = nextNode ;                
    }
    head = pre ;
    System.out.println("Reversed LinkedList is :");
    display();
  }

  public int size(){
  public int size(){ // finding length of LInkedlist
    Node cur = head ;
    int size = 0 ;
    while (cur != null) {
        size+=1;
        cur = cur.next ;
    }
    return size ;
  }
}

 class Node { 
    int data ;
    Node next;
    Node(int data , Node node){
        this.data = data ;
        this.next = node ;
    }
    Node(int data){
        this.data = data ;
        this.next = null ;
    }
 }



public class linkedlistt {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        list.insert(20);
        list.insert(80);
        list.display();
        System.out.println();
        list.reverse();
        list.insertatEnd(4);
    }
}
