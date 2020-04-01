/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provis9_pratikum1;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String kelas;
    
    public void sebutkanNIM(){
        System.out.println("NIM saya adalah : " + getNim());
    }
    
    public void sebutkanNama(){
        System.out.println("Nama saya adalah : " + getNama());
    }
    
    public void sebutkanKelas(){
        System.out.println("Kelas saya adalah : " + getKelas());
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getKelas() {
        return kelas;
    }

   
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
    
