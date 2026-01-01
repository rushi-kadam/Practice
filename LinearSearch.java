public class LinearSearch {
    static boolean linearSearch1(int arr[], int target)
    {
        for(int element: arr){
            if(element == target) return true;
        }
        return false;

    }
    //Returning index of element
     static int linearSearch2(int arr[], int target)
    {
        for(int index=0; index<arr.length; index++){
            if(arr[index] == target) return index;
        }
        return -1;
    }

    // To search in string as string is an array of characters
    static boolean linearSearch3(String str, char target){
        if(str.length()==0) return false;
        for(char ch: str.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
        String name = "Rushikesh";
        boolean found = linearSearch3(name,'f');
        System.out.println(found);    }
}
