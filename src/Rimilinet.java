import java.util.ArrayList;

public class Rimilinet {
    public static boolean isRoman(String str, String str2) {
        boolean proverka1;
        boolean proverka2;
        boolean result;
       ArrayList<String> Rimilinet = new ArrayList<>(11) {{

           add(0, "null");
            add(1, "I");
            add(2, "II");
            add(3, "III");
            add(4, "IV");
            add(5, "V");
            add(6, "VI");
            add(7, "VII");
            add(8, "VIII");
            add(9, "IX");
            add(10,"X");
        }};
        proverka1 = Rimilinet.contains(str);
        proverka2 = Rimilinet.contains(str2);
        result = proverka1 && proverka2;
        return result;
    }
}