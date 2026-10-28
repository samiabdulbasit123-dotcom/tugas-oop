
import java.util.Scanner;

public class tugas1_inputan {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan tahun (1909 - 2024) : ");
        int tahun = input.nextInt();
        System.out.println(tahun + " adalah tahun kabisat");
        input.close();
    }
}
