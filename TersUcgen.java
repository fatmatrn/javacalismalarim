package oyunsorulari;

public class TersUcgen {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int k = i; k < 10; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            for (int boss = 1; boss < i + 1; boss++)
                System.out.print(" ");
        }

    }
}
