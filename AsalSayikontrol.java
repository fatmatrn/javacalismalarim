package oyunsorulari;

import java.util.Scanner;

public class AsalSayikontrol {
    public static void main(String[] args) {

        //Soru 1: Kullanicinin girdigi sayinin asal olup olmadigini gosteren kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Sayi Giriniz.");
        int sayi = input.nextInt();
        int sayac = 0;


        if (sayi > 0) {
            int i = 2;
            do {
                if (sayi % i == 0) {
                    sayac = sayac + 1;
                }
                i++;
            } while (sayi >= i);
            if (sayac == 1) {
                System.out.println("Sayi Asaldir");

            } else {
                System.out.println("Asal Degildir");

            }
        } else {
            System.out.println("Pozitif Sayi Giriniz.");
        }

    }
}
