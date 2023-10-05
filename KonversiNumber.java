public class KonversiNumber {

    public static void main(String[] args){

    // Widening Cating (Otomatis) atas -> bawah
    byte tipeByte = 10;
    short tipeShort = tipeByte;
    int tipeInt = tipeShort;
    long tipeLong = tipeInt;
    float tipeFloat = tipeLong; 

    System.out.println(tipeFloat);
    
    // Narrowing Casting (Manuak) bawah -> attas

    int tipeInt2 = 100;
    byte tipeByte2 = (byte) tipeInt2;

    }
}