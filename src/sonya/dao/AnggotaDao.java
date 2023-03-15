/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.dao;

import java.sql.Connection;
import sonya.model.Anggota;

/**
 *
 * @author SONYA HASNA HAFIZAH
 */
public interface AnggotaDao{
    void insert(Connection con, Anggota anggota) throws Exception;
}
