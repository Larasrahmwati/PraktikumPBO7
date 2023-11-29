package tokoserbaada;

import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("*******************");

        System.out.print("Masukkan Item Barang : ");
        int itemCount = input.nextInt();

        String[] kodeBarang = new String[itemCount];
        String[] namaBarang = new String[itemCount];
        int[] hargaBarang = new int[itemCount];
        int[] jumlahBeli = new int[itemCount];

        // Input data barang
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode : ");
            kodeBarang[i] = input.next();

            // Set nama barang dan harga berdasarkan kode barang
            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 4000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Barang Tidak Diketahui";
                    hargaBarang[i] = 0;
            }

            System.out.print("Masukkan Jumlah Beli : ");
            jumlahBeli[i] = input.nextInt();
        }

        // Tampilkan output
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************");
        System.out.println("No  Kode Barang  Nama Barang        Harga  Jumlah Beli      Jumlah Bayar ");
        System.out.println("======================================================================");

        int totalBayar = 0;
        for (int i = 0; i < itemCount; i++) {
            int jumlahBayar = hargaBarang[i] * jumlahBeli[i];
            totalBayar += jumlahBayar;

            System.out.printf("%-4d%-14s%-18s%-8d%-15d%-12d%n", (i + 1), kodeBarang[i], namaBarang[i],
                    hargaBarang[i], jumlahBeli[i], jumlahBayar);
        }

        System.out.println("=======================================================================");
        System.out.printf("Total Bayar%47d%n", totalBayar);
        System.out.println("=======================================================================");

        input.close();
    }
}
