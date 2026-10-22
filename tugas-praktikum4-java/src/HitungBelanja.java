import java.io.*;

public class HitungBelanja {
    public static void main(String[] args) {
        String filename = "transaksi_belanja.dat";

        // Menulis data menggunakan DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeUTF("Muhamad Samy");
            dos.writeDouble(250000.0); 
            dos.writeDouble(10.0);     
            dos.writeDouble(225000.0); 
            dos.writeDouble(300000.0); 
            dos.writeDouble(75000.0);  
            System.out.println("Data berhasil disimpan ke file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Membaca data menggunakan DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            String nama = dis.readUTF();
            double totalBelanja = dis.readDouble();
            double diskon = dis.readDouble();
            double total = dis.readDouble();
            double bayar = dis.readDouble();
            double kembalian = dis.readDouble();

            System.out.println("\n=== STRUK PEMBELANJAAN ===");
            System.out.println("Nama         : " + nama);
            System.out.println("Total Belanja: " + totalBelanja);
            System.out.println("Diskon (%)   : " + diskon + "%");
            System.out.println("Total        : " + total);
            System.out.println("Bayar        : " + bayar);
            System.out.println("Kembalian    : " + kembalian);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// tugas no 3
 