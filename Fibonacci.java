package oyunsorulari;

public class Fibonacci {

    public static void main(String[] args) {

        int a=1;
        int b=1;
        int c=0;
        System.out.print(a);
        for (int i = 0; i < 6; i++) {
            System.out.print(b);
          c=a+b;

          a=b;
          b=c;

        }
    }


}
