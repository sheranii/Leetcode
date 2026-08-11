class Solution {
    static boolean ischar(String s){
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")); 
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(ischar(tokens[i])){
                int op1= st.pop();
                int op2= st.pop();
                if(tokens[i].equals("+")){
                    st.push(op1+ op2);
                }
                else if(tokens[i].equals("-")){
                    st.push(op2-op1);
                }
                else if(tokens[i].equals("*")){
                    st.push(op2*op1);
                }
                else{
                    st.push(op2/op1);
                }
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
        
    }
}