import java.util.*; //importing the stack class

public class MinStack {
    public static final int CAPACITY = 1000; 
    private int capacity;                    
    private Object S[];                       
    private int top = -1;
 
    public MinStack(){
        Stack<Integer> minStack = new Stack<>();
    }

    public int size() {          
        return (top + 1);
    }

    public void push(int val){
        S[++top] = val;
    }

    public void pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        top--;
    }

    public void top(){
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