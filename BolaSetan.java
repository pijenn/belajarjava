import java.io.*;
import java.util.Scanner;

public class BolaSetan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tinggiAwal = 5;
        int pantulan = input.nextInt();
        int n = 1;
        while (n > 1){
            n++;
            n = n + pantulan*2;
            pantulan = pantulan-1;
        }

        }
            
    }


