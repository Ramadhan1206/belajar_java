package com.belajar2;

public class kuda extends Binatang {
    public void bersuara() {
        System.out.println("Ngieeeh");
    }

    public static void main(String[] args) {
        Binatang kuda_poni = new Binatang();
        kuda_poni.bersuara();
    }
}
