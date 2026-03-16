package com.juaracoding;

import org.testng.annotations.*;

import com.juaracoding.second.Karyawan;

import static org.testng.Assert.*;

public class KaryawanTest {
    private Karyawan manager;
    private Karyawan staff;
    private Karyawan lainnya;
    
    @BeforeClass
    public void setUp() {
        manager = new Karyawan("Budi", "Manager", 10000000);
        staff = new Karyawan("Ani", "Staff", 5000000);
        lainnya = new Karyawan("Citra", "Programmer", 7000000);
    }
    
    @Test(priority = 1)
    public void testHitungGajiTotalManager() {
        double expected = 10000000 + 5000000;
        double actual = manager.hitungGajiTotal();
        assertEquals(actual, expected, 0.01, "Gaji total Manager salah");
    }
    
    @Test(priority = 2)
    public void testHitungGajiTotalStaff() {
        double expected = 5000000 + 2000000;
        double actual = staff.hitungGajiTotal();
        assertEquals(actual, expected, 0.01, "Gaji total Staff salah");
    }
    
    @Test(priority = 3)
    public void testHitungGajiTotalLainnya() {
        double expected = 7000000 + 0;
        double actual = lainnya.hitungGajiTotal();
        assertEquals(actual, expected, 0.01, "Gaji total jabatan lain salah");
    }
    
    @Test(priority = 4)
    public void testUpdateGajiPersentasePositif() {
        double gajiAwal = manager.getGajiPokok();
        manager.updateGaji(10);
        double expected = gajiAwal * 1.10;
        assertEquals(manager.getGajiPokok(), expected, 0.01, "Update gaji 10% salah");
    }
    
    @Test(priority = 5)
    public void testUpdateGajiPersentaseNol() {
        Karyawan karyawan = new Karyawan("Test", "Staff", 5000000);
        double gajiAwal = karyawan.getGajiPokok();
        karyawan.updateGaji(0);
        assertEquals(karyawan.getGajiPokok(), gajiAwal, 0.01, "Update gaji 0% harus sama");
    }
}
