package com.belajar;

//latihan void method
public class mobil {
    String warna;
    int tahunproduksi;
    int nomor_mesin;
    int nomor_rangka;

    public static void main(String[] args) {
        mobil mobilNiaga = new mobil();
        // pemanggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }

    // Mengisi variabel instance
    void isi() {
        warna = "Merah";
        tahunproduksi = 2018;
        nomor_mesin = 12345;
        nomor_rangka = 8967;
    }

    // Menampilkan isi variabel
    void tampil() {
        System.out.println("Warna :" + warna);
        System.out.println("Tahun produksi : " + tahunproduksi);
        System.out.println("Nomor Mesin :" + nomor_mesin);
        System.out.println("Nomor Rangka :" + nomor_rangka);
    }
}
