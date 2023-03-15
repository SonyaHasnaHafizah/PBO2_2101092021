/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.controller;

import java.sql.Connection;
import java.sql.SQLException;
import static javafx.scene.input.KeyCode.L;
import static javafx.scene.input.KeyCode.P;
import sonya.dao.AnggotaDao;
import sonya.dao.AnggotaDaoImpl;
import sonya.dao.Koneksi;
import sonya.model.Anggota;
import sonya.view.FormAnggota;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    private Connection con;
    private Koneksi koneksi;
    
    public AnggotaController(FormAnggota formanggota) throws ClassNotFoundException, SQLException{
        this.formAnggota = new FormAnggota();
        anggotaDao = new AnggotaDaoImpl();
        con = new Koneksi().getKoneksi();
    }
    
    public void bersihForm(){
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        
        
        
    }
    
    public void isiCboJenisKelamin(){
            formAnggota.getCboJenisKelamin().removeAllItems();
            formAnggota.getCboJenisKelamin().addItem("L");
            formAnggota.getCboJenisKelamin().addItem("P");
            
        }
}
