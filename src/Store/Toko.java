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
public class Toko {

    //Menentukan jenis variabel
    //Untuk admin menggunakan private
    private String admin;
    int harga;
    int total;
    String merk;

    //Method untuk menentukan isi variabel menggunakan parameter
    public void setAdmin(String admin) {
        //supaya parameter admin bisa diakses untuk dicetak, maka harus menggunakan code this.admin = admin;
        this.admin = admin;
    }

    //Method untuk mencetak hasil dari parameter
    public String getAdmin() {
        System.out.println("---------------------------------");
        System.out.println("Nama Toko Online : " + admin);
        System.out.println("---------------------------------");
        //return untuk menghubungkan method getAdmin dan setAdmin
        return this.admin;
    }

    //Method untuk menampilkan judul
    public void Display() {
        System.out.println("\nBarang yang ditambah : ");
        System.out.println(" ");
    }

    //Method untuk menampilkan kata penutup di akhir output
    public void Display2() {
        System.out.println("\n---------------------------------");
        System.out.println("TERIMAKASIH SUDAH BERBELANJA");
        System.out.println("---------------------------------");
    }

}
