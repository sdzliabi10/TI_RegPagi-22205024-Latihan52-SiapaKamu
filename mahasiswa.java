/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan52_Siapa_Kamu;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menampilkan nama dan profesi
 */
public class mahasiswa {
    private String nim;
    private String kelas;
    
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getKelas(){
        return kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2 ");
    }
    public void siapaKamu(){
        System.out.println("Saya mahasiswa");
    }
}
