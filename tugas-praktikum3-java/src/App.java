
class PersegiPanjang {
    int panjang = 50;
    int lebar = 45;

   

    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar   = " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}




class PersamaanKuadrat {
    int a = 2;
    int b = 10;
    int c = 5;

    
    public void hitungPersamaan() {
        int hasil = (b * b) - (4 * a * c);
        System.out.println("Nilai a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Rumus: b^2 - 4ac");
        System.out.println("Hasil = (" + b + "^2) - (4 * " + a + " * " + c + ") = " + hasil);
    }
}




class OperasiMatematika {
    double x = 22;
    int y = 33;

    
    public void hitungSemua() {
        System.out.println("Bilangan x = " + x + ", y = " + y);
        System.out.println("Penjumlahan (x + y) : " + (x + y));
        System.out.println("Pengurangan (x - y) : " + (x - y));
        System.out.println("Perkalian   (x * y) : " + (x * y));
        System.out.println("Pembagian   (x / y) : " + (x / y));
    }
}




class Segitiga {
    double tinggi = 6;
    double alas =  8;

    
    public void hitungLuas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Tinggi (a) = " + tinggi);
        System.out.println("Alas (b)   = " + alas);
        System.out.println("Luas Segitiga = 1/2 * alas * tinggi = " + luas);
    }

    public void hitungPythagorasDanKeliling() {
        double c = Math.sqrt((tinggi * tinggi) + (alas * alas));
        double keliling = tinggi + alas + c;
        System.out.println("Sisi Miring (c) Pythagoras = " + c);
        System.out.println("Keliling Segitiga (a + b + c) = " + keliling);
    }
}



class KonversiSuhu {
    double c = 10, f = 15, r = 5;


    public void konversiSemua() {
        System.out.println("Nilai awal -> C = " + c + ", F = " + f + ", R = " + r);
        
        // a. Celcius ke Fahrenheit & sebaliknya
        double cToF = (c * 9.0 / 5.0) + 32;
        double fToC = (f - 32) * 5.0 / 9.0;
        System.out.println("a. Celcius ke Fahrenheit (" + c + "°C) = " + cToF + " °F");
        System.out.println("   Fahrenheit ke Celcius (" + f + "°F) = " + fToC + " °C");

        // b. Celcius ke Reamur & sebaliknya
        double cToR = c * 4.0 / 5.0;
        double rToC = r * 5.0 / 4.0;
        System.out.println("b. Celcius ke Reamur (" + c + "°C) = " + cToR + " °R");
        System.out.println("   Reamur ke Celcius (" + r + "°R) = " + rToC + " °C");

        // c. Fahrenheit ke Reamur & sebaliknya
        double fToR = (f - 32) * 4.0 / 9.0;
        double rToF = (r * 9.0 / 4.0) + 32;
        System.out.println("c. Fahrenheit ke Reamur (" + f + "°F) = " + fToR + " °R");
        System.out.println("   Reamur ke Fahrenheit (" + r + "°R) = " + rToF + " °F");
    }
}

public class App {

   
   
    public static void main(String[] args) {


    //    soal no 1
        int i = 5;
        System.out.println("Nilai awal i = " + i);
        System.out.println("inkremen plus di depan(++i)  : " + (++i)); 
        System.out.println("inkremen plus di belakang (i++) : " + (i++)); 
        System.out.println("Nilai akhir i        : " + i);
        System.out.println("=============================");



    //    soal no 2
        PersegiPanjang pp = new PersegiPanjang();
        pp.hitungLuas();
        System.out.println("=============================");

       
    //  soal 3
        PersamaanKuadrat pk = new PersamaanKuadrat();
        pk.hitungPersamaan();
        System.out.println("=============================");

        
    // soal no 4
        OperasiMatematika om = new OperasiMatematika();
        om.hitungSemua();
        System.out.println("=============================");

    //  soal no 5 dan 6
        Segitiga seg = new Segitiga();
        seg.hitungLuas();
        seg.hitungPythagorasDanKeliling();
        System.out.println("=============================");

        
        String strA = "Saya Belajar Java";
        String strB = "Saya Belajar Java";
        System.out.println("String a awal      : " + strA);
        System.out.println("String a (lowercase): " + strA.toLowerCase());
        System.out.println("String b awal      : " + strB);
        System.out.println("String b (uppercase): " + strB.toUpperCase());
         System.out.println("=============================");


        
        double jarakBulan = 384400.0;    
        double jarakMatahari = 152100000.0; 
        double kecepatanCahaya = 300000.0;  

        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("Jarak ke Bulan     : " + jarakBulan + " km");
        System.out.println("Waktu tempuh       : " + waktuBulan + " detik (" + (waktuBulan / 60) + " menit)");
        System.out.println("Jarak ke Matahari  : " + jarakMatahari + " km");
        System.out.println("Waktu tempuh       : " + waktuMatahari + " detik (" + (waktuMatahari / 3600) + " jam)");
        System.out.println();

        
        KonversiSuhu ks = new KonversiSuhu();
        ks.konversiSemua();
    }
}
