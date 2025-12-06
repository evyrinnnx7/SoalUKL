/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soaluklno6;

import java.util.Scanner;

/**
 *
 * @author nauva
 */
public class SoalUKLNo6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Golongan listrik (A / B / C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Jumlah pemakaian listrik (kWh): ");
        int kwh = input.nextInt();

        // Menentukan tarif per kWh
        int tarif = 0;
        switch (golongan) {
            case "A":
                tarif = 1200;
                break;
            case "B":
                tarif = 1500;
                break;
            case "C":
                tarif = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        // Hitung total sebelum tambahan
        double totalSebelum = kwh * tarif;

        // Hitung tambahan 10% jika pemakaian > 500 kWh
        double tambahan = 0;
        if (kwh > 500) {
            tambahan = totalSebelum * 0.10;
        }

        // Total akhir
        double totalAkhir = totalSebelum + tambahan;

        // Output
        System.out.println("\n=== HASIL TAGIHAN LISTRIK ===");
        System.out.println("Nama pelanggan       : " + nama);
        System.out.println("Golongan listrik     : " + golongan);
        System.out.println("Pemakaian listrik    : " + kwh + " kWh");
        System.out.println("Total sebelum tambah : Rp " + totalSebelum);
        System.out.println("Biaya tambahan       : Rp " + tambahan);
        System.out.println("Total tagihan akhir  : Rp " + totalAkhir);
    }
}
