import java.time.LocalTime;
import java.time.Duration;

public class SelisihWaktu {
    public static void main(String[] args) {
        // Menentukan Waktu Pertama dan Waktu Kedua
        LocalTime waktuPertama = LocalTime.of( 15, 30);
        LocalTime waktuKedua = LocalTime.of(11, 45, 10);

        // Menghitung durasi selisih waktu
        Duration selisih = Duration.between(waktuPertama, waktuKedua);

        long jam = selisih.toHours();
        long menit = selisih.toMinutes() % 60;
        long detik = selisih.getSeconds() % 60;

        System.out.println("Waktu Pertama : " + waktuPertama);
        System.out.println("Waktu Kedua   : " + waktuKedua);
        System.out.println("Selisih Waktu : " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}