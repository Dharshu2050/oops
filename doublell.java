class Node{
    int data;
    Node next;
    Node prev;


    public Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}

class doublelist{
    Node head=null;
    Node temp=head;
    static int size=0;
    void insert_end(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }temp.next=node;
            node.prev=temp;
        }
size++;
    }

    void reverse(){
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    void insert_first(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }

    void insert_index(int d,int index){
        if(index==0){
            insert_first(d);
        }
        else if(index>=size){
            insert_end(d);
        }
        else{
            int i=0;
            Node temp=head;
            Node node=new Node(d);
            while (i<index) {
                i++;
                temp=temp.next;
                Node next=temp.next;
                temp.next.prev=node;
                temp.next=node;
                node.prev=temp;
               
            } size++;
        }
    }

    void delete_first(){
        if(head!=null){
            head.next.prev=null;
            Node temp=head.next;
            head.next=null;
            head=temp;
        }size--;
    }
    void display(){
        Node temp=head;
        while (temp!=null) {
            System.err.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
        size++;
    } 

    
    
    
}


public class doublell {
    public static void main(String[] args) {
        doublelist s=new doublelist();
        s.insert_end(10);
        s.insert_end(20);
        s.insert_end(30);
        s.insert_end(40);
        s.display();
        s.reverse();
        s.insert_first(50);
        s.display();
        s.insert_index(60, 3);
        s.display();
        s.delete_first();
        s.display();

    }
}
