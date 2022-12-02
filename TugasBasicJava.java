import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TugasBasicJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LOGIN
        String nama, password;
        int pin;

        // input data
        System.out.println("Masukkan Nama : ");
        nama = sc.nextLine();
        System.out.println("Masukkan Password : ");
        password = sc.nextLine();
        System.out.println("Masukkan PIN : ");
        pin = sc.nextInt();
        // if else
        if (nama.equals("Administator") && password.length() >= 5 && pin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang!");
            // variable
            int menuAwal = 1;
            int bangun = 1;
            int datar = 1;
            int panjang;
            int lebar;
            int alas;
            int tinggi;
            int r;
            int phi = 22 / 7;
            int ruang = 1;
            int konversi = 1;
            int derajat = 1;
            float celcius;
            int dCelcius = 1;
            int sPanjang = 1;
            float meter;
            int sBerat = 1;
            float gram;
            String nilaiUnik;
            String dataInput;
            int secret = 1;
            do {
                System.out.println(
                        "Silahkan Pilih Menu : \n 1. Bangun Datar/Ruang \n 2. Konverensi \n 3. Secret Menu \n 4. Exit");
                menuAwal = sc.nextInt();

                switch (menuAwal) {
                    // bangun ruang/datar
                    case 1:
                        System.out.println("Bangun Datar/Ruang");
                        do {
                            System.out.println("Silahkan Pilih : \n 1. Luas (Datar) \n 2. Volume (Ruang) \n 3. Exit");
                            bangun = sc.nextInt();
                            switch (bangun) {
                                // luas bangun
                                case 1:
                                    System.out.println("Luas (Datar)");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                                        datar = sc.nextInt();
                                        switch (datar) {
                                            // persegi panjang
                                            case 1:
                                                System.out.println("Persegi Panjang ");
                                                System.out.println("Masukkan panjang (satuan meter) : ");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan lebar (satuan meter) : ");
                                                lebar = sc.nextInt();
                                                System.out.println(
                                                        "Luas Persegi Panjang = " + (2 * (panjang + lebar)) + "m2");
                                                break;
                                            // persegi
                                            case 2:
                                                System.out.println("Persegi ");
                                                System.out.println("Masukkan panjang sisi (satuan meter) : ");
                                                panjang = sc.nextInt();
                                                System.out.println("Luas Persegi  = " + (panjang * panjang) + "m2");
                                                break;
                                            // segitiga
                                            case 3:
                                                System.out.println("Segitiga ");
                                                System.out.println("Masukkan panjang alas (satuan meter) : ");
                                                alas = sc.nextInt();
                                                System.out.println("Masukkan tinggi (satuan meter) :");
                                                tinggi = sc.nextInt();
                                                System.out
                                                        .println("Luas Segitiga  = " + (1 / 2 * alas * tinggi) + "m2");
                                                break;
                                            // lingkaran
                                            case 4:
                                                System.out.println("Lingkaran ");
                                                System.out.println("Masukkan jari-jari (satuan meter) : ");
                                                r = sc.nextInt();
                                                System.out.println("Luas Lingkaran  = " + (phi * r * r) + "m2");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (datar < 5);
                                    break;

                                // volume bangun
                                case 2:
                                    System.out.println("Volume (Ruang)");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                                        ruang = sc.nextInt();
                                        switch (ruang) {
                                            // balok
                                            case 1:
                                                System.out.println("Balok");
                                                System.out.println("Masukkan panjang (satuan meter) : ");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukkan lebar (satuan meter) : ");
                                                lebar = sc.nextInt();
                                                System.out.println("Masukkan tinggi (satuan meter) : ");
                                                tinggi = sc.nextInt();
                                                System.out
                                                        .println("Volume Balok = " + ((panjang * lebar * tinggi) * 1000)
                                                                + "liter");
                                                break;
                                            // kubus
                                            case 2:
                                                System.out.println("Kubus");
                                                System.out.println("Masukkan panjang sisi (satuan meter) : ");
                                                panjang = sc.nextInt();
                                                System.out.println(
                                                        "Volume Kubus = " + ((panjang * panjang * panjang) * 1000)
                                                                + "liter");
                                                break;
                                            // bola
                                            case 3:
                                                System.out.println("Bola");
                                                System.out.println("Masukkan jari-jari (satuan meter) : ");
                                                r = sc.nextInt();
                                                System.out
                                                        .println("Volume Kubus = " + ((4 / 3 * phi * r * r * r) * 1000)
                                                                + "liter");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (ruang < 4);
                                    break;

                                default:
                                    System.out.println("Exit");
                                    break;
                            }

                        } while (bangun < 3);
                        break;

                    // konverensi
                    case 2:
                        System.out.println("Konversi");
                        do {
                            System.out.println("Silahkan Pilih : \n 1. Derajat \n 2. Panjang \n 3. Berat \n 4. Exit");
                            konversi = sc.nextInt();
                            switch (konversi) {
                                // derajat
                                case 1:
                                    System.out.println("Derajat");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Celcius \n 2. Reamur \n 3. Fahrenheit \n 4. Exit");
                                        derajat = sc.nextInt();
                                        switch (derajat) {
                                            // celcius
                                            case 1:
                                                System.out.println("Celcius");
                                                System.out.println("Masukkan derajat Celcius : ");
                                                celcius = sc.nextFloat();
                                                do {
                                                    System.out.println(
                                                            "Pilih Konversi : \n 1. Reamur \n 2. Fahrenheit \n 3. Exit");
                                                    dCelcius = sc.nextInt();
                                                    switch (dCelcius) {
                                                        case 1:
                                                            System.out.println(
                                                                    "Derajat Reamur = " + (4 * celcius / 5) + "°R");
                                                            break;
                                                        case 2:
                                                            System.out.println("Derajat Fahrenheit = "
                                                                    + ((9 * celcius / 5) + 32) + "°F");
                                                            break;
                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }
                                                } while (dCelcius < 3);
                                                break;
                                            // reamur
                                            case 2:
                                                System.out.println("Reamur");
                                                System.out.println("Masukkan derajat Reamur : ");
                                                celcius = sc.nextFloat();
                                                do {
                                                    System.out.println(
                                                            "Pilih Konversi : \n 1. Celcius \n 2. Fahrenheit \n 3. Exit");
                                                    dCelcius = sc.nextInt();
                                                    switch (dCelcius) {
                                                        case 1:
                                                            System.out.println(
                                                                    "Derajat Celsius = " + (5 * celcius / 4) + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Derajat Fahrenheit = "
                                                                    + ((9 * celcius / 4) + 32) + "°F");
                                                            break;
                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }
                                                } while (dCelcius < 3);
                                                break;
                                            // fahrenheit
                                            case 3:
                                                System.out.println("Fahrenheit");
                                                System.out.println("Masukkan derajat Fahrenheit : ");
                                                celcius = sc.nextFloat();
                                                do {
                                                    System.out.println(
                                                            "Pilih Konversi : \n 1. Celcius \n 2. Reamur \n 3. Exit");
                                                    dCelcius = sc.nextInt();
                                                    switch (dCelcius) {
                                                        case 1:
                                                            System.out.println(
                                                                    "Derajat Celsius = " + (5 * (celcius - 32) / 9)
                                                                            + "°C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Derajat Reamur = "
                                                                    + (4 * (celcius - 32) / 9) + "°F");
                                                            break;
                                                        default:
                                                            System.out.println("Exit");
                                                            break;
                                                    }
                                                } while (dCelcius < 3);
                                                break;
                                            default:
                                                break;
                                        }
                                    } while (derajat < 4);
                                    break;
                                // panjang
                                case 2:
                                    System.out.println("Panjang");
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Kilometer \n 2. Hektometer \n 3. Dekameter \n 4. Desimeter \n 5. Sentimeter \n 6. Milimeter \n 7. Exit");
                                        sPanjang = sc.nextInt();
                                        switch (sPanjang) {
                                            case 1:
                                                System.out.println("Kilometer");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter / 1000) + " km");
                                                break;
                                            case 2:
                                                System.out.println("Hektometer");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter / 100) + " hm");
                                                break;
                                            case 3:
                                                System.out.println("Dekameter");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter / 10) + " dam");
                                                break;
                                            case 4:
                                                System.out.println("Desimeter");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter * 10) + " dm");
                                                break;
                                            case 5:
                                                System.out.println("Sentimeter");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter / 100) + " cm");
                                                break;
                                            case 6:
                                                System.out.println("Milimeter");
                                                System.out.println("Masukkan nilai (meter) : ");
                                                meter = sc.nextFloat();
                                                System.out.println("Konversi dari " + meter + " meter" + " = "
                                                        + (meter / 1000) + " mm");
                                                break;
                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (sPanjang < 7);
                                    break;

                                // berat
                                case 3:
                                    System.out.println("Berat");
                                    do {
                                        System.out.println(
                                                "Si;ahkan Pilih : \n 1. Kilogram \n 2. Hektogram \n 3. Dekagram \n 4. Desigram \n 5. Sentigram \n 6. Miligram \n 7. Exit");
                                        sBerat = sc.nextInt();
                                        switch (sBerat) {
                                            case 1:
                                                System.out.println("Kilogram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram / 1000) + " kg");
                                                break;
                                            case 2:
                                                System.out.println("Hektogram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram / 100) + " hg");
                                                break;
                                            case 3:
                                                System.out.println("Dekagram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram / 10) + " dag");
                                                break;
                                            case 4:
                                                System.out.println("Desigram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram * 10) + " dg");
                                                break;
                                            case 5:
                                                System.out.println("Sentigram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram * 100) + " cg");
                                                break;
                                            case 6:
                                                System.out.println("Miligram");
                                                System.out.println("Masukkan nilai (gram) : ");
                                                gram = sc.nextFloat();
                                                System.out.println("Konversi dari " + gram + " gram" + " = "
                                                        + (gram * 1000) + " mg");
                                                break;

                                            default:
                                                System.out.println("Exit");
                                                break;
                                        }
                                    } while (sBerat < 7);
                                    break;

                                default:
                                    break;
                            }
                        } while (konversi < 4);
                        break;

                    // secret menu
                    case 3:
                        System.out.println("Secret Menu");
                        System.out.println("Masukkan Nilai Unik : ");
                        nilaiUnik = sc.next();
                        if (nilaiUnik.length() > 7 && nilaiUnik.length() < 10) {
                            System.out.println("Selamat Datang VIP!!!");
                            do {
                                System.out.println(
                                        "Silahkan Pilih Menu Rahasia : \n 1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit");
                                secret = sc.nextInt();
                                switch (secret) {
                                    case 1:
                                        System.out.println("Uppercase \n Mengubah Huruf menjadi Kapital");
                                        // supaya tidak stuck di atasnya
                                        sc.nextLine();
                                        System.out.println("Masukkan Data : ");
                                        dataInput = sc.nextLine();
                                        System.out.println(dataInput.toUpperCase());
                                        break;
                                    case 2:
                                        System.out.println("Lowercase \n Mengubah Huruf menjadi Kecil");
                                        sc.nextLine();
                                        System.out.println("Masukkan Data : ");
                                        dataInput = sc.nextLine();
                                        System.out.println(dataInput.toLowerCase());
                                        break;
                                    case 3:
                                        System.out.println("Reverse \n Mengubah Susunan Huruf menjadi Terbalik");
                                        sc.nextLine();
                                        System.out.println("Masukkan Data : ");
                                        dataInput = sc.nextLine();
                                        List<String> unik = Arrays.asList(dataInput.split(" "));
                                        Collections.reverse(unik);
                                        System.out.println(
                                                String.join(" ", unik));
                                        break;
                                    default:
                                        break;
                                }
                            } while (secret < 4);
                            break;
                        } else {
                            System.out.println("Akses Ditolak!");
                        }
                }
            } while (menuAwal < 4);

        } else {
            System.out.println("Akses Ditolak!");
            sc.close();
        }
    }

}