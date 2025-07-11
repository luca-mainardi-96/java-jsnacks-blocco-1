public class Snack10 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int spaces = rows - i;
            int asterisks = (2 * i) - 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
