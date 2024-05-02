package tugasInheritance;

import java.time.LocalDate;

public class pekerja extends manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public double getGaji() {
        return gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus(){
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun >= 0 && tahun <= 5){
            return 0.05 * gaji;
        }
        else if (tahun > 5 && tahun <= 10){
            return 0.10 * gaji;
        }
        else if (tahun > 10){
            return 0.15 * gaji;
        }
        else {
            return 0;
        }
    }

    public double getPendapatan(){
        return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }

    public String toString() {
        return super.toString() + ", Tahun Masuk: " + tahunMasuk.getYear() + ", Jumlah Anak: " + jumlahAnak + ", Gaji: $" + getGaji();
    }



}