class MinStack {

    Stack<Integer> main= new Stack<>();
    Stack<Integer> min= new Stack<>(); 

    public MinStack() {
        
    }
    
    public void push(int value) {
        main.push(value);
        if(min.isEmpty()){
            min.push(value);
        }
        else{
            int curr= min.peek();
            min.push(value<curr? value: curr);
        }
        
    }
    
    public void pop() {
         if(!min.isEmpty()){
            main.pop();
            min.pop();
        }
        
    }
    
    public int top() {
              return main.peek();
  
    }
    
    public int getMin() {
                return min.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */