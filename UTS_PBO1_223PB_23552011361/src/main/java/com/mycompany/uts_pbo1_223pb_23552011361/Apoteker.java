/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
public class Apoteker extends TenagaKesehatan {
    
    public Apoteker(String nama, String nomorRegistrasi){
        super(nama, nomorRegistrasi);
    }
    void pemberianObat(Pasien pasien, Dokter dokter){
        System.out.println("Apoteker " + nama + " telah memberi obat yang di resepkan oleh Dokter " + dokter.nama + ", kepada pasien : " + pasien.getNamaPasien());
    }
    @Override
    void tambahPasien(Pasien pasien){
        //System.out.println("Perawat " + nama + " menambahkan pasien bernama : " + pasien.getNamaPasien());
}
    @Override
    void jadwalPemeriksaan(Pasien pasien, String tanggal){
       // System.out.println("Perawat " + nama + " menjadwalkan pemeriksan pasien atas nama : " + pasien.getNamaPasien() + ", Pada tanggal : " + tanggal);
    }
}
