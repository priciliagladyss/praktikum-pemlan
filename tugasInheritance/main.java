package tugasInheritance;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        System.out.println("=====================" );
        System.out.println("Kelas Manusia");
        System.out.println("=====================" );
        manusia manusia1 = new manusia("agus", true, "456", true);
        System.out.println(manusia1);
        manusia manusia2 = new manusia("ani", false, "123", true);
        System.out.println(manusia2);
        manusia manusia3 = new manusia("siti", false, "789", false);
        System.out.println(manusia3);

        System.out.println("=====================" );
        System.out.println("Kelas mahasiswaFILKOM");
        System.out.println("=====================" );
        mahasiswaFILKOM mahasiswaFILKOM1 = new mahasiswaFILKOM("Pricilia Gladys", true, "35700000000", false, "235150400111029", 2.90);
        System.out.println(mahasiswaFILKOM1);
        mahasiswaFILKOM mahasiswaFILKOM2 = new mahasiswaFILKOM("Budiman", false, "35700000000", true, "235150400111029", 3.10);
        System.out.println(mahasiswaFILKOM2);
        mahasiswaFILKOM mahasiswaFILKOM3 = new mahasiswaFILKOM("Cantika", true, "35700000000", true, "235150400111029", 4.00);
        System.out.println(mahasiswaFILKOM3);

        System.out.println("=====================" );
        System.out.println("Kelas Pekerja");
        System.out.println("=====================" );
        pekerja pekerja1 = new pekerja("Tono", false, "090908",true, 500000.0, LocalDate.of(2022, 01, 01), 2);
        System.out.println(pekerja1);
        pekerja pekerja2 = new pekerja("Tani", false, "090908",false, 500000.0, LocalDate.of(2015, 01, 01), 0);
        System.out.println(pekerja2);
        pekerja pekerja3 = new pekerja("Tina", false, "090908",true, 500000.0, LocalDate.of(2004, 01, 01), 2);
        System.out.println(pekerja3);

        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        manager manager = new manager("Pp", true, "2009", false, 7500, LocalDate.of(2009, 01, 01), 1, "Manager");
        System.out.println(manager);
    }
}

