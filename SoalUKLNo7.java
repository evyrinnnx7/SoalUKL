/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soaluklno7;

import java.util.Scanner;

/**
 *
 * @author nauva
 */
public class SoalUKLNo7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); // buang newline

        // Variabel total keseluruhan
        double totalLabaRugi = 0;
        String paketLabaTertinggi = "";
        double labaTertinggi = Double.NEGATIVE_INFINITY;

        System.out.println("\n=== INPUT DATA PAKET ===");

        for (int i = 1; i <= jumlahPaket; i++) {

            System.out.println("\nPaket ke-" + i);

            System.out.print("Nama paket                : ");
            String nama = input.nextLine();

            System.out.print("Biaya produksi per event  : ");
            double biayaProduksi = input.nextDouble();

            System.out.print("Harga jual per event      : ");
            double hargaJual = input.nextDouble();

            System.out.print("Jumlah event terjual      : ");
            int jumlahEvent = input.nextInt();
            input.nextLine(); // buang newline lagi

            // Hitung biaya dan pendapatan
            double totalBiaya = biayaProduksi * jumlahEvent;
            double totalPendapatan = hargaJual * jumlahEvent;
            double labaRugi = totalPendapatan - totalBiaya;

            // Tentukan status
            String status;
            if (labaRugi > 0) {
                status = "Laba";
            } else if (labaRugi < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }

            // Output per paket
            System.out.println("\n--- HASIL UNTUK PAKET " + nama + " ---");
            System.out.println("Total biaya produksi   : Rp " + totalBiaya);
            System.out.println("Total pendapatan       : Rp " + totalPendapatan);
            System.out.println("Status paket           : " + status);
            System.out.println("Total laba/rugi paket  : Rp " + labaRugi);

            // Tambah total keseluruhan
            totalLabaRugi += labaRugi;

            // Cek laba tertinggi
            if (labaRugi > labaTertinggi) {
                labaTertinggi = labaRugi;
                paketLabaTertinggi = nama;
            }
        }
 
        // Output final
        System.out.println("\n===============================");
        System.out.println("TOTAL LABA/RUGI SEMUA PAKET : Rp " + totalLabaRugi);
        System.out.println("PAKET LABA TERTINGGI        : " + paketLabaTertinggi);
        System.out.println("NILAI LABA TERTINGGI        : Rp " + labaTertinggi);
        System.out.println("===============================");
    }
}
