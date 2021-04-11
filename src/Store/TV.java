/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Package dari class
package Store;

/**
 *
 * @author Yusuf Isra
 */
//Class Menggunakan extends kepada class Toko untuk bisa mendapatkan jenis variabel dari class Toko
public class TV extends Toko {

    //Menentukan jenis variabel baru (jenis)
    String jenis;

    //Menggunakan"@Override" supaya nama method yang sama berlaku di class lain dalam 1 package yang sama    
    @Override
    
    //Method Display untuk awal dari output data TV
    public void Display() {
        System.out.println("---------------------------------");
        System.out.println("DATA TV : ");
    }

    //Method parameter untuk mendapatkan harga dari class Main
    public void setHarga(int harga) {
        //super untuk mengambil jenis variabel dari class Toko
        super.harga = harga;
    }

    //Method untuk mencetak hasil dari parameter
    public int getHarga() {
        System.out.println("Harga : " + "Rp."+ harga);
        //return untuk menghubungkan method getHarga dan setHarga
        return harga;
    }

    public void setTotal(int total) {
        super.total = total;
    }

    public int getTotal() {
        System.out.println("Total barang yang dibeli : " + total);
        return total;
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        System.out.println("Merk barang yang dibeli : " + merk);
        return merk;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        System.out.println("Jenis TV (TV Tabung/LED) : " + jenis);
        return jenis;
    }
}
