/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class ScanNer { //data mahasiswa
    // membahas masalah input dan output
    public static void main(String[] args) {
        
        String nama, prodi;
        int nim;
        //meembuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        //tampilkan output ke user
        System.out.println("=== Pendataan Mahasiswa ===");
        System.out.println("Nama Mahasiswa : ");
        //menggunakan scanner dan menyimpan apa yang di kettik di variabel nama
        nama = keyboard.nextLine();
        //tampilkan output lagi
        System.out.println("Program Studi : ");
        //menggunakan scanner lagi
        prodi = keyboard.nextLine();
        System.out.println("Nim : ");
        nim = keyboard.nextInt();
        
        //menampilkan apa yang sudah di simpan di variabel
        System.out.println("========================================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Nim : " + nim);
    }
}
