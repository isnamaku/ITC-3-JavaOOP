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
public class Mahasiswa extends Manusia {
//    private String nama;
    private  String nim;
    private double IPK;
    
   public Mahasiswa (String nama, String nim, double IPK){
       super(nama);
//       this.nama= nama;
       this.nim = nim;
       this.IPK = IPK;
       
   }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        super.nama=nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    void belajar(){
        System.out.println("sedang belajar");
    }
    void doTugas(){
        System.out.println(nama + "lagi ngerjain tugas");
    }
    
    void tidur(){
        super.tidur(nama);
    }
}
