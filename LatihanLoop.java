public class LatihanLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        for (int a = 1; a <= 20; a++) {
            String result = "";
            if (a % 3 == 0) {
                result += "Fizz";
            }
            if (a % 5 == 0) {
                result += "Buzz";
            }
            if (result.length() == 0) {
                result += a;
            }
            System.out.println(result);
        }
    }
}
// else if bisa sebanyak mungkin
// untuk loop dgn condition pembagian menggunakan > name % 3 == 0
// if = nilai utama
// else akan muncul jika condition atasnya salah