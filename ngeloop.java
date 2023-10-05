public class ngeloop {
    
    public static void main(String[] args) {
        int a = 1;
        while (a <= 6) {
            System.out.println(a);
            a++;
        }
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }
        while (b < 6 );

        /*Perulangan while akan melakukan perulangan kalau kondisi (syarat) terpenuhi. 
        Sedangkan do/while melakukan perulangan dulu, kemudian memeriksa kondisinya atau sayaratnya. 
        Kalau kondisi terpenuhi, maka do/while akan melanjutkan perulangan.*/

        for (int i = 0; i < 5; i++) {
            System.out.println("Yes");

            //untuk kata atau kalimat bisa pake for  
        
        }

        String[] supercar = {"lambo" , "ferarri" , "mclaren"};
        for (String x : supercar) {
            System.out.println(x);
        }

        for (int w = 0 ; w < 10 ; w++) {
            if (w == 5) {
                break ;
            }
            System.out.println(w);
        }

        // kalo mau berhentiin pake break ygy

        for (int k = 0; k < 10; k++ ) {
            if (k >= 4) {
                continue;
            }
            System.out.println(k);
        }

        // kalo mau lompatin pake continue

        for(int i=10; i>=0; i--) {
            System.out.println(i);
        }
        System.out.println("MANTAP GES");

        for(int i=10; i>=0; i-=2) {
            System.out.println(i);
        }
        System.out.println("MANTAP WOW");


    }
}
