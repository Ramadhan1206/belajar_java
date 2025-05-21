package com.belajar;

public class motor {
    private String warna;

    public void jalankan() {
        System.out.println("Masukan gigi 1, lepaskan kopling sambil tekan gas");
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getwarna(String warna) {
        return this.warna;
    }
}