package oyunsorulari;

import java.util.Scanner;

public class RomenRakamlarinaCevir {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 4000 den daha kucuk pozitif bir sayi giriniz\ncunku klavye  ustu cizgili V ' yi yazamiyor!!! :( \n");
        int alinanSayi = input.nextInt();
       if (alinanSayi<1 || alinanSayi>3999) {
           System.out.println(":(  Malesef uygun bir sayi girmediniz");
       }else {
        String[]  arr = {"I","X","C","M"};
        String[]  brr = {"V","L","D","W"};


       StringBuilder  sayi = new StringBuilder();
       sayi.append(alinanSayi);
        System.out.println(sayi);
        int u = sayi.length();
        sayi.reverse();

        String simge="";
        String  son ="";
        for (int i = 0; i<u ; i++){
            String romen ="";
         int x = Integer.parseInt(sayi.substring(i,i+1));

         if (x==0){simge="";}else if (x<=5){simge=brr[i];}else if (x==9){simge=arr[i+1];}else {simge=arr[i+1];romen=brr[i];}
              switch (x%5){
                  case 1:romen+=arr[i];break;
                  case 2:romen+=arr[i].repeat(2);break;
                  case 3:romen+=arr[i].repeat(3);break;
                  case 4:romen+=arr[i]+simge;break;
                  case 0:romen+=simge;break;
          }
         son=romen+son;
        }
        System.out.println(son);
        }
 }
  }
