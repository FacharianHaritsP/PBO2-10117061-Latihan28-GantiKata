/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan28;

import java.util.Scanner;

/**
 *Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan kata pengganti yang di inginkan oleh user
 */
public class PBO210117061Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String kata1;
        String kata2;
        String kata3;

        Scanner scan = new Scanner(System.in);

        System.out.println("===Program Mengganti Kalimat===");
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kata1 = scan.nextLine();
        System.out.print("Ganti Kata : ");
        kata2 = scan.next();
        System.out.print("Menjadi Kata : ");
        kata3 = scan.next();

        //Proses Penggantian kata
        System.out.println("");
        System.out.println("===HAsil Formatting===");
        System.out.println("Kalimat awal : " + kata1);
        String kataBaru = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru : " + kataBaru);

    }

}
