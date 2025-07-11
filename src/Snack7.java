import java.math.BigInteger;

public class Snack7 {
    public static void main(String[] args) {
        BigInteger base = BigInteger.valueOf(2);
        BigInteger result = BigInteger.ONE;

        for(int i = 0; i <= 1000; i++){
            System.out.println("2^" + i + " = " + result);
            result = result.multiply(base);
        }
    }
}
