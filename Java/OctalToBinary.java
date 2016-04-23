public class OctalToBinary{
    public static int Convert(int octal){
        // convert to decimal
        int decimal = 0;
        int binary = 0;
        int power = 0;
        while(octal > 0){
            decimal += (octal % 10) * Math.pow(8, power);
            octal /= 10;
            ++power;
        }

        // convert decimal to binary
        power = 0;
        while(decimal > 0){
            binary += (decimal % 2) * Math.pow(10, power);
            decimal /= 2;
            ++power;
        }

        return binary;
    }


    public static void main(String[] args){
        System.out.println(Convert(1234));        
        System.out.println(Convert(12));
        System.out.println(Convert(1));

    }
}