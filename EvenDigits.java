
// leetcode1295. Find Numbers with Even Number of Digits
public class EvenDigits {
    
    static int findNumbers(int[] nums) {
        int count=0;
        for( int i : nums) {
            if(even(i)) {count++;}       
        }
        return count;
    }
    // Find if even 
    static boolean even( int i) {
        int d= digits2(i);
        return (d%2 == 0) ? true :false;
    }
    // count no of digits in fiven value
    static int digits(int i){
        if (i<0) i=i* -1;
        if (i==0) return 1;
        int n=0;
        while(i>0){
            n++;
            i=i/10;    
     }
        return n;
    }

    static int digits2(int i){

        //shortcut mothod to find digits
        return (int)Math.log10(i) + 1;
    }

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};

        System.out.println(findNumbers(arr));
    }
}
