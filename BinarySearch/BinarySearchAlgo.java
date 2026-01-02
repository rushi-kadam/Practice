package BinarySearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(arr,target));
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
