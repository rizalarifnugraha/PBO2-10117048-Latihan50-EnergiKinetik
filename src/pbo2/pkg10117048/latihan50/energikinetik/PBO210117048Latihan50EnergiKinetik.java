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
public class PBO210117048Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola ball = new Bola();
        ball.setMassa(145);
        ball.setKecepatan(25);
        System.out.println("Sebuah bola baseball memiliki massa = " 
                + ball.getMassa() + " g");
        System.out.println("lalu dilempar dengan kecepatan = "
                + ball.getKecepatan() + " m/s");

        double massa = ball.getMassa();
        double kecepatan = ball.getKecepatan();

        System.out.println("A. Maka nilai Energi Kinetik = " 
                            + ball.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + ball.usaha());
        System.out.println("Catatan : Nilai usaha bernilai tetap,karena kecepatan bola dimulai dari keadaan diam");
    }

}
