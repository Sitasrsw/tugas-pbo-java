/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class ProgramPenghitungCalculator {
   public static void main(String [] Args){
       
       double Penjumlahan;
       int Perkalian;
       int Pengurangan;
       int Pembagian;
       
       Calculator penghitung = new Calculator();
       Penjumlahan = penghitung.getPenjumlahan(18, 13);
       Perkalian = penghitung.getPerkalian(9, 6);
       Pengurangan = penghitung.getPengurangan(45, 23);
       Pembagian = penghitung.getPembagian (60, 4);
       
       System.out.println("Hasil Penjumlahan adalah "+Penjumlahan);
       System.out.println("Hasil Perkalian adalah "+Perkalian);
       System.out.println("Hasil Pengurangan adalah "+Pengurangan);
       System.out.println("Hasil Pembagian adalah "+Pembagian);
       
   }
}
