package algoritme;
import java.util.Scanner;

public class NIMrun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM : ");
        String nim = input.nextLine();

        System.out.println("=================================");
        System.out.println("");

        NIM Jenjang = new NIM();
        Jenjang.setJenjang(nim);
        System.out.println("1. Jenjang Pendidikan   : " + Jenjang.getjenjangPendidikan());

        NIM tahun = new NIM();
        tahun.setTahun(nim);
        System.out.println("2. Tahun Angkatan       : " + tahun.gettahunAngkatan());

        NIM FAkultas = new NIM();
        FAkultas.setfakultas(nim);
        System.out.println("3. Fakultas             : " + FAkultas.getfakultas());

        NIM Jurusan = new NIM();
        Jurusan.setjrsn(nim);
        System.out.println("4. Jurusan/Prodi        : " + Jurusan.getjurusan());

        NIM Jeniskelamin = new NIM();
        Jeniskelamin.setJK(nim);
        System.out.println("5. Jenis Kelamin        : " + Jeniskelamin.getjenisKelamin());

        NIM Num = new NIM();
        Num.setNoMahasiswa(nim);
        System.out.println("6. Nomor Urut Mahasiswa : " + Num.getnomorMahasiswa());
    }
}

