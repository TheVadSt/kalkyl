import java.util.Scanner;

public class Calculator {
    static String[] vvod;
    static int number1;
    static int number2;

    public static boolean isInteger(String str, String str1) {
        try {
            Integer.parseInt(str);
            Integer.parseInt(str1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main (String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        try {
            vvod = keyboard.nextLine().split(" ", 3);
            Calculator.isInteger(vvod[0], vvod[2]);
        }
        catch (Exception e){
            System.out.println("Cтрока не является математической операцией");
        }
        boolean isArabskie = Calculator.isInteger(vvod[0], vvod[2]);
        boolean isRimskie = Rimilinet.isRoman(vvod[0], vvod[2]);
        if(isArabskie) {
            number1 = Integer.parseInt(vvod[0]);
            number2 = Integer.parseInt(vvod[2]);

            if (number1 > 10 || number2 > 10 || number1 < 1 || number2 < 1) {
                throw new Exception("Числа принимаемые на вход не более 10, и не менее 1");
            }
            System.out.println(Sign.Yslovie());
        }
        else if (isRimskie) {

            Arabskierimskie.telo(vvod[0], vvod[2]);

        }
        else {
            System.out.println("Нельзя использовать одновременно разные системы счисления или выражение из более 2 цифр");
        }


    }
}



