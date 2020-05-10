import java.util.Scanner;

public class second_task {

    static long NOK(long a, long b) {
        return a / NOD(a,b) * b;
    }

    static long NOD(long a, long b) {
        return b == 0 ? a : NOD(b,a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа, над которыми будет выполнена операция:\n A: ");
        long a = scan.nextLong();
        System.out.println("B: ");
        long b = scan.nextLong();
        System.out.println("Выберите операцию:\n1.Нахождение НОК\n2.Нахождение НОД");
        int choose = scan.nextInt();
        switch (choose) {
            case 1: {
                System.out.println(NOK(a, b));
                break;
            }
            case 2: {
                System.out.println(NOD(a, b));
                break;
            }
            default: {
                System.out.println("Некорректный ввод!");
                break;
            }
        }
    }
}
