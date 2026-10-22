import java.util.Scanner;

public class HitungWaktuCetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENGHITUNG WAKTU CETAK NOVEL ===");
        System.out.print("Masukkan jumlah novel yang akan dicetak : ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal lembar per novel       : ");
        int tebalLembar = input.nextInt();

        // Kecepatan mesin cetak: 1 lembar / detik
        // Total detik keseluruhan waktu cetak
        long totalDetik = (long) jumlahNovel * tebalLembar;

        // Konversi waktu berdasarkan keterangan soal:
        // 1 hari = 86400 detik
        // 1 jam  = 3600 detik
        // 1 menit = 60 detik

        long hari = totalDetik / 86400;
        long sisaDetik = totalDetik % 86400;

        long jam = sisaDetik / 3600;
        sisaDetik %= 3600;

        long menit = sisaDetik / 60;
        long detik = sisaDetik % 60;

        // Menampilkan Hasil Keluaran
        System.out.println("\n--- HASIL PERHITUNGAN WAKTU ---");
        System.out.println("Total lembar yang harus dicetak : " + totalDetik + " lembar");
        System.out.println("Waktu yang diperlukan           : ");
        System.out.println("- Hari  : " + hari);
        System.out.println("- Jam   : " + jam);
        System.out.println("- Menit : " + menit);
        System.out.println("- Detik : " + detik);
        
        input.close();
    }
}
