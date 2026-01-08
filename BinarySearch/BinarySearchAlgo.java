package BinarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 0;
       // System.out.println(search(arr,target));

       System.out.println(mySqrt(8));


        char[] temp={'c', 'f', 'j'};
       // char ans= nextGreatestLetter(temp, 'c');
       // System.out.println(ans);
    }

         static int mySqrt(int x) {
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

       static char nextGreatestLetter(char[] letters, char target)
        {
            int start =0;
            int end =letters.length-1;
                while(start<=end){
                    int mid= start+(end-start)/2;
                    if(letters[mid]<target) start=mid+1;
                    else end=mid-1;
                }
            if(start==letters.length) return letters[0];
            return letters[start];
        }

    static int search(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            // find mid
            int mid= start +(end-start)/2;

            //if in ascending order
            if(arr[mid] > target) end=mid-1;
            else if (arr[mid] < target) start=mid+1;
            else if(arr[mid]==target) return mid;
        }
        return -1;
    }
}
