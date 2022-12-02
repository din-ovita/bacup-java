public class JavaOperator {
    public static void main(String[] args) {
        // Operator Aritmatika
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum1 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        // Operator Penugasan/Assigment
        int x = 10;
        x /= 5;
        System.out.println(x);

        // Operator Comparison
        int z = 5;
        int v = 3;
        System.out.println(z < v);

        // Operator Logika
        int a = 5;
        System.out.println(a > 3 && a < 10);
        // mengembalikan true, karena 5 lebih besar dari 3, dan 5 lebih kecil dari 10

        // Operator Logika QR (Logical QR)
        int b = 5;
        System.out.println(b > 3 || b > 10);
        // mengembalikan true, jika salah satu kondisi bernilai benar

        // Operator Logika NOT (Logical NOT)
    }
}
