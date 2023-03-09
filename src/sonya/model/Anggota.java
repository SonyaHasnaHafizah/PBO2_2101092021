/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.model;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class Anggota {
    private String kodeanggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;

    public Anggota(){
        
    }

    public Anggota(String kodeanggota, String namaAnggota, String alamat, String jenisKelamin) {
        this.kodeanggota = kodeanggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    
    public String getKodeanggota() {
        return kodeanggota;
    }
    
    

    public void setKodeanggota(String kodeanggota) {
        this.kodeanggota = kodeanggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    
}
