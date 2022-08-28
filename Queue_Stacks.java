import java.util.Queue;

class MyQueue {

    public static final int CAPACITY = 1000; //# default capacity of the stack
    private int capacity;                    // maximum capacity of the stack.
    private Object S[];                       // S holds the elements of the stack
    private int top = -1;                    // the top element of the stack.


    public void push(Object obj)  {  //# Push a new object on the stack
        if (size() == capacity)
           System.out.println("Stack is full");
        S[++top] = obj;
    }
    
    public boolean isEmpty() {   //# Return true iff the stack is empty
        return (top < 0);
    }


    public Object pop()  { //# Pop off the stack element
        Object elem;
        if (isEmpty())
            System.out.println("Stack is empty");
        elem = S[top];
        S[top--] = null;               //# Dereference S[top] and decrement top
        return elem;
    }

    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return (top < 0);
    }

    public int size() {          //# Return the current stack size
        return (top + 1);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */