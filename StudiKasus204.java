package Java.Jobsheet6;

import java.util.Scanner;

public class StudiKasus204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        String jenisKegiatan;
        int jumlahDokumen;
        int juara = 0;
        int statusPKM = 0;
        int dokumenKurang;

        System.out.println("===== CEK DANA PENGHARGAAN MAHASISWA =====");

        System.out.print("Nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen yang diupload (0-4): ");
        jumlahDokumen = input.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            juara = input.nextInt();

            if (juara >= 1 && juara <= 3) {

                if (jumlahDokumen == 4) {
                    System.out.println("\nNama : " + nama);
                    System.out.println("Status : BERHAK memperoleh dana penghargaan.");
                    System.out.println("Alasan : Juara " + juara
                            + " dan seluruh dokumen lengkap.");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;

                    System.out.println("\nNama : " + nama);
                    System.out.println("Status : TIDAK memperoleh dana penghargaan.");
                    System.out.println("Alasan : Dokumen tidak lengkap.");
                    System.out.println("Dokumen yang masih kurang : "
                            + dokumenKurang);
                }

            } else {
                System.out.println("\nNama : " + nama);
                System.out.println("Status : TIDAK memperoleh dana penghargaan.");
                System.out.println("Alasan : Hanya Juara 1, 2, atau 3 yang memperoleh dana.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {

                if (jumlahDokumen == 4) {
                    System.out.println("\nNama : " + nama);
                    System.out.println("Status : BERHAK memperoleh dana penghargaan.");
                    System.out.println("Alasan : PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    dokumenKurang = 4 - jumlahDokumen;

                    System.out.println("\nNama : " + nama);
                    System.out.println("Status : TIDAK memperoleh dana penghargaan.");
                    System.out.println("Alasan : Dokumen tidak lengkap.");
                    System.out.println("Dokumen yang masih kurang : "
                            + dokumenKurang);
                }

            } else {
                System.out.println("\nNama : " + nama);
                System.out.println("Status : TIDAK memperoleh dana penghargaan.");
                System.out.println("Alasan : PKM tidak lolos pendanaan.");
            }

        } else {
            System.out.println("\nNama : " + nama);
            System.out.println("Status : TIDAK memperoleh dana penghargaan.");
            System.out.println("Alasan : Jenis kegiatan tidak termasuk ketentuan.");
        }

        input.close();
    }
}