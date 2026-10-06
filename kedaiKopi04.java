package Java.Jobsheet6;
import java.util.Scanner;

public class kedaiKopi04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaKopi = 18000;
        int jumlahKopi;
        int totalHarga;
        double diskon = 0;
        double totalBayar;
        double uangBayar;
        double kembalian;

        System.out.print("===== KEDAI KOPI SENJA =====\n");

        System.out.print("Jumlah kopi gula aren: ");
        jumlahKopi = input.nextInt();
        System.out.print("Uang pembayaran: ");
        uangBayar = input.nextDouble();

        totalHarga = hargaKopi * jumlahKopi;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.10;
        }

        totalBayar = totalHarga - diskon;
        kembalian = uangBayar - totalBayar;

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Harga per cup: Rp " + hargaKopi);       
        System.out.println("Jumlah: " + jumlahKopi);       
        System.out.println("Total harga : Rp" + totalHarga);       
        System.out.println("Diskon : Rp" + diskon);       
        System.out.println("Total bayar : Rp" + totalBayar);       
        System.out.println("Uang bayar : Rp" + uangBayar);       
        System.out.println("Kembalian : Rp" + kembalian);
        
        input.close();

    }
}
