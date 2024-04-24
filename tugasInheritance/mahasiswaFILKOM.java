package tugasInheritance;

public class mahasiswaFILKOM extends manusia{
    private String nim;
    private double ipk;

    public mahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String[] prodi = {"", "Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "", "", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiIndex = Integer.parseInt(String.valueOf(nim.charAt(6)));
        return prodi[prodiIndex] + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + ", NIM: " + nim + ", IPK: " + ipk + ", Status: " + getStatus();
    }
}

