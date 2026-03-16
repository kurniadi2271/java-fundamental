package com.juaracoding;

import org.testng.annotations.*;

import com.juaracoding.second.Divisi;
import com.juaracoding.second.Karyawan;

import static org.testng.Assert.*;

public class HRSystemTest {
    @Test
    public void testSistemLengkap() {
        Divisi divisiIT = new Divisi("IT Division");
        
        // Buat karyawan dan test gaji
        Karyawan manager = new Karyawan("Budi", "Manager", 10000000);
        Karyawan staff = new Karyawan("Ani", "Staff", 5000000);
        
        assertEquals(manager.hitungGajiTotal(), 15000000, 0.01);
        assertEquals(staff.hitungGajiTotal(), 7000000, 0.01);
        
        // Update gaji
        manager.updateGaji(10);
        // Gaji pokok naik 10% -> 11.000.000, total dengan tunjangan Manager (5.000.000) = 16.000.000
        assertEquals(manager.hitungGajiTotal(), 16000000, 0.01);
        
        // Tambah ke divisi
        divisiIT.tambahKaryawan(manager);
        divisiIT.tambahKaryawan(staff);
        assertEquals(divisiIT.getJumlahKaryawan(), 2);
    }
}
