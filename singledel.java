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
    void insert_first(int d){
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
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
            int i=1;
            Node temp=head;
            Node node=new Node(d);
            while (i<index&&temp.next!=null) {
                i++;
                temp=temp.next;
                
            }node.next=temp.next;
            temp.next=node;


        }size++;
    }
    void delete_first(){
        if(head!=null){
            head=head.next;
            size--;
        }
    }
    void delete_last(){
        if(head!=null){
            if(head.next==null){
                delete_first();
            }
            else{
                Node temp=head;
                while(temp.next!=null&&temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
                size--;
            }
        }
      
    }
    
    void delete_index(int index){
        if(index<size){
            if(index==0){
                delete_first();
            }else if(index==size-1){
                delete_last();
            }else{
                Node temp=head;
                int i=1;
                while(i<index&&temp.next!=null){
                    i++;
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
    }


    /*void delete_first(){
        if(head!=null){
            head=head.next;
            size--;
        }
    }
    void delete_end(){
        if(head!=null){
            if(head.next==null){
                delete_first();
            }
            else
            {
                Node temp=head;
                while(temp.next!=null&&temp.next.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=null;
                size--;
            }
           
            
        }
    }
    void delete_index(int index){
        if(index<size){
            if(index==0){
                delete_first();
            }
            else if(index==size-1){
                delete_end();
            }
            else{
                Node temp=head;
                int i=1;
                while (i<index&&temp.next!=null) {
                    i++;
                    temp=temp.next;
                    
                }
                temp.next=temp.next;
                size--;

            }
        }

    }*/


    boolean Search(int key){
        Node temp=head;
        while (temp!=null) {
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
            
        }

        int frequency(int key){
            Node temp=head;
            int count=0;
            while(temp!=null){
                if(temp.data==key){
                    count++;
                }
                temp=temp.next;
            }return count;
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


public class singledel {
    public static void main(String[] args) {
        linkedlist obj=new linkedlist();
        obj.insert_end(10);
        obj.insert_end(20);
        obj.insert_end(30);
        obj.insert_first(40);
        obj.insert_index(50,3);
        obj.display();
        obj.delete_first();
        obj.display();
        obj.delete_index(2);
      
        
        obj.display();
        System.out.println(obj.Search(10));
        System.out.println(obj.frequency(10));
    }
}



