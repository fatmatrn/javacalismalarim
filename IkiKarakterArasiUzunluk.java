import java.util.Scanner;

public class IkiKarakterArasiUzunluk {
    public static void main(String[] args) {
        //bir karakater girin cumlede 2 tane varsa arasındakı index sayısı
        // ex: a -->  1. a =4 2 a =12 return değer  8 olmalı
        //  eğer harf 1 veya yoksa return  -1 olsun

        String str = " Merhaba Dunya eee";
        System.out.println("Lutfen karakter giriniz");
        Scanner input = new Scanner(System.in);
        String ch = input.next();
        int ilkidx = str.indexOf(ch);
        int sonidx = str.lastIndexOf(ch);
        int fark = sonidx-ilkidx-1;

        if (fark>0){
            System.out.println(fark);
        }else {
            System.out.println(-1);
        }



    }
}
