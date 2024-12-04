/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatu1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class sepatu {
    int hari; // Lama pengerjaan
    int hargaPerPasang; // Harga cuci per pasang sepatu
    double totalHarga; // Total harga cuci

    // Constructor untuk menentukan harga cuci per pasang
    public sepatu(int hargaPerPasang) {
        this.hargaPerPasang = hargaPerPasang;
        System.out.println("Harga per pasang sepatu: Rp " + hargaPerPasang);
    }

    // Constructor untuk menghitung total biaya berdasarkan jumlah hari dan harga per pasang
    public sepatu(int hargaPerPasang, int hari) {
        this.hargaPerPasang = hargaPerPasang;
        this.hari = hari;
        int totalBiaya = hargaPerPasang * hari;
        System.out.println("Total biaya cuci sepatu: Rp " + totalBiaya);
    }

    // Menu pilihan utama
    public static void pilihan() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Cuci Sepatu Biasa");
        System.out.println("2. Cuci Sepatu Khusus");
        System.out.println("Silahkan pilih layanan: ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1 -> sepatu.cuciBiasa();
            case 2 -> sepatu.cuciKhusus();
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    // Layanan cuci sepatu biasa
    public static void cuciBiasa() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Jenis Sepatu");
        System.out.println("====================");
        System.out.println("1. Sneakers");
        System.out.println("2. Sandal");
        System.out.println("3. Formal Shoes");
        System.out.println("4. Boots");
        System.out.println("Masukkan Pilihan: ");
        int pilih1 = input.nextInt();
        switch (pilih1) {
            case 1 -> {
                sepatu sneakers = new sepatu(50000);
                sneakers.tampilCuci();
            }
            case 2 -> {
                sepatu sandal = new sepatu(30000);
                sandal.tampilCuci();
            }
            case 3 -> {
                sepatu formal = new sepatu(40000);
                formal.tampilCuci();
            }
            case 4 -> {
                sepatu boots = new sepatu(60000);
                boots.tampilCuci();
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    // Layanan cuci sepatu khusus
    public static void cuciKhusus() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Jenis Sepatu");
        System.out.println("====================");
        System.out.println("1. Sneakers Premium");
        System.out.println("2. Sepatu Kulit");
        System.out.println("3. Sepatu Hiking");
        System.out.println("4. Sepatu Olahraga");
        System.out.println("Masukkan Pilihan: ");
        int pilih2 = input.nextInt();
        switch (pilih2) {
            case 1 -> {
                sepatu premium = new sepatu(80000, 1);
                premium.tampilCuci();
            }
            case 2 -> {
                sepatu kulit = new sepatu(70000, 1);
                kulit.tampilCuci();
            }
            case 3 -> {
                sepatu hiking = new sepatu(90000, 1);
                hiking.tampilCuci();
            }
            case 4 -> {
                sepatu olahraga = new sepatu(75000, 1);
                olahraga.tampilCuci();
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    // Menampilkan total biaya untuk cuci sepatu
    void tampilCuci() {
        int jumlahSepatu;
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah pasang sepatu: ");
        int jumlah = input.nextInt();
        jumlahSepatu = jumlah * hargaPerPasang;
        System.out.println("Anda memilih layanan cuci sepatu.");
        System.out.println("Total harga cuci sepatu: Rp " + jumlahSepatu);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Selamat datang di Layanan Cuci Sepatu");
        sepatu.pilihan();
    }
}
