class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        Set<Integer> remov=new HashSet<>();
        for (int itr=0;itr<s.length();itr++){
            char c=s.charAt(itr);
            if(Character.isAlphabetic(c))
               continue;
            if(c=='(') stack.push(itr);
            else{
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                     stack.pop();
                  else stack.push(itr);   
            }   
        }
        while (!stack.isEmpty()) {
            remov.add(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        for (int itr = 0; itr < s.length(); itr++) {
            if (!remov.contains(itr)) {
                result.append(s.charAt(itr));
            }
        }
        return result.toString();
    }
}