
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

package BinarySearch;

public class searchRange {
    public int[] searchRange(int[] arr, int target) {
      
        int[] res = {-1,-1};
       res[0]=middle(arr,target,true);
        res[1]=middle(arr,target,false);

       return res;
    }
    public int middle(int[] arr, int target, boolean check ){
         int start=0;
        int end= arr.length-1;
        int ans=-1;
        
        while(start<=end){
            // find mid
            int mid= start +(end-start)/2;

            if(arr[mid] > target) end=mid-1;
            else if (arr[mid] < target) start=mid+1;
            else if(arr[mid]==target) {
                ans = mid;
                if (check) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
                
            }
        }
        return ans;
    }
}
