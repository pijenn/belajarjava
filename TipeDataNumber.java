public class TipeDataNumber {

    public static void main(String[] args){
        //  Kode: Integer  //
        byte TipeByte = 100; // -128 -> 127 , Size = 1 byte
        short TipeShort = 1000; // -32.768 -> 32.767 , Size = 2 bytes
        int TipeInt = 100000; // -2.147.483.648 -> 2.147.483.647 , Size = 4 bytes
        long TipeLong = 100000; // -9.223.372.036.854.775.808 -> 9.223.372.036.854.775.807 , Size =  bytes
        long TipeLong2 = 100000L;

        //  TKode: Float  //
        float TipeFloat = 12.34F; // 3.4e-038 -> 3.4e+038 , Size = 4 bytes
        double TipeDouble = 14.1818; // 1.7e-308 -> 1.7e+308 , Size = 8 bytes

        //  Kode: Literals  //
        int decimalInt = 45; // Basis 10
        int hexInt = 0xA1B2C3; // Basis 16
        int binInt = 0b100101; // Basis 2
        

        //  Kode: Underscore  //
        int amount = 7_000_000;
        long sum = 1_000_000_000_000L;
    
    }
}