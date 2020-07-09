package com.trie.bootcamp.variable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TypeDataDate {
    
    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println(String.format("sekarang tanggal : %s", tanggalSekarang));

        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMMM-yyyy'T'HH:mm:ss");
        System.out.println(String.format("sekarang tanggal dan waktu sekarang : %s", dateFormat.format(tanggalDanWaktuSekarang)));

        LocalTime WaktuSekarang = LocalTime.now();
        System.out.println(String.format("sekarang waktu : %s", WaktuSekarang));
    }
}