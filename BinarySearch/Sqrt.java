package BinarySearch;

public class Sqrt {
      public int mySqrt(int x) {
         int start=1;
        int end= x;
        int ans=0;
        while(start<=end){
        
            int mid= start +(end-start)/2;
            int t=x/mid;
            if (mid <= t) {
                ans = mid;     // mid could be the answer, so we store it
                start = mid + 1; // look for a larger value
            } else {
                end = mid - 1;   // mid is too big
            }
        }
        return ans;
    }
}
