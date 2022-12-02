import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaString {
    // soal
    public static void main(String[] array) {
        // data variable
        String variable = "Hello World";
        // memasukkan data ke array
        System.out.println(Arrays.toString(variable.split("")));
        // delimeter = untuk memberikan karakter di split
        System.out.println(String.join("_", variable.split(" ")));

        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        List<String> list = Arrays.asList(lorem.split(" "));
        Collections.reverse(list);
        System.out.println(
                String.join(" ", list));
        System.out.println(variable.length());
        System.out.println(variable.toLowerCase());
        System.out.println(variable.toUpperCase());

        // indexOf => untuk mencari letak awal huruf pada kalimat pertama di suatu
        // paragraf yang sedang dicari, jika ada 2 kata sama yg dicari kata yang paling
        // awal
        String Hello = "Hello Hay World say Hay";
        System.out.println(Hello.indexOf("Hay"));
    }
    // reverse = untuk membalik dari paragraf normal
    // length = untuk menghitung karakter dalam data termasuk spasi

    // String UpperCase (Balok) & LowerCase (kecil semua)
}
