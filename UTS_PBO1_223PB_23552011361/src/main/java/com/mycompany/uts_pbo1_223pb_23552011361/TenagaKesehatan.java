/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
abstract class TenagaKesehatan {
   protected String nama;
   protected String nomorRegistrasi;
   
   public TenagaKesehatan(String nama, String nomorRegistrasi){
       this.nama=nama;
       this.nomorRegistrasi=nomorRegistrasi;
   }
   
   abstract void tambahPasien(Pasien pasien);
   abstract void jadwalPemeriksaan(Pasien pasien, String tanggal);
}
