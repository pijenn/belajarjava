public class exceptions {
    
    // kondisi abnormal yang terjadi pada saat menjalankan program.

    public static void main(String[] args) {
        try {
            int [] myNumbers = {1 , 2, 3};
            //                  0   1   2
            System.out.println(myNumbers[2]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("the 'try catch' is finished");
        }
    }

    /*  Exception in thread          "main"                  java.lang.ArrayIndexOutOfBoundsException   Index 3 out of bounds for length 3
        ada kesalahan input  ada kesalahan di main                       alasannya                            dimana salahnya             */
}
