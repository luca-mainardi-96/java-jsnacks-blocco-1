import java.util.Scanner;
public class Snack8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero a 4 cifre: ");
        String userNumber = scan.next();

        String firstDigitString = userNumber.substring(0,1);
        String secondDigitString = userNumber.substring(1,2);
        String thirdDigitString = userNumber.substring(2,3);
        String fourthDigitString = userNumber.substring(3,4);

        int firstDigit = Integer.parseInt(firstDigitString);
        int secondDigit = Integer.parseInt(secondDigitString);
        int thirdDigit = Integer.parseInt(thirdDigitString);
        int fourthDigit  = Integer.parseInt(fourthDigitString);

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(sum);
    }
}
