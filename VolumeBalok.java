import java.util.Scanner;
public class VolumeBalok{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Berapa panjang balok = ");
        a = input.nextInt();

        System.out.print("Berapa lebar balok = ");
        b = input.nextInt();

        System.out.print("Berapa tinggi balok = ");
        c = input.nextInt();

        d = a * b * c;

        System.out.println("Maka volume balok = " + d);





    }
}