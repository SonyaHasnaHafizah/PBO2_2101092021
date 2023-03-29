/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.dao;

import java.sql.Connection;
import java.util.List;
import sonya.model.Anggota;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public interface AnggotaDao{
    void insert(Connection con, Anggota anggota) throws Exception;
    public void update(Connection con,sonya.model.Anggota anggota) throws Exception;
    public void delete(Connection con,sonya.model.Anggota anggota) throws Exception;
    public sonya.model.Anggota getAnggota(Connection con,String kode) throws Exception;
    public List<sonya.model.Anggota> getAllAnggota(Connection con) throws Exception;
}
