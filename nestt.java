import java.util.Scanner;

public class nestt {
    
    // nested loops = loop didalem loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter amount of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter amount of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++) {
            System.out.println();
            for(int z=1; z<=columns; z++){
                System.out.print(symbol);

            }
        }

    }
}
