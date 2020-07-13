
package com.trie.bootcamp.latihan1;

public class Lingkaran {
    
    public static void main(String[] args) {
        Integer jariJari = 15;
        Integer diameter = jariJari * 2;
        Double phi = Math.PI;

        Double hasil = phi * diameter;

        System.out.println(String.format("Nilai PI %.2f, maka kelilingnya adalah %.2f", phi, hasil));
    }
}