/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.dao;

import java.sql.Connection;
import sonya.model.Anggota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public class AnggotaDaoImpl implements AnggotaDao{

    @Override
    public void insert(Connection con, Anggota anggota) throws Exception{
        String sql = "Insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.executeUpdate();
        
    }

    @Override
    public void update(Connection con, Anggota anggota) throws Exception {
       String sql =
                "Update anggota set namaanggota=?, alamat=?,"
                + "jeniskelamin=? where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.setString(2, anggota.getNamaAnggota());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getJenisKelamin());
        ps.executeUpdate();
    }

    @Override
    public void delete(Connection con, Anggota anggota) throws Exception {
        String sql = "delete from anggota"
                + "where kodeanggota = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKodeAnggota());
        ps.executeUpdate();
    }

    @Override
    public Anggota getAnggota(Connection con, String kode) throws Exception {
        String sql = "select * from Anggota"
                + "where kodeAnggota = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        sonya.model.Anggota anggota = null;
        if(rs.next()) {
            anggota = new sonya.model.Anggota();
            anggota.setKodeAnggota(rs.getString(1));
            anggota.setNamaAnggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));     
        }
        return anggota;    
    }

    @Override
    public List<Anggota> getAllAnggota(Connection con) throws Exception {
        String sql 
                = "select * from Anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<sonya.model.Anggota>  list = new ArrayList<>();
        sonya.model.Anggota anggota = null;
        while(rs.next()) {
            anggota = new sonya.model.Anggota();
            anggota.setKodeAnggota(rs.getString(1));
            anggota.setNamaAnggota(rs.getString(2));
            anggota.setAlamat(rs.getString(3));
            anggota.setJenisKelamin(rs.getString(4));
            list.add(anggota);
        }
        return list;    
    }
    
}
