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
public class dosen {
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public String getMataKuliah(){
        return mataKuliah;
    }
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun sedang mengejar matakuliah PBO");
    }
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
