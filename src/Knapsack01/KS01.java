package Knapsack01;

public class KS01 {
    public static void main(String[] args) {
        int[] wt={1,3,4,5};
        int[] price ={1,4,5,7};
        int cap=7;
        System.out.println(KnapsackRecursion(wt,price,0,cap));
    }
    public static int KnapsackRecursion(int[] wt,int[] price,int idx,int cap) {
        if (idx == wt.length || cap == 0) {
            return 0;
        }
        int exclude = KnapsackRecursion(wt, price, idx + 1, cap);
        int include = 0;
        if (cap >= wt[idx])
            include = KnapsackRecursion(wt, price, idx + 1, cap - wt[idx]) + price[idx];
        int ans = Math.max(exclude, include);
        return ans;
    }
}
