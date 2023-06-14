/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import uts_b.dao.Koneksi;
import uts_b.dao.PenjualanDao;
import uts_b.dao.PenjualanDaoImpl;
import uts_b.model.Penjualan;
import uts_b.view.FormPenjualan;

/**
 *
 * @author Axioo
 */
public class PenjualanController {
    private FormPenjualan formPenjualan;
    private Penjualan penjualan;
    private PenjualanDao dao;
    private Connection con;
    private Koneksi K;
    private Object JOptionePane;
    
    public PenjualanController(FormPenjualan formPenjualan) throws SQLException{
        try {
            this.formPenjualan = formPenjualan;
            dao= new PenjualanDaoImpl();
            K = new Koneksi();
            con = K.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    /*public void clearForm(){
        formPenjualan.getTxtKodepesanan().setText("");
        formPenjualan.getTxtTgl().setText("");
        formPenjualan.getTxtNamapemesan().setText("");
        formPenjualan.getTxtTotalbayar().setText("");
        formPenjualan.getOngkoskirim().setText("");
        formPenjualan.getTxtDiskon().setText("");
        
           
    }
    
 
        public void insert(){
        
        try {
            penjualan = new Penjualan();
            penjualan.setKodepesanan(formPenjualan.getTxtKodepesanan().getText());
            penjualan.setTgl(formPenjualan.getTxtTgl().getText());
            penjualan.setNamapemesan(formPenjualan.getTxtNamapemesan().getText());
            penjualan.setTotalbayar(formPenjualan.getTxtTotalbayar().getText());
            penjualan.setOngkoskirim(formPenjualan.getOngkoskirim().getText());
            penjualan.setDiskon(formPenjualan.getTxtDiskon().getText());
        
            dao.insert(con,penjualan);
            JOptionPane.showMessageDialog(formPenjualan, "Entri Ok");
            
            
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
     }
        
     
     public void tampil(){
        try {
            DefaultTableModel tabel =(DefaultTableModel) formPenjualan.getTblPenjualan().getModel();
            tabel.setRowCount(0);
            List<Penjualan> list= dao.getAllPenjualan(con);
            for (Penjualan penjualan1 : list){
                Object[] row= {
                    penjualan1.getKodepesanan(),
                    penjualan1.getTgl(),
                    penjualan1.getNamapemesan(),
                    penjualan1.getTotalbayar(),
                    penjualan1.getOngkoskirim(),
                    penjualan1.getDiskon()
                            
                };
                tabel.addRow(row);
            }
        } catch (Exception ex) {
            Logger.getLogger(PenjualanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        } */
}
