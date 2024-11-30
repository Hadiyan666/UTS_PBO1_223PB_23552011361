/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
public class Dokter extends TenagaKesehatan{
     public String spesialisasi; 
    public Dokter(String nama, String nomorRegistrasi, String spesialisasi){
        super(nama,nomorRegistrasi);
    }
    void HasilPemeriksaan(Pasien pasien, String hasil){
         System.out.println("Dokter " + nama + " menyatakan bahwa hasil pemeriksaan pasien : " + pasien.getNamaPasien() + ", Adalah : " + pasien.getHasil());
    }
    void pemeriksaanParuParu(Pasien pasien){
            System.out.println( "Dokter "+ nama +" sedang melakukan pemeriksaan Paru-Paru pasien : " + pasien.getNamaPasien());
    }
    @Override
    void tambahPasien(Pasien pasien){
        System.out.println("Dokter " + nama + " menambahkan pemeriksaan untuk " + pasien.getNamaPasien());
    }
    @Override
    void jadwalPemeriksaan(Pasien pasien, String tanggal) {
        System.out.println("Dokter " + nama + " menjadwalkan pemeriksaan untuk " + pasien.getNamaPasien() + ", pada " + tanggal);
    } 
     void obatPasien(Pasien pasien){
         System.out.println("Dokter " + nama +" telah memberi resep obat untuk pasien : " + pasien.getNamaPasien());
     }
    }

