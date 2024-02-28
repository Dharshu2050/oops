class Node{
    int data;
    Node next;

    public Node(int d){
        data=d;
        next=null;
       
    }
}

class linkedlist{
    static int size=0;
    Node head=null;
    void insert_end(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }temp.next=node;

        }size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
   
}


public class singlell {
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
        obj.insert_end(10);
        obj.insert_end(20);
        obj.insert_end(30);
        obj.display();
    }
}
