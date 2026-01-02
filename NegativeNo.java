
//1351. Count Negative Numbers in a Sorted Matrix
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=daily-question&envId=2026-01-01

public class NegativeNo {
    public static void main(String[] args) {
        int [][] arr= {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
      static int countNegatives(int[][] grid) {
        int count=0;
        for(int[] row: grid){
            for(int col : row){
                if(col < 0) count++;
            }
        }
        return count;
    }
//as it is sorted in non-increasing order
    static int countNegatives2(int [][] grid){
         int count=0;
        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[0].length; col++){
                if(grid[row][col] < 0) {
                    //as it is sorted in non-increasing order
                    count = count + (grid[0].length -col);
                    break;
                }
            }
        }
        return count;
    }
}
