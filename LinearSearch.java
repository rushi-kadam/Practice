public class LinearSearch {
    static boolean linearSearch1(int arr[], int target)
    {
        for(int element: arr){
            if(element == target) return true;
        }
        return false;

    }
     static int linearSearch2(int arr[], int target)
    {
        for(int index=0; index<arr.length; index++){
            if(arr[index] == target) return index;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
        int found = linearSearch2(numbers,3);
        System.out.println(found);    }
}
