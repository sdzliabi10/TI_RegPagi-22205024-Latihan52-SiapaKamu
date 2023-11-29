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
public class manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
