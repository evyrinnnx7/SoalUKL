package com.mycompany.soaluklno1;

import java.util.Scanner;

public class SoalUKLNo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User memasukkan angka awal Fibonacci
        System.out.print("Masukkan angka awal Fibonacci: ");
        int a = input.nextInt();

        // User memasukkan jumlah elemen Fibonacci
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();
        while (n <= 0) {
            System.out.print("Jumlah elemen harus lebih dari 0, masukkan lagi: ");
            n = input.nextInt();
        }

        int b = 1; // Untuk memulai deret Fibonacci dari angka awal
        int ganjil = 0, genap = 0;

        System.out.println("\nDeret Fibonacci:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            // Hitung ganjil & genap
            if (a % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }

            // Update nilai Fibonacci
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\nJumlah bilangan ganjil : " + ganjil);
        System.out.println("Jumlah bilangan genap  : " + genap);

        input.close();
    }
}
