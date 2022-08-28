import java.util.*; //importing the stack class

public class MinStack {
    public static final int CAPACITY = 1000; //# default capacity of the stack
    private int capacity;                    // maximum capacity of the stack.
    private Object S[];                       // S holds the elements of the stack
    private int top = -1;                    // the top element of the stack.
 
    public MinStack(){
        Stack<Integer> minStack = new Stack<>();
    }

    public int size() {          //# Return the current stack size
        return (top + 1);
    }

    public void push(int val){
        S[++top] = val;
    }

    public void top(){
        //S[top];
        System.out.println("top element printed");
    }
    
    public int getMin(){
        return capacity;
    }
}

/**
 * MinStack object will be instantiated and called as such
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

