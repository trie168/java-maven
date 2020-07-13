package com.trie.bootcamp.latihan1;

public class Persegi {

    /*
     * buat kelas dengan nama Persegi Program menghitung persegi -Buatlah variable
     * dengan nama sisi dengan tipe data java.lang.Double kemudian berikan nilai 50
     * -Berdasarkan variable tersebut buatlah untuk menghitung luas persegi tersebut
     * -Dan tampilkan ke layar console seperti berikut Dengan sisi 50cm maka luas
     * persegi tersebut adalah 25m
     */

    public static void main(String[] args) {
        Double sisi = 50d;
        Integer pangkat = 2;
        Double hasil;

        hasil = Math.pow(sisi, pangkat);
        hasil = hasil / 100;

        System.out.println("sisi 50cm maka luas persegi tersebut adalah " + hasil + "m");
    }
}