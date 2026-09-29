class Solution {
    public String removeDuplicates(String s) 
    {
     Stack<Character> stack = new Stack<>();
     StringBuilder string = new StringBuilder();

     for(char i : s.toCharArray())
     {
     if(!stack.isEmpty() && stack.peek() == i) stack.pop();
     else stack.push(i);
     }
     for(int i=0 ; i<= stack.size()-1 ; i++)

     {
        string.append(stack.get(i));

     }

     return string.toString();












    }
}