import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPelanggan;
        int tiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double totalPenjualan = 0;
        double diskon;
        double totalBayar;

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + i);

            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                i--;
                continue;
            }

            double subtotal = tiket * hargaTiket;

            if (tiket > 10) {
                diskon = 0.15 * subtotal;
            } else if (tiket > 4) {
                diskon = 0.10 * subtotal;
            } else {
                diskon = 0;
            }

            totalBayar = subtotal - diskon;

            System.out.println("Subtotal       : Rp " + subtotal);
            System.out.println("Diskon         : Rp " + diskon);
            System.out.println("Total bayar    : Rp " + totalBayar);

            totalTiket += tiket;
            totalPenjualan += totalBayar;
        }

        System.out.println("\n===== TOTAL PENJUALAN HARIAN =====");
        System.out.println("Total tiket terjual : " + totalTiket + " tiket");
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        sc.close();
    }
}