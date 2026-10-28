import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    
    Scanner sc = new Scanner(System.in);
    double r;
    
    public void luas(){
        System.out.println("Masukkan jari : ");
        r = sc.nextDouble();
        System.out.println("Luas lingkaran");
        double hasil = 3.14 * (r * r);
        System.out.println("Hasil luas : " + hasil);
    }
    public void keliling(){
        System.out.println("Keliling lingkaran");
        double hasil = 2 * 3.14 * r;
        System.out.println("Hasil keliling : " + hasil);
    }
}