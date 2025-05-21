package com.belajar;

import java.util.Scanner;

public class FormBiodata {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input Biodata
        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        String umur = scanner.nextLine();

        System.out.print("Kelas: ");
        String kelas = scanner.nextLine();

        System.out.print("Jenis Kelamin (Laki-laki/Perempuan): ");
        String jenisKelamin = scanner.nextLine();

        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print(" Asal Sekolah: ");
        String asalSekolah = scanner.nextLine();

        System.out.print("Hobi: ");
        String hobi = scanner.nextLine();

        System.out.print("Cita-cita: ");
        String citaCita = scanner.nextLine();

        // Menampilkan data yang dimasukkan
        System.out.println("\n--- Data yang Dimasukkan ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("Asal Sekolah: " + asalSekolah);
        System.out.println("Hobi: " + hobi);
        System.out.println("Cita-cita: " + citaCita);

        // Menutup scanner untuk menghindari kebocoran memori
        scanner.close();
    }
}