package com.belajar;

// Latihan method non void
public class mobilku {
    String warnal;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;

    // Method mengisi variabel instance
    void isi(String warnal, int tahun_produksi, int nomorMesin, int nomorRangka) {
        this.warnal = warnal;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }

    // Method menampilkan isi variabel
    String ambil_warna() {
        return warnal;
    }

    int ambil_tahun_produksi() {
        return tahun_produksi;
    }

    int ambil_nomorMesin() {
        return tahun_produksi;
    }

    int ambil_nomorRangka() {
        return nomorRangka;
    }

    public static void main(String[] args) {
        mobilku mobilNiaga = new Mobilku();
        // Proses pemanggilan method void
        mobilNiaga.isi("putih", 2018, 23456,
                89567);
        System.out.println("warna : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun produksi : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Rangka : " + mobilNiaga.ambil_nomorRangka());
    }
}
