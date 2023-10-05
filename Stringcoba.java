public class Stringcoba {

public static void main(String[] args) {
    String word = "bobcat" ;
        //         012345

        String find1 = "b" ;
        char find2 = 'c' ;
        String find3 = "x" ;
        String find4 = "cat" ;
        String find5 = "bob" ;
        String find6 = "nice kitty" ;

        System.out.println("huruf pertama dari " + find1 + " ada di index " + word.indexOf(find1));
        System.out.println("huruf pertama dari "+ find2 + " ada di index " + word.indexOf(find2));
        System.out.println("huruf pertama dari " + find3 + " ada di index " + word.indexOf(find3));
        System.out.println("huruf pertama dari " + find4 + " ada di index " + word.indexOf(find4));
        System.out.println("huruf pertama dari " + find5 + " ada di index " + word.indexOf(find5));
        System.out.println("huruf pertama dari " + find6 + " ada di index " + word.indexOf(find6));
        
        /* Semua char di string mempunyai index
         * Akan memunculkan huruf pertama yang muncul walaupun ada dua atau lebih
         * Bisa pake string dan char
         * -1 artinya huruf atau katanya gaada di string nya
         */
        
}
}