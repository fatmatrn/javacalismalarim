package oyunsorulari;

import java.util.Scanner;

public class PascalUcgeni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir numara giriniz.");
        int lineNumber = input.nextInt();
        int i, j, k, number;

        for(i = 0; i<lineNumber; i++)
        {
            for(k=lineNumber; k>i; k--)
                System.out.print(" ");
            number = 1;

            for (j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
