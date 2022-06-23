
import java.util.Scanner;

/*   Создать калькулятор для работы с рациональными и комплексными числами, организовать меню, 
добавив в неё систему логирования.
*/

public class Calculator {

    public static void main(String[] args) {

        Scanner ch = new Scanner(System.in);
        System.out.print("Введите 1 для рациональных чисел.\nВведите 2 для комплексных чисел.\nВыбор: ");
        String chois = ch.next();

       

        Input.chois(chois);
        ch.close();
    }

}
