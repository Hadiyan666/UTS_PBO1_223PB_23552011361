/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
public class UTS_PBO1_223PB_23552011361 {

    public static void main(String[] args) {
        System.out.println("==== Aplikasi Manajemen Rumah Sakit ====");
        System.out.println("Nama  : Muhammad Hadiyan Rakhmadi");
        System.out.println("NPM   : 23552011361");
        System.out.println("Kelas : 223 PB");
        //==== MEMBUAT OBJEK PASIEN, DOKTER & PERAWAT====
        //Membuat Objek Pasien
        Pasien pasien1 = new Pasien("Asep");
        pasien1.setRiwayatPenyakit("TBC");
        Pasien pasien2 = new Pasien("Jajang");
        pasien2.setRiwayatPenyakit("Ashtma Kronis");
       
        //Membuat Objek tenaga medis
        Dokter dokter1 = new Dokter("Hadiyan","H134","Spesialisasi Paru-Paru");
        Perawat perawat1 = new Perawat("Marsya","M221");
        Apoteker apoteker1 = new Apoteker("Rhegiz","R134");
        System.out.println();
        System.out.println("=================================================");
        System.out.println("=== IMPLEMENTASI METODE PADA PERAWAT ===");
        System.out.println();
        perawat1.tambahPasien(pasien2);
        perawat1.jadwalPemeriksaan(pasien2, "2024 - 11 -30");
        perawat1.pemeriksaanSuhu(pasien2);
        pasien2.setHasil("Sudah Membaik");
        perawat1.HasilPemeriksaan(pasien2, dokter1);
        System.out.println();
        System.out.println("==== IMPLEMENTASI METODE PADA DOKTER ====");
        System.out.println();
        System.out.println("==== PASIEN 1 ====");
        dokter1.tambahPasien(pasien1);
        dokter1.jadwalPemeriksaan(pasien1, "2024 - 11 - 29");
        dokter1.pemeriksaanParuParu(pasien1);
        pasien1.setHasil("Masih Perlu Berobat");
        dokter1.HasilPemeriksaan(pasien1, pasien1.getHasil());
        dokter1.obatPasien(pasien1);
        System.out.println("==== PASIEN 2 ====");
        dokter1.pemeriksaanParuParu(pasien2);
        pasien2.setHasil("Sudah Membaik");
        dokter1.HasilPemeriksaan(pasien2, pasien2.getHasil());
        dokter1.obatPasien(pasien2); 
        System.out.println();

        System.out.println("=== IMPLEMENTASI METODE PADA APOTEKER ===");
        System.out.println();
        apoteker1.pemberianObat(pasien1, dokter1);
        apoteker1.pemberianObat(pasien2, dokter1);
        System.out.println("====COPYRIGHT BY : 23552011361 | Muhammad Hadiyan Rakhmadi | 223 PB ====");
      }
            
}
