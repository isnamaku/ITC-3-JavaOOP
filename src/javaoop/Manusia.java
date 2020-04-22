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
public class Manusia implements Bernyanyi{
    String nama;
    String ktp;
    int umur;
    
    public Manusia (String nama){
        this.nama=nama;
       
    }
    public void makan (){
        System.out.println("sedang makan");
    }
    public void makan (String nama){
        System.out.println(nama + "sedang makan");
    }
    public void makan (String nama, int umur){
        System.out.println(nama + " yang sekarang berumur " + umur+ " sedang makan");
    }
     public void tidur(String nama){
         System.out.println(" sedang tidur");
     }

    @Override
    public void bernada() {
        System.out.println(nama+"bernyanyi");
    }

    @Override
    public void berjoget(String gerakan) {
        System.out.println("joget "+gerakan);
    }
    
}
