class Node{
    int data;
    Node next;
    public Node(int d){
        data =d;
        next=null;
    }
}

class   Queue{
    Node front=null,rear=null;
    static int size=0;
    
    void enQueue(int d){
        Node node=new Node(d);
        if(front==null){
            front=node;
            rear=node;}
            else{
                rear.next=node;
                rear=rear.next;
            }
            size++;
    }
    
    boolean isEmpty(){
        return front==null;
    }
    
    int dequeue(){
        if(isEmpty()){
            return -1;
            
        }
        int val=front.data;
        front =front.next;
        size--;
        return val;
    }
    
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
            
        }System.out.println();
    }
}
            
        
    

public class queue
{
	public static void main(String[] args) {
		    Queue s=new Queue();
		    s.enQueue(10);
		    s.enQueue(20);
		    s.enQueue(30);
		    s.display();
		    System.out.println("remove"+s.dequeue());
	}
}

