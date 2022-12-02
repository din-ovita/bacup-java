import java.util.Scanner;

public class LatihanDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hari = 1;
        do {
            System.out.println(
                    "Silahkan Pilih Hari : \n 1. Senin \n 2. Selasa \n 3. Rabu \n 4. Kamis \n 5. Jum'at \n 6. Sabtu \n 7. Minggu ");
            System.out.println("Masukkan Nomer yg Anda Pilih : ");
            hari = sc.nextInt();
            System.out.println(
                    "Sistem Masih Dalam Termasuk Hari ");
            // switch case = program yg dijalankan
            switch (hari) {
                // bentuk case wajib int
                case 1:
                    System.out.println("Senin");
                    break;
                case 2:
                    System.out.println("Selasa");
                    break;
                case 3:
                    System.out.println("Rabu");
                    break;
                case 4:
                    System.out.println("Kamis");
                    break;
                case 5:
                    System.out.println("Jum'at");
                    break;
                case 6:
                    System.out.println("Sabtu");
                    break;
                case 7:
                    System.out.println("Minggu");
                    break;

                default:
                    break;
            }
        } while (hari <= 7);
        System.out.println("Maaf Sistem Bukan Hari");
        sc.close();
    }
}
