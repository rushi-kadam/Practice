
//https://leetcode.com/problems/first-bad-version/description/
package BinarySearch;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class firstBadVersion {
      public int firstBadVersion(int n) {
         int start=1;
        while(start<n){
            // find mid
            int mid= start +(n-start)/2;
            boolean temp=isBadVersion(mid);

            //if it is bad send 
            if (temp) n=mid;
            else start= mid+1;
        }
        return start;
    }
}
