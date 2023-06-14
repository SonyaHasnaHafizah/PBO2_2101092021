/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.model;

/**
 *
 * @author Axioo
 */
public class Penjualan {
    private String kodepesanan;
    private String tgl;
    private String namapemesan;
    private String totalbayar;
    private String ongkoskirim;
    private String diskon;
    
    public  Penjualan (){
        
    }

    public Penjualan(String kodepesanan, String tgl, String namapemesan, String totalbayar, String ongkoskirim, String diskon) {
        this.kodepesanan = kodepesanan;
        this.tgl = tgl;
        this.namapemesan = namapemesan;
        this.totalbayar = totalbayar;
        this.ongkoskirim = ongkoskirim;
        this.diskon = diskon;
    }

    public String getKodepesanan() {
        return kodepesanan;
    }

    public void setKodepesanan(String kodepesanan) {
        this.kodepesanan = kodepesanan;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getNamapemesan() {
        return namapemesan;
    }

    public void setNamapemesan(String namapemesan) {
        this.namapemesan = namapemesan;
    }

    public String getTotalbayar() {
        return totalbayar;
    }

    public void setTotalbayar(String totalbayar) {
        this.totalbayar = totalbayar;
    }

    public String getOngkoskirim() {
        return ongkoskirim;
    }

    public void setOngkoskirim(String ongkoskirim) {
        this.ongkoskirim = ongkoskirim;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }
    
    
}
