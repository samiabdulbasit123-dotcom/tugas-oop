import java.util.Scanner;

class Speda {

    int maju = 10;
    int mundur = 5;
    int jarak = 0;
    String nama;
    Scanner input = new Scanner(System.in);

    public void merek() {

        System.out.print("masukan object speda : " );
        nama = input.nextLine();
        System.out.println("Object " + nama + " dibuat, jarak tempuh awal : " + jarak + " KM\n\n");

    }

    public int Bergerak(int tipe_gerak) {

        switch (tipe_gerak) {

            case 0:

                System.out.println("\nkeluar program..");
                System.out.println("terima kasih telah menggunakan progrem ini");

                break;

            case 1:

                jarak += maju;
                System.out.println("\nbergarak maju " + tipe_gerak + " KM");
                System.out.println("object speda " + nama + " jarak tempuh : " + jarak + " KM");
               

                break;

            case 2:
                jarak -= mundur;
                System.out.println("\nbergarak mundur " + tipe_gerak + " KM");
                System.out.println("object speda " + nama + " jarak tempuh : " + jarak + " KM");
                

                break;

            case 3:
                System.out.println("\nobject speda " + nama + " jarak tempuh akhir : " + jarak + " KM");
                break;
            default:

                break;
        }

        return jarak;
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        Speda object1 = new Speda();

        Scanner input = new Scanner(System.in);

        object1.merek();

        boolean berhenti = false;

        while (!berhenti) {
            System.out.print("\n\nmenu\n" + "bergerak maju (1)\n" + "bergerak mundur(2)\n" + "berhenti (3)\n" + "exit (0)\n"
                    + "pilihan : ");
            int pilihan = input.nextInt();
            object1.Bergerak(pilihan);
            if ( pilihan == 0) {
                berhenti = true;
            }
        }
        input.close();

    }
}
