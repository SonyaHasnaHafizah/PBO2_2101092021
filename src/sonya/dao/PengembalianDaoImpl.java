/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sonya.model.Pengembalian;

/**
 *
 * @author Axioo
 */
public class PengembalianDaoImpl implements PengembalianDao{

    @Override
    public void insert(Connection con, Pengembalian pengembalian) throws Exception {
        String sql = "insert into pengembalian value(?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTgldikembalikan());
        ps.setInt(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
    }

    @Override
    public void update(Connection con, Pengembalian pengembalian) throws Exception {
       String sql = "update pengembalian set tgldikembalikan=?, terlambat=?, denda=?"
                + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.setString(4, pengembalian.getTgldikembalikan());
        ps.setInt(5, pengembalian.getTerlambat());
        ps.setDouble(6, pengembalian.getDenda());
        ps.executeUpdate();
    }

    @Override
    public void delete(Connection con, Pengembalian pengembalian) throws Exception {
        String sql = "delete from pengembalian "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pengembalian.getKodeanggota());
        ps.setString(2, pengembalian.getKodebuku());
        ps.setString(3, pengembalian.getTglpinjam());
        ps.executeUpdate();
    }

    @Override
    public Pengembalian getPengembalian(Connection con, String kodeanggota, String kodebuku, String tglpinjam, String tgldikembalikan, String terlambat, String denda) throws Exception {
        String sql = "select * from pengembalian "
               + "where kodeanggota=? and kodebuku=? and tglpinjam=? and tgldikembalikan=? and terlambat=? and denda=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ps.setString(4, tgldikembalikan);
//        ps.setInt(5, terlambat);
//        ps.setDouble(6, denda);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if (rs.next()) {
            pengembalian = new Pengembalian();
            pengembalian.setKodeanggota(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTgldikembalikan(rs.getString(4));
            pengembalian.setTerlambat(rs.getInt(5));
            pengembalian.setDenda(rs.getDouble(6));
        }
        return pengembalian;
    }

    @Override
    public List<Pengembalian> getAllPengembalian(Connection con) throws Exception {
        String sql = "SELECT peminjaman.kodeanggota, anggota.namaanggota, peminjaman.kodebuku, buku.judul, peminjaman.tglpinjam, pengembalian.tgldikembalikan, "
                + "pengembalian.terlambat, pengembalian.denda FROM peminjaman INNER JOIN anggota ON peminjaman.kodeanggota = anggota.kodeanggota INNER JOIN buku ON "
                + "peminjaman.kodebuku = buku.kodebuku LEFT JOIN pengembalian ON "
                + "(peminjaman.kodeanggota = pengembalian.kodeanggota AND peminjaman.kodebuku=pengembalian.kodebuku AND peminjaman.tglpinjam = pengembalian.tglpinjam)";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        Pengembalian pengembalian = null;
        while (rs.next()) {
            pengembalian = new Pengembalian();
            pengembalian.setKodeanggota(rs.getString(1));
            pengembalian.setKodebuku(rs.getString(2));
            pengembalian.setTglpinjam(rs.getString(3));
            pengembalian.setTgldikembalikan(rs.getString(4));
            pengembalian.setTerlambat(rs.getInt(5));
            pengembalian.setDenda(rs.getDouble(6));
            list.add(pengembalian);
        }
        return list;
    }

    @Override
    public int getSelisihTanggal(Connection con, String tgl1, String tgl2) throws Exception {
        int hasil=0;
        String sql = "select datediff(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            hasil = rs.getInt(1);
        }
        return hasil;
    }
    
}
