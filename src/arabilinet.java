public class arabilinet {
    public static boolean isInteger(String str, String str2) {
        try {
            Integer.parseInt(str);
            Integer.parseInt(str2);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}