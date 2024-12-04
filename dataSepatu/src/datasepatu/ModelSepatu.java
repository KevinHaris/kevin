/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datasepatu;


public class ModelSepatu {
    private String nama;
    private int ukuran;
    private String warna;
    private boolean jenis;
    
    public Model    Sepatu(String nama, int ukuran, String warna, boolean jenis) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.warna = warna;
        this.jenis = jenis;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public int getUkuran(){
        return ukuran;
    }
    public void setUkuran (int ukuran){
        this.ukuran = ukuran;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna (String warna){
        this.warna = warna;
    }
    public boolean isJenis(){
        return jenis;
    }
    public void setJenis (boolean){
        this.jenis = jenis;
    }
}
