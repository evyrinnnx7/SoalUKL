/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soaluklno5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nauva
 */
public class SoalUKLNo5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] array = new int[n];

        // Input elemen array
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Membuat map untuk menyimpan frekuensi
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        // Menghitung frekuensi setiap elemen
        for (int num : array) {
            if (frekuensiMap.containsKey(num)) {
                frekuensiMap.put(num, frekuensiMap.get(num) + 1);
            } else {
                frekuensiMap.put(num, 1);
            }
        }

        // Menampilkan hasil
        System.out.println("\nFrekuensi kemunculan setiap angka:");
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
