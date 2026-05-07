https://leetcode.com/problems/assign-cookies/
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        return fun(g,s);
    }
    public static int  fun(int[] g,int[] s){
        int total=0;
        boolean[] assign=new boolean[s.length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]&&assign[j]==false){
                    assign[j]=true;
                    total++;
                    break;
                }
            }
        }
        return total;
    }
}
