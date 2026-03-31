public class Mahasiswa06 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // konstruktor default / tanpa parameter
    Mahasiswa06() {
    }
    // konstruktor dengan parameter
    Mahasiswa06(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);
         System.out.println("Kelas : " + kelas);
    }

}

