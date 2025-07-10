import java.util.Scanner;
public class Snack2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la prima parola: ");
        String firstWord = scan.next();

        System.out.print("Inserisci la seconda parola: ");
        String secondWord = scan.next();

        if(firstWord.length()<secondWord.length()){
            System.out.println(firstWord + " " + secondWord);
        }else{
            System.out.println(secondWord + " " + firstWord);
        }
        
    }
}
