public class DataDosen06 {
    Dosen06[] dataDosen = new Dosen06[5];
    int idx;

    // Tambah data dosen
    void tambah(Dosen06 dsn) {
        if (idx < dataDosen.length) {        
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Tampil semua data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
            return;
        }
        for (int i = 0; i < idx; i++) {
            System.out.println("--- Dosen ke-" + (i + 1) + " ---");
            dataDosen[i].tampil();          
        }
    }

    // Sorting ASC berdasarkan usia (Bubble Sort - termuda ke tertua)
    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen06 temp = dataDosen[j];     
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC (termuda ke tertua)");
    }

    // Sorting DSC berdasarkan usia (Insertion Sort - tertua ke termuda)
    void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen06 temp = dataDosen[i];    
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
        System.out.println("Data berhasil diurutkan DSC (tertua ke termuda)");
    }

    // Insertion Sort ASC
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen06 temp = dataDosen[i];    
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}