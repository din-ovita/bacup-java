public class LatihanSoal {
    public static void main(String[] args) {
        // soal ke-1
        // int a = 12, b = 8, c = 5;
        // System.out.println(a + b - c);
        // System.out.println(a * b / c);
        // System.out.println(a + b * c);
        // System.out.println(a + b / c);
        // System.out.println((a + b) * c);
        // System.out.println((a - b) * c);

        // soal ke-2

        // int a = 0;
        // int b = 0;
        // int c = 9;
        // int d = 9;
        // // Print ke 1
        // System.out.println("Print ke 1");
        // System.out.println("A = " + a++);
        // System.out.println("B = " + ++b);
        // System.out.println("C = " + c--);
        // System.out.println("D = " + --d);
        // // Print ke 2
        // System.out.println("Print ke 2");
        // System.out.println("A = " + a++);
        // System.out.println("B = " + ++b);
        // System.out.println("C = " + c--);
        // System.out.println("D = " + --d);
        // // Print ke 3
        // System.out.println("Print ke 3");
        // System.out.println("A = " + a++);
        // System.out.println("B = " + ++b);
        // System.out.println("C = " + c--);
        // System.out.println("D = " + --d);
        // // Print ke 4
        // System.out.println("Print ke 4");
        // System.out.println("A = " + a++);
        // System.out.println("B = " + ++b);
        // System.out.println("C = " + c--);
        // System.out.println("D = " + --d);

        // soal ke-3
        // int a = 10, b = 8, c = 12, d = 5;
        // System.out.println(a > b);
        // System.out.println(b < c);
        // System.out.println((a * 2) >= (b + c));
        // System.out.println((a / d) <= (c - a));
        // System.out.println((a - d) == d);
        // System.out.println((a - b) != (b - d));
        // System.out.println(a > 12);
        // System.out.println(b <= 7);
        // System.out.println(c == 10);
        // System.out.println(d != 5);

        // soal 4
        // int n1 = 10, n2 = 15;
        // int h1 = (n1 + n2) * (n2 + n1);
        // int h2 = (n1 % 4) * n2;
        // System.out.println(h1);
        // System.out.println(h2);

        // soal 5
        int material1 = 290;
        int pindah = 100;
        System.out.println("Jumlah keramik di toko material 1 = " + material1 + " pack keramik");
        System.out.println("Keramik yg dipindah = " + pindah + " pack keramik");
        System.out.println(
                "Sisa keramik yang belum dipindah = " + (material1 - pindah) + " pack keramik yang belum dipindahkan");

        // soal 6
        float harga = 1.750f;
        int uang = 50, buku = 25;
        System.out.println("Uang Hasan = " + uang);
        System.out.println("Buku yg dibeli Hasan = " + buku + " buku");
        System.out.println("Harga 1 buku = " + harga + "ribu");
        System.out.println("Sisa uang Hasan = " + (uang - (buku * harga)) + "ribu");

        // soal 7
        int padiBasah = 850, beratKurang = 75, karung = 25;
        System.out.println("Berat padi basah = " + padiBasah + " kg");
        System.out.println("Setelah dijemur berkurang = " + beratKurang + " kg");
        System.out.println("Jumlah karung = " + karung);
        System.out.println("Berat padi setiap karung = " + ((padiBasah - beratKurang) / karung) + " kg");

        // soal 8
        int jarakGardu = 15, panjangTotal = 1500, biayaPerGardu = 3500;
        int jmlhTukang = 3, biayaPerTukang = 100;
        int hargaTrafo = 15500, biayaTeknisi = 500, projekTrafo = 1;
        int jmlhGardu = panjangTotal / jarakGardu;
        int biayaTukangHarian = jmlhTukang * biayaPerTukang;
        int biayaTukang = jmlhGardu * biayaTukangHarian;
        int biayaGardu = jmlhGardu * biayaPerGardu;
        System.out.println("Jumlah gardu = " + jmlhGardu);
        System.out.println("Biaya gardu = " + biayaGardu + "000");
        System.out.println("Biaya tukang = " + biayaTukang + "000");
        System.out.println("Biaya trafo = " + hargaTrafo + "000");
        System.out.println("Biaya teknisi = " + biayaTeknisi + "000");
        System.out.println("Projek selesai dalam " + (jmlhGardu + projekTrafo) + " hari");
        System.out.println(
                "Total biaya pembuatan gardu = " + (biayaGardu + biayaTukang + hargaTrafo + biayaTeknisi) + "000");
    }
}