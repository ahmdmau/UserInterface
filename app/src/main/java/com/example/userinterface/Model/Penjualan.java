package com.example.userinterface.Model;

public class Penjualan {
    String tanggal,pelanggan,meja,total,driver,jam,harga;

    public Penjualan(String tanggal, String pelanggan, String meja, String total, String driver, String jam, String harga) {
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.meja = meja;
        this.total = total;
        this.driver = driver;
        this.jam = jam;
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getMeja() {
        return meja;
    }

    public void setMeja(String meja) {
        this.meja = meja;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
