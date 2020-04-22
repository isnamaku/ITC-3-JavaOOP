/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa naruto = new Mahasiswa ("sakura","1231800609",4.0);
//        naruto.nama = "uzumaki";
//        naruto.nim = "123180063";
//        naruto.IPK =4.0;
//        
//        naruto.setNama("naruto");
//        naruto.setNim("123180063");
//        naruto.setIPK(4.0);
        
//        System.out.println("Nama : "+naruto.getNama());
//        System.out.println("Nim : "+ naruto.getNim());
//        System.out.println("IPK : "+naruto.getIPK());
//        naruto.belajar();
//        naruto.doTugas();
        
        Manusia manusia = new Manusia ("Luffy");
        Mahasiswa mahasiswa = new Mahasiswa ("Rorona","123180077",2.0);
        mahasiswa.ktp = "1238999";
        
        System.out.println("nama :"+ mahasiswa.nama);
        
        manusia.makan("rukia");// makan (String nama)
        manusia.makan("rukia", 20);//  makan (String nama,int umur)
        
        mahasiswa.berjoget("tiktok");
        
    }
}