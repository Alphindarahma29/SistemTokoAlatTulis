package model;

import java.util.ArrayList;
import java.util.Date;

public class Transaksi 
{
    private Integer id_transaksi;
    private Integer jumlah_barang;
    private Integer total_harga;
    private Integer jumlah_pembayaran;
    private Integer jumlah_kembalian;
    private ArrayList <Detail_Transaksi> arrDetail_Transaksi;

    public Integer getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(Integer id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public Integer getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(Integer jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public Integer getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Integer total_harga) {
        this.total_harga = total_harga;
    }

    public Integer getJumlah_pembayaran() {
        return jumlah_pembayaran;
    }

    public void setJumlah_pembayaran(Integer jumlah_pembayaran) {
        this.jumlah_pembayaran = jumlah_pembayaran;
    }

    public Integer getJumlah_kembalian() {
        return jumlah_kembalian;
    }

    public void setJumlah_kembalian(Integer jumlah_kembalian) {
        this.jumlah_kembalian = jumlah_kembalian;
    }

    public ArrayList<Detail_Transaksi> getArrDetail_Transaksi() {
        return arrDetail_Transaksi;
    }

    public void setArrDetail_Transaksi(ArrayList<Detail_Transaksi> arrDetail_Transaksi) {
        this.arrDetail_Transaksi = arrDetail_Transaksi;
    }
    
    
    
}
