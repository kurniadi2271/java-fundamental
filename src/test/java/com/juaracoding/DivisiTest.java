package com.juaracoding;

import org.testng.annotations.*;

import com.juaracoding.second.Divisi;
import com.juaracoding.second.Karyawan;

import static org.testng.Assert.*;

public class DivisiTest {
    private Divisi divisiIT;
    private Karyawan karyawan1, karyawan2, karyawan3;
    
    @BeforeClass
    public void setUp() {
        divisiIT = new Divisi("IT Division");
        karyawan1 = new Karyawan("Budi", "Manager", 10000000);
        karyawan2 = new Karyawan("Ani", "Staff", 5000000);
        karyawan3 = new Karyawan("Citra", "Staff", 5000000);
    }
    
    @Test(priority = 1)
    public void testDivisiBaruKosong() {
        Divisi divisiBaru = new Divisi("HR Division");
        assertEquals(divisiBaru.getJumlahKaryawan(), 0, "Divisi baru harus kosong");
    }
    
    @Test(priority = 2)
    public void testTambahSatuKaryawan() {
        divisiIT.tambahKaryawan(karyawan1);
        assertEquals(divisiIT.getJumlahKaryawan(), 1, "Jumlah karyawan harus 1");
    }
    
    @Test(priority = 3)
    public void testTambahBeberapaKaryawan() {
        divisiIT.tambahKaryawan(karyawan2);
        divisiIT.tambahKaryawan(karyawan3);
        assertEquals(divisiIT.getJumlahKaryawan(), 3, "Jumlah karyawan harus 3");
    }
    
    @Test(priority = 4)
    public void testTambahKaryawanNull() {
        divisiIT.tambahKaryawan(null);
        assertEquals(divisiIT.getJumlahKaryawan(), 3, "Menambah null tidak boleh menambah jumlah");
    }
}
