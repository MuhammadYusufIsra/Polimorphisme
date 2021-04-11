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
public class Main {

    //Class atau method main yang digunakan untuk menjalankan program tanpa harus disuruh/dipanggil (otomatis)
    public static void main(String[] args) {
        //Pembuatan Objek dari setiap class
        Toko class1 = new Toko();
        Smartphone class2 = new Smartphone();
        TV class3 = new TV();
        KipasAngin class4 = new KipasAngin();

        //Memanggil method setAdmin - Display dari class/file Toko.java
        class1.setAdmin("@Toko Elektro-Man");
        class1.getAdmin();
        class1.Display();

        //Memanggil method Display - getKamera dari class/file Smartphone.java
        class2.Display();
        class2.setHarga(10000000);
        class2.getHarga();
        class2.setTotal(1);
        class2.getTotal();
        class2.setMerk("Oppo Find X2 Pro");
        class2.getMerk();
        class2.setKamera(2);
        class2.getKamera();

        //Memanggil method Display - getJenis dari class/file TV.java
        class3.Display();
        class3.setHarga(2300000);
        class3.getHarga();
        class3.setTotal(1);
        class3.getTotal();
        class3.setMerk("POLYTRON LED TV 32 INCH 32 T 7511 + TOWER SPEAKER");
        class3.getMerk();
        class3.setJenis("LED");
        class3.getJenis();

        //Memanggil method Display - getDiameter dari class/file KipasAngin.java
        class4.Display();
        class4.setHarga(220000);
        class4.getHarga();
        class4.setTotal(1);
        class4.getTotal();
        class4.setMerk("Kipas Angin (Stand) 16-XDC Black");
        class4.getMerk();
        class4.setDiameter(16);
        class4.getDiameter();

        //Memanggil method Display2 dari class/file Toko.java
        class1.Display2();
    }
}
