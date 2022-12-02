public class JavaIfElse {
    public static void main(String[] args) {
        // kondisi IF saja
        int A = 6;
        if (A == 5) {
            System.out.println("Benar Nilai Sama");
        }
        if (A == 6) {
            System.out.println("Salah Nilai Tidak Sama");
        }

        // kondisi IF ELSE
        int B = 10;
        if (B > 20) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }

        // Short Hand If Else
        String result = (B > 22) ? "Benar" : "Salah";
        System.out.println(result);

        // String IF ELSE
        String nama = "Dinda";
        if (nama == "Dinda") {
            System.out.println(1);
        }
        if (nama != "Novita") {
            System.out.println(0);
        }

        // kondisi IF ELSE IF
        int jam = 19;
        if (jam < 17) {
            System.out.println("Belum Waktunya Pulang");
        } else if (jam == 17) {
            System.out.println("Waktunya Pulang");
        } else if (jam > 18) {
            System.out.println("Lembur");
        }

    }
}
