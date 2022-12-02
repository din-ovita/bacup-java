// import java.util.Scanner;

// public class Penasaran {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// // login
// String nama, password, pin;
// // int pin;

// // String pin2 = Integer.toString(pin);
// // input data
// System.out.println("Masukkan Nama : ");
// nama = sc.next();
// System.out.println("Masukkan Password : ");
// password = sc.next();
// System.out.println("Masukkan PIN : ");
// pin = sc.next();
// // if else
// if (nama.equals("Administator") && password.length() >= 5 &&
// pin.equals("123456789")) {
// System.out.println("Akses Diterima, Selamat Datang!");
// // menu awal
// int menuAwal = 1;
// int menu = 1;
// int bangun = 1;
// int datar = 1;

// do {
// System.out.println(
// "Silahkan Pilih Menu : \n 1. Bangun Datar/Ruang \n 2.Konversi \n 3.Secret
// Menu \n 4.Exit");
// menu = sc.nextInt();

// switch (menu) {
// // 1. bangun ruang/datar
// case 1:
// System.out.println("1. Bangun Datar/Ruang");
// do {
// System.out.println("Silahkan pilih : \n 1. Luas (Datar) \n 2. Volume (Ruang)
// \n 3. Exit");
// bangun = sc.nextInt();
// switch (bangun) {
// case 1:
// do {
// System.out.println("1. Luas (Datar)");
// System.out.println(
// "1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5.
// Exit");
// datar = sc.nextInt();
// switch (datar) {
// case 1:

// break;

// default:
// break;
// }
// } while (datar < 3);
// break;

// } while (bangun < 3);
// break;

// default:
// break;
// }

// } while (menuAwal < 4);
// } else {
// System.out.println("Akses Ditolak");
// sc.close();
// }
// }
// }

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Penasaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        // String nilaiUnik;
        // int secret = 1;
        // String dataInput;
        // // end
        // System.out.println("Secret Menu");
        // System.out.println("Masukkan Nilai Unik : ");
        // nilaiUnik = sc.next();
        // if (nilaiUnik.length() > 7 && nilaiUnik.length() < 10) {
        // System.out.println("Selamat Datang VIP!!!");
        // do {
        // System.out.println(
        // "Silahkan Pilih Menu Rahasia : \n 1. Uppercase \n 2. Lowercase \n 3. Reverse
        // \n 4. Exit");
        // secret = sc.nextInt();
        // switch (secret) {
        // case 1:
        // System.out.println("Uppercase \n Mengubah Huruf menjadi Kapital");
        // System.out.println("Masukkan Data : ");
        // dataInput = sc.next();
        // System.out.println(dataInput.toUpperCase());
        // break;
        // case 2:
        // System.out.println("Lowercase \n Mengubah Huruf menjadi Kapital");
        // System.out.println("Masukkan Data : ");
        // dataInput = sc.next();
        // System.out.println(dataInput.toLowerCase());
        // break;
        // case 3:
        // System.out.println("Reverse \n Mengubah Susunan Huruf menjadi Terbalik");
        // System.out.println("Masukkan Data : ");
        // dataInput = sc.next();
        // List<String> list = Arrays.asList(dataInput.split(" "));
        // Collections.reverse(list);
        // System.out.println(
        // String.join(" ", list));

        // break;
        // default:
        // System.out.println("Exit");
        // break;
        // }
        // } while (secret < 4);
        // } else {
        // System.out.println("Akses Ditolak!");
        // }

        String variable;
        variable = sc.next();
        System.out.println(Arrays.toString(variable.split("")));
        System.out.println(String.join("_", variable.split(" ")));

        List<String> list = Arrays.asList(variable.split(" "));
        Collections.reverse(list);
        System.out.println(
                String.join(" ", list));
        System.out.println(variable.length());
        System.out.println(variable.toLowerCase());
        System.out.println(variable.toUpperCase());
        sc.close();
    }
}