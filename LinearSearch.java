import java.lang.reflect.Array;
import java.util.Arrays;

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

    // Leetcode -66. Plus One
    //
    static int[] plusOne(int[] digits) {
        for (int i =digits.length-1; i>=0; i--) {
            digits[i]= digits[i]+1;
            if(digits[i]>9){
                digits[i]= digits[i]%10;
                continue;
            }
            else break;
        }
         if (digits[0]==0){
            int lenght= digits.length +1;
            int []arr = new int[lenght];
            arr[0]=1;
            for (int i=1; i<lenght; i++ ){
                arr[i]=digits[i-1];
            }
            return arr;
            
        }
        
        return digits;
    }

    //Leetcode -268 Missing Number
    static int missingNumber(int[] nums) {
        int n= nums.length;
        int t=0;
        int sum = (n*(n+1))/2;
        for (int i=0; i<n; i++) {
           t=t+nums[i]; 
        }
        return sum-t;
    }

    public static void main(String[] args){
        int[] numbers={3,2,0};
        System.out.println(missingNumber(numbers));
       // int [] res= plusOne(numbers);
        //System.out.println(Arrays.toString(res));
       // String name = "Rushikesh";
        //boolean found = linearSearch3(name,'f');
        //System.out.println(found);    
        }
}
