public class Snack9 {
    public static void main(String[] args) {
        int somma = 0;

        for (int i = 1; i <= 10; i++) {
            somma += i;
        }

        double media = somma / 10.0;

        System.out.println("La somma dei primi 10 numeri è: " + somma);
        System.out.println("La media è: " + media);
    }
}
