public class Sign {
    public static int Yslovie() throws Exception {
        int result;
        switch (Calculator.vvod[1]) {
            case "+":
                result = Calculator.number1 + Calculator.number2 ;
                break;
            case "-":
                result = Calculator.number1 - Calculator.number2;
                break;
            case "/":
                result = Calculator.number1 / Calculator.number2;
                break;
            case "*":
                result = Calculator.number1 * Calculator.number2;
                break;
            default:
                throw new Exception("Введен неверный знак, используйте + - * %");
        }
        return result;
    }
}
