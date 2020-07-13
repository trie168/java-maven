package com.trie.bootcamp.latihan1;

public class PersegiPanjang {
    private static Integer panjang, tinggi;
    public static void main(String[] args) {
        panjang = 10;
        tinggi = 5;
        Integer hasil;

        hasil = panjang *tinggi;

        System.out.println(String.format("Tinggi %s cm, dan Panjang %s cm. Maka luas persegi panjang adalah %s cm", panjang, tinggi, hasil));
    }
}