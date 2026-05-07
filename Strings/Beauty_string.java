https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
class Solution {
    public int beautySum(String s) {
        return fun(s);
    }
    public static int fun(String s){
        int ans=0;
       for(int i=0;i<s.length();i++){
          HashMap<Character,Integer> map=new HashMap<>();
         for(int j=i;j<s.length();j++){
             char c=s.charAt(j);
             map.put(c,map.getOrDefault(c,0)+1);
             int max=0;
             int min=Integer.MAX_VALUE;
             for(char c1:map.keySet()){
                max=Math.max(max,map.get(c1));
                min=Math.min(min,map.get(c1));
             }
            ans+=max-min;
         }
       }
       return ans;
    }
    
}
