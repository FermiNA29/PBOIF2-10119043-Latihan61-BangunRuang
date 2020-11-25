/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan61.bangunruang;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program bangun ruang
 */
public class Bola extends BangunRuang{
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungVolume() {
        return (4 * phi * (jariJari * jariJari * jariJari))/3;
    }
    
    @Override
    public void tampilHasil() {
        System.out.printf("Volume Bola = %.1f \n", hitungVolume());
    }
}
