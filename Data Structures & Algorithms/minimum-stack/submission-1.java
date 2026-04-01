class MinStack {

    Stack<Integer> stk, temp;

    public MinStack() {
        stk = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(temp.isEmpty() || val <= temp.peek())
            temp.push(val);
    }
    
    public void pop() {
        if(stk.isEmpty())
            return;
        int top = stk.pop();
        if(top == temp.peek())
            temp.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return temp.peek();
    }
}
