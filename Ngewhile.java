import java.util.Scanner;

public class Ngewhile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

        }

        // kalo pake do selalu ngelakuin blok code nya sekali setidaknya
        // while selalu ngecek dlu sesuai apa engga

        System.out.println("Hello " + name);

    }
}
