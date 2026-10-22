class Karyawan{
    String nama , jabatan , alamat , npm;
    int gajih_pokok = 2000000 , tunjangan_jabatan = 300000 , tunjangan_istri = 200000, tunjangan_anak = 150000;

    public void indentitas(){
        nama = "muhamad samy abdul basyt";
        jabatan = "manager";
        alamat = "sukaluyu";
        npm = "5520125029";

        System.out.println("nama              : " + nama );
        System.out.println("nomor induk       : " + npm);
        System.out.println("jabatan           : " + jabatan);
        System.out.println("alamat            : " + alamat);
        System.out.println("gajih pokok       : " + gajih_pokok);
        System.out.println("tunjangan jabatan : " + tunjangan_jabatan);
        System.out.println("tunjangan_istri   :" + tunjangan_istri);
        System.out.println("tunjangan anak    :" + tunjangan_anak);
    } 

    int total;
    public int total_gajih(){

        total =gajih_pokok + tunjangan_jabatan + tunjangan_istri + tunjangan_anak;
        return total;
    }

    int pajak_penghasilann;
    public int pajak_penghasilan(){
        pajak_penghasilann = (int) ((10.0 / 100) * (tunjangan_jabatan + gajih_pokok + tunjangan_anak));

        return pajak_penghasilann;
    }

    public int gajih_bersih(){
        int gajih_bersihh = total - pajak_penghasilann;
        return  gajih_bersihh;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        

        Karyawan karyawan1 = new Karyawan();
        karyawan1.indentitas();
        System.out.println("total gajih       : " + karyawan1.total_gajih());
        System.out.println("pajak penghasilan : " + karyawan1.pajak_penghasilan());
        System.out.println("gajih bersih      : " + karyawan1.gajih_bersih());

    }
}
