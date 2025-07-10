import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int firstNumber = scan.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int secondNumber = scan.nextInt();

        if(firstNumber>secondNumber){
            System.out.println("Il numero maggiore è " + firstNumber);
        } else {
            System.out.println("Il numero maggiore è " + secondNumber);
        }
    }
}
