class Stack {
    static int top = 0, size = 6;
    int[] st = new int[size];

    boolean isFull() {
        return top == size;

    }

    boolean isEmpty(){
        return top==0;
    }
        int pop(){

            int val= -1;
            if(isEmpty()){
                System.out.println("stack is empty");
            }
            else{
                top--;
                val =st[top];
                return val;

            }
        }
    
    
    void push(int d) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            st[top] = d;
            top++;
        }
    }

    void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(st[i]);
        }
    }
}

public class stackarray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.display();
        st.pop();
        st.display();
    }
}