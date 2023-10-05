public class math {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int a = 2;
        int b = 3;
        double hasilLog = Math.log(1);
        double hasilLog10 = Math.log10(1000);
        double hasilLog1p = Math.log1p(1000);
        double degrees = 45.0;
        double radians = Math.toRadians(degrees); 
        double sinValue = Math.sin(radians);
        double z = 3.4;
        double w = 3.5;
        double ww = z*w;
        
        

        System.out.println(Math.max(x,y));
        // mencari nilai yang maksimal dari variabel

        System.out.println(Math.sqrt(y));
        // untuk mengakarkan

        System.out.println(Math.pow(a, b));
        // mempangkatkan

        System.out.println("log = " + hasilLog);
        // menghitung log alami dari basis e (2,7182818...)
        System.out.println("log10 = " + hasilLog10);
        // menghitung log dari nilai basis 10
        System.out.println("log1p = " + hasilLog1p);
        // menghitung alami dari jumlah argumen dan 1

        /* Contoh soal 
         * Diketahui 5Log 4 = m, berapakah nilai x?
         * Pake rumus m = log4/ log 5
         */

         System.out.println("sin(" + degrees + ") = " + sinValue);
         // Fungsi-fungsi ini menghasilkan nilai dengan tipe double.
 
         System.out.println(Math.round(ww));
         // membulatkan dan menghilangkan desimal
         System.out.println(Math.ceil(ww));
         // membulatkan keatas dan masi ada desimal
         System.out.println(Math.floor(ww));
         // membulatkan kebawah dan masi ada desimal

         System.out.println(Math.abs(ww));
         // bakal sama persis atau nilai absolute nya

         System.out.println(Math.signum(ww));
         // kalo positif keluar 1, negatif -1, kosong/nol 0

         System.out.println(Math.nextDown(ww));
         System.out.println(Math.nextUp(ww));
         // naik turun tergantung tipe nilainya




    }
    
}
