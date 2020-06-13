/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class JO_Pane {
    public static void main(String[] args) {
        // I/O Versi Joption
        
        String inputNilai = JOptionPane.showInputDialog("Input Nilai Mahasiswa");
        int nilai = Integer.parseInt(inputNilai);
        if(nilai >= 91 && nilai <=100){
            System.out.println("A");
        }else if(nilai >= 86 && nilai <91){
            System.out.println("A-");
        }else if(nilai < 81 || nilai >=86)if(nilai >= 76 && nilai <81){
            System.out.println("B");
        }else if (nilai >= 71 && nilai <76){
            System.out.println("B-");
        }else if (nilai >= 66 && nilai <71){
            System.out.println("C+");
        }else if (nilai >= 61 && nilai <66){
            System.out.println("C");
        }else if (nilai >= 56 && nilai <61){
            System.out.println("C-");
        }else if (nilai >= 51 && nilai <56){
            System.out.println("D");
        }else if (nilai >=0 && nilai <51){
            System.out.println("E");
        }else{
            System.out.println("Nilai Salah");
            
        }else {
            System.out.println("B+");
        }
}
}
