package com.juaracoding.second;

public class Karyawan {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    
    public Karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }
    
    public double hitungGajiTotal() {
        double tunjangan = 0;
        if ("Manager".equalsIgnoreCase(jabatan)) {
            tunjangan = 5000000;
        } else if ("Staff".equalsIgnoreCase(jabatan)) {
            tunjangan = 2000000;
        }
        return gajiPokok + tunjangan;
    }
    
    public void updateGaji(double persentase) {
        this.gajiPokok += this.gajiPokok * (persentase / 100);
    }
    
    public String getNama() { return nama; }
    public String getJabatan() { return jabatan; }
    public double getGajiPokok() { return gajiPokok; }
}
