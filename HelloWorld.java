import java.util.Scanner;

public class HelloWorld {

        public static void main(String[] args) {

            Scanner input = new Scanner (System.in);
            String kota = input.next();
            int tanggal = input.nextInt();
            String warna = input.nextLine();
    
            if (kota.equalsIgnoreCase("MLG")){
              if(warna.equalsIgnoreCase("Hijau")){
                System.out.println("Lomba menulis essay");
            } else {
                System.out.println("Lomba menulis puisi");
            }
        } else {
            if(warna.equalsIgnoreCase("Kuning")){
                System.out.println("Lomba menulis essay");
            } else {
                System.out.println("Lomba menulis puisi");
        }
    }
             if (kota.equalsIgnoreCase("MLG")){
                if (tanggal > 25) {
                    System.out.println("Ditolak");
                } else {
                    System.out.println("Diterima");
            }
        } else {
            if (tanggal > 22) {
                    System.out.println("Ditolak");
                } else {
                    System.out.println("Diterima");
        }
    }
    }
    }



        
            
