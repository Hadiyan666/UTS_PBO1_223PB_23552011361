/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo1_223pb_23552011361;

/**
 *
 * @author M Yanuar Fadhilah
 */
public class Pasien {
    private String nama_pasien;
    private String riwayatPenyakit;
    private String hasil;
    
    public Pasien(String nama_pasien){
        this.nama_pasien=nama_pasien;
    }
    
    public String getNamaPasien(){
    return nama_pasien;            
    }
    
    public String getRiwayatPenyakit(){
    return riwayatPenyakit;
    }
    
    public void setRiwayatPenyakit(String riwayat_penyakit){
        this.riwayatPenyakit=riwayat_penyakit;
    }
         public String getHasil(){
        return hasil;
    }
    
    public void setHasil(String hasil){
        this.hasil=hasil;
    }
    

}
