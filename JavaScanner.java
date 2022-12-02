import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, alamat;
        int kelas;
        double uangsaku;
        // Long hobi;

        System.out.print("Nama : ");
        nama = sc.nextLine();

        // System.out.print("Hobi : ");
        // hobi = sc.nextLong();

        System.out.print("Kelas : ");
        kelas = sc.nextInt();

        System.out.print("Alamat : ");
        alamat = sc.next();
        // karena setelah next tidak ada data lagi, jadi dihentikan dengan next
        // jika next diganti nextLine, baris tersebut akan di skip

        System.out.print("Uang saku : ");
        uangsaku = sc.nextDouble();

        System.out.println("Nama saya " + nama +
                "\nSaya kelas " + kelas +
                "\nSaya beralamat di " + alamat +
                "\nUang saku saya biasanya " + uangsaku);
        sc.close();
    }
}
