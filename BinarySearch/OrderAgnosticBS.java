package BinarySearch;

public class OrderAgnosticBS {
    
        public static void main(String[] args) {
       // int[] arr = {-1,0,3,5,9,12};
       int[] arr = {100,99,88,77,66,55};
        int target = 99;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        boolean is_asc=arr[start]< arr[end];
        while(start<=end){
            // find mid
            int mid= start +(end-start)/2;
            if(arr[mid]==target) return mid;

            if(is_asc){
                //if in ascending order
                if(arr[mid] > target) end=mid-1;
                else start=mid+1;
            }else{
                //if in descending order
                if(arr[mid] < target) end=mid-1;
                else start=mid+1;
            }
            
        }
        return -1;
    }
}
