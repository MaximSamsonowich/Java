import java.util.Scanner;

public class fifth_task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во повторений: ");
        int enter = scan.nextInt();
        for (int track = 0; track < enter; track++) {
            int n = scan.nextInt();
            int n2 = n;
            int n1 = 0;
            while (n != 0) {
                n1 = n1 * 10 + n % 10;
                n /= 10;
            }
            if (n1 == n2) {
                System.out.print(" - это число полиндром\n");
            } else {
                System.out.print(" - это число не полиндром\n");
            }
        }
    }
}

