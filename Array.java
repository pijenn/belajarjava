public class Array {
    public static void main(String[] args) {

        /* Array digunakan untuk mengtrack list/nilai yang panjang .*/ 

        String[] TempatPensil = {"pulpen" , "penghapus" , "sticker inten"};
        //                         0             1              2

        System.out.println("Normal Array");
        System.out.println(TempatPensil[1]);
        System.out.println(TempatPensil.length);

        // length berfungsi untuk menunjukan berapa banyak index

        int [] nomorcoba  = {12,69,43,66} ;

        System.out.println("Number array");

        System.out.println(nomorcoba[2]);

        // kita juga dapat merubah index di dalam string

        System.out.println("Change element");

        String[] motorcycle = {"ducatti" , "benelli" , "harley"} ;
        motorcycle[0] = "Triumph";
        System.out.println(motorcycle[0]);

        System.out.println("Loop Array");

        for (String i : TempatPensil) {
            System.out.println(i);

            // buat ngeloop atau nyebuatin index dari variabel mulai dari 0 sampe akhir
        }

        System.out.println("Multidimensional Array");
        
        int [][] myNumbers ={{1,2,3,4}, {5,6,7,8} };
        //                       0           1
        System.out.println(myNumbers[1][2]);

        

        // dalam kurung pertama artinya di array keberapa
        // dalam kurung kedua artinya di index keberapa

        System.out.println("Loop Multidimensional Array");

        int [][] angkakeren = {{1,2,3,4}, {5,6,7}};
        for (int z = 0; z < angkakeren.length; ++z){
            for (int s = 0; s < angkakeren[z].length; ++s){
                System.out.println(angkakeren[z][s]);
            }
        }

        }
    }

    
