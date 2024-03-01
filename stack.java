
class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
class stacklinkedlist
{
    Node top=null;
    static int size=0;
    void push(int d){
        Node  node=new Node(d);
        if(top==null){
            top=node;}
            else{
                node.next=top;
                top=node;
            }
            size++;
    }
    
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        top=top.next;
        size--;
        return val;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        return val;
    }
           

void display(){
    Node temp=top;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println();
}
        
}    




public class stack
{
    public static void main(String[] args) {
	    stacklinkedlist st=new stacklinkedlist();
	    st.push(10);
	    st.push(20);
	    st.push(40);
	     st.push(50);
	      st.push(60);
	    st.display();
	    System.out.println("poped values is:"+st.pop());
	    System.out.println(st.peek());
    }
}
