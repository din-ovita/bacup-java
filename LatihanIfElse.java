import java.util.Scanner;

public class LatihanIfElse {
    public static void main(String[] args) {
        // int A = 8;
        // // IF
        // if (A <= 7) {
        // System.out.println("Siswa A Tidak Terlambat");
        // }
        // if (A >= 7) {
        // System.out.println("Siswa A Terlambat");
        // }

        // // IF ELSE
        // int B = 7;
        // if (B <= 7) {
        // System.out.println("Siswa B Tidak Terlambat");
        // } else {
        // System.out.println("Siswa B Terlambat");
        // }

        // // String
        // String buah = "mangga";
        // if (buah.length() == 5) {
        // System.out.println("Akses diterima");
        // } else {
        // System.out.println("Akses ditolak");
        // }

        // // kondisi IF ELSE IF
        // int jam = 19;
        // if (jam < 17) {
        // System.out.println("Belum Waktunya Pulang");
        // } else if (jam == 17) {
        // System.out.println("Waktunya Pulang");
        // } else if (jam > 18) {
        // System.out.println("Lembur");
        // }

        // // soal
        // int predikat = 90;
        // String predikatA = "A = Baik Sekali";
        // String predikatB = "B = Baik Saja";
        // String predikatC = "C = Kurang Baik";
        // String predikatD = "D = Sangat Kurang Baik";
        // if (predikat > 80) {
        // System.out.println(predikatA);
        // } else if (predikat == 80) {
        // System.out.println(predikatB);
        // } else if (predikat > 60) {
        // System.out.println(predikatC);
        // } else if (predikat < 60) {
        // System.out.println(predikatD);
        // }

        // soal 1
        Scanner sc = new Scanner(System.in);

        int berat;
        String ikanBesar = "Ikan Besar";
        String ikanSedang = "Ikan Sedang";
        String ikanKecil = "Ikan Kecil";

        System.out.print("Berat ikan : ");
        berat = sc.nextInt();

        if (berat > 100) {
            System.out.println(ikanBesar);
        } else if (berat > 75) {
            System.out.println(ikanSedang);
        } else if (berat < 50) {
            System.out.println(ikanKecil);
        }
        // System.out.println( "Jumlah ikan berdasarkan kategori dari data 150kg, 56kg,
        // 77kg, 60kg, 40kg,
        // 90kg, 79kg, 80kg, 99kg, 30kg");
        System.out.println(ikanBesar + " = 1 ikan ");
        System.out.println(ikanSedang + " = 5 ikan");
        System.out.println(ikanKecil + " = 2 ikan");

        // soal 2
        String password;
        System.out.print("Password : ");
        password = sc.next();

        String result = (password.length() == 9 && password.equals("cleopatra")) ? "Selamat Datang Mr. Adam"
                : "Kode salah silahkan coba lagi";
        System.out.println(result);

        // soal 3
        String sandi;

        System.out.print("Sandi : ");
        sandi = sc.next();

        String kerajaan = (sandi.equals("Raja") || sandi.equals("Ratu") || sandi.equals("Pangeran")
                || sandi.equals("Permaisuri"))
                        ? "Selamat Datang " + sandi
                        : "Akses Ditolak";
        System.out.println(kerajaan);
        sc.close();
    }
}
