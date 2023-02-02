public class Faktoriyel {
    //Write a return method that accepts an integer as input and calculates factorial and prints like output.
    public static void main(String[] args) {

        int a = 6;
        int b=1;
        int faktoriyel=1;

        while(b<=a){
            faktoriyel=faktoriyel*b;

            b++;
        }
        System.out.println(faktoriyel);

    }
}
