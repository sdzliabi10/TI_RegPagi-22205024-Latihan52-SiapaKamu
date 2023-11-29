/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspert11_Latihan52_Siapa_Kamu;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi menampilkan nama dan profesi
 */
public class PBO_22205024_Latihan52_SiapaKamu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        dosen dosen = new dosen();
        System.out.println("NIP DOSEN : 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        mahasiswa mahasiswa = new mahasiswa();
        System.out.println("NIM MAHASISWA : 10110269");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
