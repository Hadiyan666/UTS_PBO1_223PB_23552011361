/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
public class Perawat extends TenagaKesehatan{
    public Perawat(String nama, String nomorRegistrasi){
        super(nama, nomorRegistrasi);
    }
    
    void pemeriksaanSuhu(Pasien pasien){
        System.out.println("Perawat sedang melakukan Pemeriksaan Suhu pasien :" + pasien.getNamaPasien());
    }
    
    @Override
    void tambahPasien(Pasien pasien){
        System.out.println("Perawat " + nama + " menambahkan pasien bernama : " + pasien.getNamaPasien());
}
    @Override
    void jadwalPemeriksaan(Pasien pasien, String tanggal){
        System.out.println("Perawat " + nama + " menjadwalkan pemeriksan pasien atas nama : " + pasien.getNamaPasien() + ", Pada tanggal : " + tanggal);
    }
    void HasilPemeriksaan(Pasien pasien, Dokter dokter){
         System.out.println("Perawat " + nama + " menyatakan bahwa hasil pemeriksaan pasien : " + pasien.getNamaPasien() + ", Adalah sudah di periksa, Silahkan menunggu Pemeriksaan dari Dokter " + dokter.nama );
    }
}