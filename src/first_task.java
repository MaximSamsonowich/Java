import java.util.Scanner;

public class first_task {

    static int trigger = 2;

    public static void NaturalOrNot(int element) {
        if (element > 1) {
            if (element % trigger != 0) {
                trigger++;
                NaturalOrNot(element);
            } else if (element % trigger == 0) {
                if (trigger == element) {
                    System.out.println("Число является натуральным.");
                } else {
                    System.out.println("Число не является натуральным.");
                }
            }
        }
    }

    public static void AnyOrOdd(int element) {
        if (element % 2 == 0) {
            System.out.println("Введенное число - четное.");
        } else {
            System.out.println("Введенное число - нечетное.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int element = scan.nextInt();
        AnyOrOdd(element);
        NaturalOrNot(element);
    }
}
