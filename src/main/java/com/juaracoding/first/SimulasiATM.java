package com.juaracoding.first;

import java.util.Scanner;

public class SimulasiATM {
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        
        if (username.equals("admin") && password.equals("admin")) {
            double saldo = 0;
            menuApp(saldo, scanner);
        } else {
            System.out.println("Gagal login! Username/password salah.");
        }
        scanner.close();
    }

    public static void menuApp(double saldo, Scanner scanner) {
        int pilihan;
        
        do {
            System.out.println("\n===== M e n u =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    cekSaldo(saldo);
                    break;
                case 2:
                    saldo = setor(saldo, scanner);
                    System.out.println("Saldo sekarang: Rp " + saldo);
                    break;
                case 3:
                    saldo = tarik(saldo, scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    public static void cekSaldo(double saldo) {
        System.out.println("Saldo Anda: Rp " + saldo);
    }

    public static double setor(double saldo, Scanner scanner) {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan jumlah setor: Rp ");
        double jumlah = scanner.nextDouble();
        return saldo + jumlah;
    }

    public static double tarik(double saldo, Scanner scanner) {
        scanner.nextLine(); // Clear buffer
        System.out.print("Masukkan jumlah tarik: Rp ");
        double jumlah = scanner.nextDouble();
        
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil. Saldo sekarang: Rp " + saldo);
        }
        return saldo;
    }
}
