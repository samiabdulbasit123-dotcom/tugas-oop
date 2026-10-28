
import java.util.Scanner;


public class tugas1_menghitungWaktu {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int jam, menit, detik, totDet;

        System.out.println("masukan jam : ");
        jam = input.nextInt();

        System.out.println("masukan menit : ");
        menit = input.nextInt();

        System.out.println("masukan detik : ");
        detik = input.nextInt();
        
        totDet = (360 * jam) + (60 * menit) + detik;

        System.out.println("total waktu : " + totDet + " detik");

        input.close();

    }
}
