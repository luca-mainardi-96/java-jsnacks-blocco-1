import java.util.Scanner;
public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guests = {"Nico Falchetti","Irene Castellani","Milo Bernardi","Aria Montesi","Enea Vassalli","Viola Sereni","Leone Carli","Mira Antinori","Noah Pellegrin","Livia Trentini"};

        System.out.print("Inserisci il tuo nome: ");
        String guestName = scan.nextLine();

        Boolean invited = false;
        for (int i=0; i<guests.length; i++){
            if(guestName.equalsIgnoreCase(guests[i])){
                invited = true;
                break;
            }
        }

        if(invited == true){
            System.out.println("Sei invitato");
        }else{
            System.out.println("Non sei invitato");
        }
    }
    
}
