import java.util.Scanner;

public class Persegi extends BangunDatar{
    
    Scanner sc = new Scanner(System.in);
    int sisi;
    
    public void luas(){
        System.out.println("Masukkan sisi : ");
        sisi = sc.nextInt();
        System.out.println("Luas persegi");
        int hasil = sisi * sisi;
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling persegi");
        int hasil = sisi * 4;
        System.out.println("Hasil keliling : " + hasil);
    }
    
}