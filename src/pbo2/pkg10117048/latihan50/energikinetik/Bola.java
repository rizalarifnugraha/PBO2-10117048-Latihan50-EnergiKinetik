/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan50.energikinetik;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi tentang menghitung nilai energi 
 *                     kinetik dan nilai usahanya.
 */
public class Bola {

    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik1(double m, double k) {
        energikinetik1 = 0.5 * m * (k * k);
        return energikinetik1;
    }

    public void hitungEnergiKinetik2(double m) {
        this.energikinetik2 = 0.5 * m * 0;
    }

    public double usaha() {
        return energikinetik1 - energikinetik2;
    }
}
