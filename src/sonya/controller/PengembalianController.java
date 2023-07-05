/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.controller;

import java.sql.Connection;
import sonya.dao.AnggotaDao;
import sonya.dao.AnggotaDaoImpl;
import sonya.dao.BukuDao;
import sonya.dao.BukuDaoImpl;
import sonya.dao.Koneksi;
import sonya.dao.PeminjamanDao;
import sonya.dao.PeminjamanDaoImpl;
import sonya.dao.PengembalianDao;
import sonya.dao.PengembalianDaoImpl;
import sonya.model.Pengembalian;
import sonya.view.FormPengembalian;

/**
 *
 * @author Axioo
 */
public class PengembalianController {
    FormPengembalian formpengembalian;
    AnggotaDao anggotaDao;
    BukuDao bukuDao;
    PeminjamanDao peminjamanDao;
    PengembalianDao pengembalianDao;
    Pengembalian pengembalian;
    Connection connection;
    
    public PengembalianController(FormPengembalian formpengembalian){
        //this.formPengembalian = FormPengembalian();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        pengembalianDao = new PengembalianDaoImpl();
        Koneksi k = new Koneksi();
        //connection = k.getConnection();
        
    }
    
}
