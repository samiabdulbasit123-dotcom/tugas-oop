
import java.util.Scanner;

public class tugas1_menghitungLingkaran
{

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double jari, keliling, luas;
        final double PI = 3.14;

        System.out.println("program menghitung lingkaran \n\n masukan jari jari : " );
        jari = input.nextDouble();

        luas = PI * (jari*jari);
        keliling = 2 * (PI * jari);

       System.out.println("\n\n\nluas : " + luas);
       System.out.println("keliling : " + keliling);

       input.close();
    }
}
