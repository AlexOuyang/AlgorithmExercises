// Euclid’s Algorithm for GCD(x,y) for x and y are positive integers
public class GreatestCommonDivisor{
    public static int GCD(int x, int y){
        int a = x;
        int b = y;
        int r = a % b;
        while (r > 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(GCD(100,40));
    }
}