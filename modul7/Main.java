package modul7;

public class Main {
    public static void main(String[] args) {
        KuePesanan[] kuePesananArray = new KuePesanan[10];
        KueJadi[] kueJadiArray = new KueJadi[10];
        
        kuePesananArray[0] = new KuePesanan("Kue Pisang", 5000, 0.5);
        kuePesananArray[1] = new KuePesanan("Kue Brownies", 10000, 0.7);
        kuePesananArray[2] = new KuePesanan("Kue Lapis", 8000, 0.2);
        kuePesananArray[3] = new KuePesanan("Kue Bolu", 6000, 0.2);
        kuePesananArray[4] = new KuePesanan("Kue Donat", 7000, 0.3);
        kuePesananArray[5] = new KuePesanan("Kue Keju", 9000, 0.4);
        kuePesananArray[6] = new KuePesanan("Kue Tiramisu", 12000, 0.6);
        kuePesananArray[7] = new KuePesanan("Kue Nastar", 11000, 0.8);
        kuePesananArray[8] = new KuePesanan("Kue Oreo", 13000, 0.9);
        kuePesananArray[9] = new KuePesanan("Kue Red Velvet", 15000, 0.10);

        kueJadiArray[0] = new KueJadi("Kue Coklat", 10000, 2);
        kueJadiArray[1] = new KueJadi("Kue Cheese Cake", 14000, 3);
        kueJadiArray[2] = new KueJadi("Kue Pandan", 7000, 4);
        kueJadiArray[3] = new KueJadi("Kue Blueberry", 12500, 5);
        kueJadiArray[4] = new KueJadi("Kue Strawberry Shortcake", 16000, 6);
        kueJadiArray[5] = new KueJadi("Kue Rainbow Cake", 18000, 7);
        kueJadiArray[6] = new KueJadi("Kue Black Forest", 17000, 8);
        kueJadiArray[7] = new KueJadi("Kue Carrot Cake", 13000, 9);
        kueJadiArray[8] = new KueJadi("Kue Lemon Cake", 14500, 10);
        kueJadiArray[9] = new KueJadi("Kue Matcha Cake", 15000, 11);

        System.out.println("LIST KUE ");
        System.out.println("========================");
        for (KuePesanan kuePesanan : kuePesananArray) {
            if (kuePesanan != null) {
                System.out.println("Nama Kue : " + kuePesanan.getNama());
                System.out.println("Jenis Kue : Kue Pesanan");
                System.out.println("Harga   : " + kuePesanan.getHarga());
                System.out.println();
            }
        }
        for (KueJadi kueJadi : kueJadiArray) {
            if (kueJadi != null) {
                System.out.println("Nama Kue : " + kueJadi.getNama());
                System.out.println("Jenis Kue : Kue Jadi");
                System.out.println("Harga   : " + kueJadi.getHarga());
                System.out.println();
            }
        }
        System.out.println("======================");
        double totalHarga = 0; 
        for (KuePesanan kuePesanan : kuePesananArray) {
            totalHarga += kuePesanan.hitungHarga();
        }
        for (KueJadi kueJadi : kueJadiArray) {
            totalHarga += kueJadi.hitungHarga();
        }
        System.out.println("Total Harga dari Semua Jenis Kue: Rp" + totalHarga);
        System.out.println("=======================");



        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;

        for (KuePesanan kuePesanan : kuePesananArray) {
            totalHargaPesanan += kuePesanan.hitungHarga();
            totalBeratPesanan += kuePesanan.getBerat();
        }

        System.out.println("Total Harga dari Kue Pesanan: Rp " + totalHargaPesanan);
        System.out.println("Total Berat dari Kue Pesanan: " + totalBeratPesanan);

        System.out.println("=======================");

        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        for (KueJadi kueJadi : kueJadiArray) {
            totalHargaJadi += kueJadi.hitungHarga();
            totalJumlahJadi += kueJadi.getJumlah();
        }

        System.out.println("Total Harga dari Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah dari Kue Jadi: " + totalJumlahJadi);
        System.out.println("=======================");


        Kue kueHargaTertinggi = null;
        double hargaTertinggi = 0;
        String jenisKue = "";
        
        for (KuePesanan kuePesanan : kuePesananArray) {
            if (kuePesanan.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kuePesanan.hitungHarga();
                kueHargaTertinggi = kuePesanan;
                jenisKue = "Pesanan";
            }
        }
        
        for (KueJadi kueJadi : kueJadiArray) {
            if (kueJadi.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kueJadi.hitungHarga();
                kueHargaTertinggi = kueJadi;
                jenisKue = "Jadi";
            }
        }
    
        System.out.println("Kue dengan Harga Tertinggi:");
        System.out.println("Nama Kue: " + kueHargaTertinggi.getNama());
        System.out.println("Jenis Kue: " + jenisKue);
        System.out.println("Harga: " + kueHargaTertinggi.hitungHarga());

    }
}