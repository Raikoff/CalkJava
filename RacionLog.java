
/*
 * Логика просчета  рациональных чисел
 */

public class RacionLog {

    public static void logic(double x, double y, String q) {

        double resul;
        switch (q) {
            case "+":
                resul = x + y;
                System.out.printf("%.2f", resul);

                break;

            case "*":
                resul = x * y;
                System.out.printf("%.2f", resul);

                break;

            case "-":
                resul = x - y;
                System.out.printf("%.2f", resul);

                break;

            case "/":
                resul = x / y;
                System.out.printf("%.2f", resul);

                break;

            default:
                System.out.println("Не верные данные. Введите *,+,-,/");
                break;
        }

    }


    
}
