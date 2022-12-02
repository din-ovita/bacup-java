import java.util.Scanner;

public class JavaDoWhile {
    public static void main(String[] args) {
        // menentukan variable
        int number = 1;
        Scanner sc = new Scanner(System.in);
        // digunakan untuk mengeksekusi data secara terus-menerus
        do {
            System.out.println("Pilih soal di bawah ini : \n 1. Soal 1 \n 2. Soal 2 \n 3. Soal 3 \n 4. Exit");
            // input data
            System.out.println("Masukkan Nomer yang Anda Pilih : ");
            number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Soal 1");
                case 2:
                    System.out.println("Soal 2");
                    break;
                case 3:
                    System.out.println("Soal 3");
                    break;
                // ketika nilai false
                default:
                    break;
            }

            System.out.println("Anda Memilih Soal Nomer " + number);
            // batas memberhentikan sistem
        } while (number < 4);
        // while menjalankan do secara berulang hingga bernilai false
        System.out.println("Exit");
        sc.close();
    }
}
