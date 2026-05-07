https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        return fun(val,wt,capacity);
    }
    public static double fun(int[] val,int[] weight,int total_weight){
        PriorityQueue<tri>pq =new PriorityQueue<>((a,b)->Double.compare(b.profit,a.profit));
        
        double total=0.0;
        for(int i=0;i<val.length;i++){
           
            pq.add(new tri(val[i],weight[i],(double)val[i]/weight[i]));
        }
        while(total_weight>0&&!pq.isEmpty()){
            tri temp=pq.poll();
            if(total_weight-temp.weight>=0){
                total+=temp.val;
                total_weight=total_weight-temp.weight;
            }
            else{
                total+=total_weight*temp.profit;
                total_weight-=total_weight;
            }
          
        }
          return total;
    }
    static class tri{
        int val;
        int weight;
        double profit;
        tri(int val,int weight,double profit){
            this.val=val;
            this.weight=weight;
            this.profit=profit;
        }
    }
}
