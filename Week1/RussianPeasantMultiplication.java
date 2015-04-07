// Step 1. Start two columns on a page, one labeled “A” and the other “B”; and put the value of M under A and the value of N under B.
// Step 2. Repeat
// (a) calculate a new A-value by multiplying the
// old A-value by 2; and
// (b) calculate a new B-value by dividing the
// old B-value by 2 and reducing the result by
// a half if necessary to obtain an integer;
// Until the B-value equals one.
// Step 3. Go down the columns crossing out the A-value whenever the B-value is even.
// Step 4. Add up the remaining A-values and “return” the sum.

public class RussianPeasantMultiplication{
    
    public static int RP(int a, int b){
        int x = a, y = b, z = 0;
        while (x > 0){
            if( x % 2 == 1) z += y;
            x = x >> 1;
            y = y << 1;
        }
        return z;
        
    }
     public static void main(String []args){
        System.out.println(RP(10,5));
     }
}