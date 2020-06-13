/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class Buffer_Reader {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama ;
        String alamat;
        
        System.out.println("Masukkan Nama Anda : ");//melakkan input nama
           nama = br.readLine();
           System.out.println("Masukkan Alamat Anda : "); // melakukan input alamat
           alamat = br.readLine();
           System.out.println("====================");
           System.out.println("Nama Anda : " + nama); //menampilkan pesan nama
           System.out.println("Alamat Anda : " + alamat); //menampilkan pesan alamat
    }
}
