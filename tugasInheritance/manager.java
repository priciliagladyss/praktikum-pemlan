package tugasInheritance;

import java.time.LocalDate;

public class manager extends pekerja{
    private String departemen;

    public manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + ( getGaji() * 0.10);
    }

    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }
}