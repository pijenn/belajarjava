public class Recursion {
    
// Recursion adalah  teknik membuat sebuah fungsi yang memanggil fungsi itu sendiri.

    public static void main(String[] args) {
        sayHi(6);
        countBackwards(14);
        int result = sum(10);
        System.out.println(result);
    }


    public static void sayHi(int n) {
        /* System.out.println("hi");
        sayHi(); */

        if (n == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("hi!");
            n--;
            sayHi(n);
        }
    }

        // program harus tau kapan berentinya (Need a base case)
    

    public static void countBackwards (int x) {
        
        if (x == 0) {
            System.out.println("Done!");
        } else {
            System.out.println(x);
            x--;
            countBackwards(x);
        }

    }



    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k-1);
        } else {
            return 0;
    }
    }
}
