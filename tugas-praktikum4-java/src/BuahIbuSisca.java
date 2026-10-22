import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BuahIbuSisca {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int manggaAwal = 70;
        int manggaBusuk = 15;
        int jumlahTetangga = 4;
        int jambuPerTetangga = 30;

        int manggaBersih = manggaAwal - manggaBusuk;
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        int totalBuahKeseluruhan = manggaBersih + totalJambu;

        System.out.println("=== LAPORAN BELANJA BUAH IBU SISCA ===");
        System.out.println("Mangga Bagus (setelah dikurangi busuk): " + manggaBersih + " pcs");
        System.out.println("Total Buah Jambu untuk Tetangga      : " + totalJambu + " pcs");
        System.out.println("--------------------------------------------");
        System.out.println("Total Keseluruhan Buah yang Dibeli   : " + totalBuahKeseluruhan + " pcs");
    }
}