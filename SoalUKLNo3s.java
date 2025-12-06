package com.mycompany.soaluklno3s;

import java.util.Scanner;

public class SoalUKLNo3s {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();

        // CEK ANGKA > 1000
        if (n > 1000) {
            System.out.println("Angka anda terlalu besar!");
            return; // langsung berhenti
        }

        int faktorial = 1;

        System.out.print("Proses: ");

        for (int i = 1; i <= n; i++) {
            faktorial *= i;

            System.out.print(i);

            if (i < n) {
                System.out.print(" x ");
            }
        }

        System.out.println("\nHasil faktorial dari " + n + " adalah: " + faktorial);

        input.close();
    }
}
