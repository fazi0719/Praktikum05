import java.util.Scanner;

public class mainDosen06 {
    static Scanner sc = new Scanner(System.in);
    static DataDosen06 data = new DataDosen06();

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilMenu();
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1: inputDosen(); break;
                case 2: data.tampil(); break;
                case 3: data.SortingASC(); data.tampil(); break;
                case 4: data.sortingDSC(); data.tampil(); break;
                case 5: data.insertionSort(); data.tampil(); break;
                case 6: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
        sc.close();
    }

    static void tampilMenu() {
        System.out.println("\n===== MENU DATA DOSEN =====");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sorting ASC (termuda ke tertua)");
        System.out.println("4. Sorting DSC (tertua ke termuda)");
        System.out.println("5. Insertion Sort");
        System.out.println("6. Keluar");
    }

    static void inputDosen() {
        System.out.print("Kode   : "); String kode = sc.nextLine();
        System.out.print("Nama   : "); String nama = sc.nextLine();
        System.out.print("JK(L/P): "); boolean jk = sc.nextLine().equalsIgnoreCase("L");
        System.out.print("Usia   : "); int usia = sc.nextInt(); sc.nextLine();
        data.tambah(new Dosen06(kode, nama, jk, usia));
        System.out.println("Data berhasil ditambahkan!");
    }
}