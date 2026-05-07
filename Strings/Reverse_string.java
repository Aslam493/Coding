https://leetcode.com/problems/reverse-words-in-a-string/
class Solution {
    public String reverseWords(String s) {
       return fun(s); 
    }
    public static String fun(String s){
        //trimming
        int start=0;
        int end=s.length()-1;
        Stack<String> st=new Stack<>();
         s=s.trim();
         //tokenize
         
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
               st.push(s.substring(start,i));
                start=i;
                while(s.charAt(start)==' '){
                    start+=1;
                }
                i=start;
            }
         }
         st.add(s.substring(start,s.length()));
         String ans="";
         while(!st.isEmpty()){
            ans+=st.pop();
            if(!st.isEmpty())
            ans+=' ';
         }

         return ans;
    }
}
