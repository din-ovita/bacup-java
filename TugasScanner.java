import java.util.Scanner;

public class TugasScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soal = 1;
        int kalkulator = 1;
        int angka1, angka2;
        int kolam = 1;
        int p, l, t;
        int r, phi = 22 / 7;

        do {
            System.out.println("Silahkan Pilih Soal : \n 1. Soal 1 \n 2. Soal 2 \n 3. Soal 3 \n 4. Exit");
            System.out.println("Masukkan Soal yg Anda Pilih : ");
            soal = sc.nextInt();

            switch (soal) {
                case 1:
                    System.out.println("Soal 1");
                    do {
                        System.out.println(
                                "Silahkan Pilih Jenis Soal : \n 1. Penjumlahan \n 2. Pengurangan \n 3. Perkalian \n 4. Pembagian \n 5. Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        kalkulator = sc.nextInt();
                        switch (kalkulator) {
                            case 1:
                                System.out.println("Penjumlahan");
                                System.out.println("Masukkan angka pertama : ");
                                angka1 = sc.nextInt();

                                System.out.println("Masukkan angka kedua : ");
                                angka2 = sc.nextInt();

                                System.out.println("Hasil Penjumlahan = " + (angka1 + angka2));
                                break;

                            case 2:
                                System.out.println("Pengurangan");
                                System.out.println("Masukkan angka pertama : ");
                                angka1 = sc.nextInt();

                                System.out.println("Masukkan angka kedua : ");
                                angka2 = sc.nextInt();

                                System.out.println("Hasil Pengurangan = " + (angka1 - angka2));
                                break;

                            case 3:
                                System.out.println("Perkalian");
                                System.out.println("Masukkan angka pertama : ");
                                angka1 = sc.nextInt();

                                System.out.println("Masukkan angka kedua : ");
                                angka2 = sc.nextInt();

                                System.out.println("Hasil Perkalian = " + (angka1 * angka2));
                                break;

                            case 4:
                                System.out.println("Pembagian");
                                System.out.println("Masukkan angka pertama : ");
                                angka1 = sc.nextInt();

                                System.out.println("Masukkan angka kedua : ");
                                angka2 = sc.nextInt();

                                System.out.println("Hasil Perkalian = " + (angka1 / angka2));
                                break;

                            default:
                                System.out.println("Exit");
                                break;
                        }
                    } while (kalkulator < 5);
                    break;

                case 2:
                    System.out.println("Soal 2");
                    do {
                        System.out.println("Silahkan Pilih Jenis Kolam : \n 1. Balok \n 2. Tabung \n 3. Exit");
                        System.out.println("Masukkan Pilihan Anda : ");
                        kolam = sc.nextInt();
                        switch (kolam) {
                            case 1:
                                System.out.println("Jenis Kolam Balok");
                                System.out.println("Masukkan panjang kolam : ");
                                p = sc.nextInt();

                                System.out.println("Masukkan lebar kolam : ");
                                l = sc.nextInt();

                                System.out.println("Masukkan tinggi kolam : ");
                                t = sc.nextInt();

                                String Vbalok = ((p * l * t * 1000) > 1000) ? "Volume Telah Memenuhi Standar"
                                        : "Volume Belum Memenuhi Standar";
                                System.out.println(Vbalok);
                                break;

                            case 2:

                                System.out.println("Jenis Kolam Balok");
                                System.out.println("Masukkan jari-jari kolam : ");
                                r = sc.nextInt();

                                System.out.println("Masukkan tinggi kolam : ");
                                t = sc.nextInt();

                                String Vtabung = ((phi * r * r * t * 1000) > 2000) ? "Volume Telah Memenuhi Standar"
                                        : "Volume Belum Memenuhi Standar";
                                System.out.println(Vtabung);
                                break;

                            default:
                                System.out.println("Exit");
                                break;
                        }
                    } while (kolam < 3);
                    break;

                case 3:
                    System.out.println("Soal 3");
                    String nama1, nama2;
                    System.out.println("Masukkan nama depan : ");
                    nama1 = sc.next();

                    System.out.println("Masukkan nama belakang : ");
                    nama2 = sc.next();

                    String akses = ((nama1.length() + nama2.length()) == 25) ? "Akses diterima" : "Akses ditolak";
                    System.out.println(akses);

                    break;

                default:
                    break;
            }

        } while (soal < 4);
        System.out.println("Sistem Berhenti");

        // soal 1
        // float angka, bilangan;
        // System.out.print("Masukkan angka : ");
        // angka = sc.nextFloat();

        // System.out.print("Masukkan angka : ");
        // bilangan = sc.nextFloat();

        // System.out.println("Hasil penjumlahan = " + (angka + bilangan));
        // System.out.println("Hasil pengurangan = " + (angka - bilangan));
        // System.out.println("Hasil perkalian = " + (angka * bilangan));
        // System.out.println("Hasil pembagian = " + (angka / bilangan));

        // // // soal 2
        // int panjang, lebar, tinggi, volume;
        // System.out.println("Masukkan panjang : ");
        // panjang = sc.nextInt();

        // System.out.println("Masukkan lebar : ");
        // lebar = sc.nextInt();

        // System.out.println("Masukkan tinggi : ");
        // tinggi = sc.nextInt();

        // volume = panjang * lebar * tinggi;
        // if (volume >= 2000) {
        // System.out.println("Memenuhi Standar Kolam Tabung");
        // } else if (volume >= 1000) {
        // System.out.println("Memenuhi Standar Kolam Balok");
        // } else {
        // System.out.println("Belum Memenuhi Volume Standar Kolam");
        // }

        // // soal 3
        // String nama1, nama2;
        // System.out.println("Masukkan nama depan : ");
        // nama1 = sc.next();

        // System.out.println("Masukkan nama belakang : ");
        // nama2 = sc.next();

        // String akses = ((nama1.length() + nama2.length()) == 25) ? "Akses diterima" :
        // "Akses ditolak";
        // System.out.println(akses);
        sc.close();
    }
}
