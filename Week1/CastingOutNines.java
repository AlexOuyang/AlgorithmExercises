// 1. Let k start with the value of n. 2. While k has more than one digit,
// add the digits in k to produce a new value of k. 3. Return the answer to the question
// “Does 3 (or 9) divide evenly into k?”

public class CastingOutNines{
    public static boolean Does_3_Or_9_Divide_Evenly_Into_K(int n){
        while(n > 9){
            n = sumDigit(n);
        }
        return (n%3 == 0)? true : false;
    }

    // a helper function
    public static int sumDigit(int n){
        return (n%9 == 0 && n != 0) ? 9 : n%9;
    }
    public static void main(String[] args){
        System.out.println(Does_3_Or_9_Divide_Evenly_Into_K(87466));
    }
}