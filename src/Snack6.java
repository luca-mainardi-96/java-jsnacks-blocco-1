import java.util.Scanner;
public class Snack6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo: ");
        int userNumber = scan.nextInt();

        int result = 0;
        for(int i=0; i<=userNumber; i++){
            result = i*i*i;
            System.out.println(result);
        }

        
    }
}
