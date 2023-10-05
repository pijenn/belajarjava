public class Dadu {

    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            // jumlah dadu berapa kali yg akan di lempar
            System.out.println("Hasil Lempar Dadu ke-"+i+": " + lemparDadu());
        }
    }
    
    public static int lemparDadu(){
        int jumlahMataDadu = 6;
        int niliTerkecilDadu = 1;
        int nilaiDadu = ((int) (Math.random() * jumlahMataDadu)) + niliTerkecilDadu; 
        
        return nilaiDadu;
    }


}
