
//Leetcode 1672. Richest Customer Wealth
//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestCustomer {
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int sum =0;
            for(int p: i){
                sum += p;
            }
            if(ans<sum) ans=sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,4}, {3,4,5}};
        System.out.println(maximumWealth(arr));
    }
}
