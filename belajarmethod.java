public class belajarmethod {
    
    public static void main(String[] args) {
       welcome();
        perkalian(20, 30);
       pembagian(12, 3);
       System.out.println("Parameter and Arguments");
       myMethod("Liam ");
        myMethod("jenny ");
        myMethod("Anja ");
        System.out.println("Multiple Parameter");
        myMethod2("Supriadi", 14);
        myMethod2("Suparman", 20);
        System.out.println(myMethod3(5));
        System.out.println(myMethod4(19, 69));
        checkAge(20);
        System.out.println("Method Overload");
        int myNum1 = plusMethodInt(20, 43);
        double myNum2 = plusMethodDouble(4.3, 6.9);
        System.out.println("int : " + myNum1);
        System.out.println("int : " + myNum2);
        System.out.println("Java Scope");



        
        /* int a = 5;
        int b = 10;
        System.out.println(a*b);

        int d = 2;
        int c = 3;
        System.out.println(c*d);

        int e = 6;
        int f = 8;
        System.out.println(e*f);       */ 

    
    }

    public static void welcome(){
        System.out.println("Welcome to our calculator");
    }
        
    

    public static void perkalian(int a, int b) {
        System.out.println(a*b);

    }

    public static void pembagian(int a,int b) {
        System.out.println(a / b);
    }

    // sekarang parameter dan argumen

    static void myMethod(String fname) {
        System.out.println(fname + "Refsnes");
    }

    public static void myMethod2(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    public static int myMethod3(int p) {
        return 5 + p;
    }

    public static int myMethod4(int h, int f){
        return h + f;
    }

    public static void checkAge (int age) {
        if (age < 18) {
            System.out.println("Acces Denied");
        }
        else {
            System.out.println("Acces Granted");
        }
    }

    public static int plusMethodInt(int u, int y){
        return u+y;
    }
    public static double plusMethodDouble(double u, double y) {
        return u+y;
    }


}
