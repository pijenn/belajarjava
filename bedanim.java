
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class bedanim{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nim = scanner.nextLine();
        String angkatan = nim.substring(0, 2);
        String kodeFakultas = nim.substring(2, 5);
        String kodeProdi = nim.substring(5, 8);
        String kodeJalurMasuk = nim.substring(8, 12);
        String nomorPendaftaran = nim.substring(12,15);
        switch (kodeFakultas) {
            case "515":
                kodeFakultas = "FILKOM";
            case "514":
                kodeFakultas = "FMIPA";
            default:
                kodeFakultas = "Unknown";
        }
        if (fakultas.equals("FILKOM"))
        switch (kodeProdi) {
            case "020":
                kodeProdi = "Teknik Informatika";
            case "030":
                kodeProdi = "Teknik Komputer";
            case "040":
                kodeProdi = "Sistem Informasi";
            case "060":
                kodeProdi = "Pendidikan Teknologi Informasi";
            case "070":
                kodeProdi = "Teknologi Informasi";
            default:
                kodeProdi = "Unknown";
        } else {
        switch (kodeProdi) {
            case "050":
                kodeProdi = "Biologi";
            case "051":
                kodeProdi = "Kimia";
            case "061":
                kodeProdi = "Fisika";
            default:
                kodeProdi = "Unknown";
        }
            
        switch (kodeJalurMasuk) {
            case "1111":
                kodeJalurMasuk = "SNBP";
            case "0111":
                kodeJalurMasuk = "SNBT";
            case "7111":
                kodeJalurMasuk = "Mandiri";
            default:
                kodeJalurMasuk = "Unknown";   
        if (fakultas.equals("Unknown") && prodi.equals("Unknown") && jalurMasuk.equals("Unknown")) {
            System.out.println("Unknown");
        } else {
            System.out.println("Angkatan: 20" + angkatan);
            System.out.println("Fakultas: " + kodeFakultas);
            System.out.println("Program studi: " + kodeProdi);
            System.out.println("Jalur masuk: " + kodeJalurMasuk);
            System.out.println("Nomor mahasiswa: " + nomorPendaftaran);
        }

        scanner.close();
   
    
}
        }
    }
}
